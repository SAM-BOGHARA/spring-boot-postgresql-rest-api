package com.group.rest_api_postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.CourseEntity;


@Repository
public interface CourseRepository extends JpaRepository<CourseEntity,Integer> {
    public CourseEntity findByCourseid(int courseid);
}