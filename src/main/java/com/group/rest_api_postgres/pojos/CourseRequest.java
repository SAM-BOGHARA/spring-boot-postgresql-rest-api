package com.group.rest_api_postgres.pojos;

import java.util.Set;

import com.group.rest_api_postgres.entities.CourseContentsEntity;

public class CourseRequest {
    
    public int courseid;
    public String coursename;
    public Set<CourseContentsEntity> courseContentsentity;
}
