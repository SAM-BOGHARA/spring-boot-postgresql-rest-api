package com.group.rest_api_postgres.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class CourseEntity {

    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseid;

    @Column(name = "course_name")
    private String coursename;

    @ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
    @JoinTable(name = "course_coursecontent_mapping", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "content_id"))
    private Set<CourseContentsEntity> courseContentsentity = new HashSet<>();

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Set<CourseContentsEntity> getCourseContentsentity() {
        return courseContentsentity;
    }

    public void setCourseContentsentity(Set<CourseContentsEntity> courseContentsentity) {
        this.courseContentsentity = courseContentsentity;
    }

}
