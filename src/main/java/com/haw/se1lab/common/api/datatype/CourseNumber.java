package com.haw.se1lab.common.api.datatype;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Represents a course number. A course number consists of digits. The maximum
 * number is 2^63 - 1.
 * 
 * @author Arne Busch
 */
// TODO Uncomment Lombok annotations to auto-generate getters/setters/constructors etc. in compiled classes
//import lombok.Value;
//
//@Value
public class CourseNumber {

	/* ---- Member Fields ---- */

	private Long courseNumber;

	/* ---- Constructors ---- */

	public CourseNumber() {
	}

	public CourseNumber(Long courseNumber) {
		this.courseNumber = courseNumber;
	}

	/* ---- Getters/Setters ---- */

	public Long getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(Long courseNumber) {
		this.courseNumber = courseNumber;
	}

	/* ---- Overridden Methods ---- */

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

	/* ---- Custom Methods ---- */

}
