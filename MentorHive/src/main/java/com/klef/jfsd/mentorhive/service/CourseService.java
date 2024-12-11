package com.klef.jfsd.mentorhive.service;

import java.util.List;

import com.klef.jfsd.mentorhive.dto.CourseDTO;
import com.klef.jfsd.mentorhive.entity.Course;
import com.klef.jfsd.mentorhive.entity.Mentor;

public interface CourseService {
	Course createCourse(CourseDTO courseDTO, Long mentorId, List<Long> menteeIds);
	Course createCourse(String courseName, String description, Long mentorId, List<Long> menteeIds);
	List<Course> getCoursesByMentor(Long mentorId);
	List<Course> getCoursesForMentor(Long mentorId);
	List<Course> getCoursesForMentee(Long menteeId);
	void enrollMenteeInCourse(Long courseId, Long menteeId);
	List<Course> findCoursesByMentor(Mentor mentor);
}
