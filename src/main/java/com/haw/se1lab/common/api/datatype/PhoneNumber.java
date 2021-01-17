package com.haw.se1lab.common.api.datatype;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.util.Assert;

/**
 * <p>
 * Represents a phone number in the international phone number format ("+" followed by 2 digits, "-", 2-3 digits, "-"
 * and finally a minimum of 4 digits. Example: +49-170-1234567
 * </p>
 * <p>
 * This is a value type (like e.g. <code>String</code>), i.e. two instances of this class are considered to be equal if
 * their values are equal (although each instance in fact has its own object identity).
 * </p>
 * <p>
 * Instances of this class are immutable, i.e. their values are assigned during construction and may never be changed
 * from there on.
 * </p>
 * 
 * @author Arne Busch
 */
// TODO Uncomment Lombok annotations to auto-generate getters/setters/constructors etc. in compiled classes
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//// the following annotations represent an immutable data type (@Value can't be used, but Hibernate needs an argumentless constructor when deserializing)
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Embeddable // indicates that the type's attributes can be stored in columns of the owning entity's table
public class PhoneNumber {

	/*
	 * Details about JPA annotations can be found here: http://www.java2s.com/Tutorials/Java/JPA/index.htm
	 */

	/*
	 * Details about Lombok annotations can be found here: https://projectlombok.org
	 */

	/* ---- Class Fields ---- */

	/** The pattern for a valid country code. Example: +49 */
	private static final String COUNTRY_CODE_PATTERN = "\\+\\d{2}";

	/** The pattern for a valid area code. Examples: 40, 170, 1805 */
	private static final String AREA_CODE_PATTERN = "\\d{2,4}";

	/** The pattern for a valid subscriber number. Example: 1234567 */
	private static final String SUBSCRIBER_NUMBER_PATTERN = "\\d{4,}";

	/** The pattern for a valid phone number. Example: +49-170-1234567 */
	private static final String PHONE_NUMBER_PATTERN = "^(" + COUNTRY_CODE_PATTERN + ")-(" + AREA_CODE_PATTERN + ")-("
			+ SUBSCRIBER_NUMBER_PATTERN + ")$";

	/* ---- Member Fields ---- */

	// default column name: COUNTRY_CODE
	private String countryCode;

	// default column name: AREA_CODE
	private String areaCode;

	// default column name: SUBSCRIBER_NUMBER
	private String subscriberNumber;

	/* ---- Constructors ---- */

	// default constructor (required by Hibernate)
	PhoneNumber() {
	}

	public PhoneNumber(String phoneNumber) {
		// check preconditions
		Assert.notNull(phoneNumber, "Parameter 'phoneNumber' must not be null!");

		if (!isValid(phoneNumber)) {
			throw new IllegalArgumentException("Invalid phone number: " + phoneNumber);
		}

		Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		matcher.matches();

		countryCode = matcher.group(1);
		areaCode = matcher.group(2);
		subscriberNumber = matcher.group(3);
	}

	public PhoneNumber(String countryCode, String areaCode, String subscriberNumber) {
		// check preconditions
		Assert.notNull(countryCode, "Parameter 'countryCode' must not be null!");
		Assert.notNull(areaCode, "Parameter 'areaCode' must not be null!");
		Assert.notNull(subscriberNumber, "Parameter 'subscriberNumber' must not be null!");

		if (!countryCode.matches(COUNTRY_CODE_PATTERN)) {
			throw new IllegalArgumentException("Invalid country code: " + countryCode);
		}

		if (!areaCode.matches(AREA_CODE_PATTERN)) {
			throw new IllegalArgumentException("Invalid area code: " + areaCode);
		}

		if (!subscriberNumber.matches(SUBSCRIBER_NUMBER_PATTERN)) {
			throw new IllegalArgumentException("Invalid subscriber number: " + subscriberNumber);
		}

		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.subscriberNumber = subscriberNumber;
	}

	/* ---- Getters/Setters ---- */

	public String getCountryCode() {
		return countryCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getSubscriberNumber() {
		return subscriberNumber;
	}

	/* ---- Overridden Methods ---- */

	// overridden, so two instances having the same values are considered as equal
	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	// overridden to improve object representation in logging and debugging
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/* ---- Custom Methods ---- */

	public static boolean isValid(String phoneNumber) {
		if (phoneNumber == null) {
			return false;
		} else {
			return phoneNumber.matches(PHONE_NUMBER_PATTERN);
		}
	}

}
