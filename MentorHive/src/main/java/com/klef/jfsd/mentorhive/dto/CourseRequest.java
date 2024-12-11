package com.klef.jfsd.mentorhive.dto;

import java.util.List;

public class CourseRequest {
    private String courseName;
    private String description;
    private Long mentorId;
    private List<Long> menteeIds;

    // Getters and Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMentorId() {
        return mentorId;
    }

    public void setMentorId(Long mentorId) {
        this.mentorId = mentorId;
    }

    public List<Long> getMenteeIds() {
        return menteeIds;
    }

    public void setMenteeIds(List<Long> menteeIds) {
        this.menteeIds = menteeIds;
    }
}
