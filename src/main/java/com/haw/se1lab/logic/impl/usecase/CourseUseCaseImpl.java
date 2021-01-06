package com.haw.se1lab.logic.impl.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.haw.se1lab.common.api.datatype.CourseNumber;
import com.haw.se1lab.common.api.datatype.CustomerNumber;
import com.haw.se1lab.common.api.exception.CourseNotFoundException;
import com.haw.se1lab.common.api.exception.CustomerNotFoundException;
import com.haw.se1lab.common.api.exception.MembershipMailNotSentException;
import com.haw.se1lab.dataaccess.api.entity.Course;
import com.haw.se1lab.dataaccess.api.entity.Customer;
import com.haw.se1lab.dataaccess.api.repo.CourseRepository;
import com.haw.se1lab.dataaccess.api.repo.CustomerRepository;
import com.haw.se1lab.logic.api.usecase.CourseUseCase;
import com.haw.se1lab.logic.api.usecase.MailUseCase;

/**
 * Default implementation for {@link CourseUseCase}.
 * 
 * @author Arne Busch
 */
@Service
public class CourseUseCaseImpl implements CourseUseCase {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private MailUseCase mailUseCase;

	@Override
	public void enrollInCourse(CustomerNumber customerNumber, CourseNumber courseNumber)
			throws CustomerNotFoundException, CourseNotFoundException {
		// check preconditions
		Assert.notNull(customerNumber, "Parameter 'customerNumber' must not be null!");
		Assert.notNull(courseNumber, "Parameter 'courseNumber' must not be null!");

		Customer customer = customerRepository.findByCustomerNumber(customerNumber)
				.orElseThrow(() -> new CustomerNotFoundException(customerNumber));
		Course course = courseRepository.findByCourseNumber(courseNumber)
				.orElseThrow(() -> new CourseNotFoundException(courseNumber));

		customer.addCourse(course);
		customerRepository.save(customer);
	}

	@Override
	public void transferCourses(CustomerNumber fromCustomerNumber, CustomerNumber toCustomerNumber)
			throws CustomerNotFoundException {
		// check preconditions
		Assert.notNull(fromCustomerNumber, "Parameter 'fromCustomerNumber' must not be null!");
		Assert.notNull(toCustomerNumber, "Parameter 'toCustomerNumber' must not be null!");

		Customer fromCustomer = customerRepository.findByCustomerNumber(fromCustomerNumber)
				.orElseThrow(() -> new CustomerNotFoundException(fromCustomerNumber));
		Customer toCustomer = customerRepository.findByCustomerNumber(toCustomerNumber)
				.orElseThrow(() -> new CustomerNotFoundException(toCustomerNumber));

		toCustomer.getCourses().addAll(fromCustomer.getCourses());
		fromCustomer.getCourses().clear();

		customerRepository.save(fromCustomer);
		customerRepository.save(toCustomer);
	}

	@Override
	public void cancelMembership(CustomerNumber customerNumber, CourseNumber courseNumber)
			throws CustomerNotFoundException, CourseNotFoundException, MembershipMailNotSentException {
		// check preconditions
		Assert.notNull(customerNumber, "Parameter 'customerNumber' must not be null!");
		Assert.notNull(courseNumber, "Parameter 'courseNumber' must not be null!");

		Customer customer = customerRepository.findByCustomerNumber(customerNumber)
				.orElseThrow(() -> new CustomerNotFoundException(customerNumber));
		Course course = courseRepository.findByCourseNumber(courseNumber)
				.orElseThrow(() -> new CourseNotFoundException(courseNumber));

		boolean courseRemoved = customer.removeCourse(course);

		if (courseRemoved) {
			customerRepository.save(customer);
		}

		String customerEmail = customer.getEmail();

		boolean mailWasSent = mailUseCase.sendMail(customerEmail, "Oh, we're sorry that you canceled your membership!",
				"Some text to make her/him come back again...");

		if (!mailWasSent) {
			// do some error handling here (including e.g. transaction rollback, etc.)
			// ...

			throw new MembershipMailNotSentException(customerEmail);
		}
	}

}
