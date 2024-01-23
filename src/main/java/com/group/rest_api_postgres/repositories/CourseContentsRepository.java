package com.group.rest_api_postgres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.group.rest_api_postgres.entities.CourseContentsEntity;

@Repository
public interface CourseContentsRepository extends JpaRepository<CourseContentsEntity, Integer> {
    public CourseContentsEntity findByContentid(int contentid);
}