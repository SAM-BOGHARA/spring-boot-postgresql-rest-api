package com.group.rest_api_postgres.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group.rest_api_postgres.entities.CourseContentsEntity;
import com.group.rest_api_postgres.entities.CourseEntity;
import com.group.rest_api_postgres.pojos.CourseRequest;
import com.group.rest_api_postgres.repositories.CourseContentsRepository;
import com.group.rest_api_postgres.repositories.CourseRepository;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseContentsRepository courseContentsRepository;

    public CourseService() {
    }

    public CourseEntity addCoursewithContents(CourseRequest courseRequest) {
        CourseEntity course = new CourseEntity();
        course.setCourseid(courseRequest.courseid);
        course.setCoursename(courseRequest.coursename);
        course.setCourseContentsentity(courseRequest.courseContentsentity
                .stream()
                .map(coursecontent -> {
                    CourseContentsEntity ccontents = coursecontent;

                    if (ccontents.getContentid() > 0) {
                        System.out.println("ccontents id : ======================");
                        System.out.println(ccontents.getContentid());

                        ccontents = courseContentsRepository.findByContentid(ccontents.getContentid());
                    }
                    ccontents.addCourse(course);
                    return ccontents;
                })
                .collect(Collectors.toSet()));
        return courseRepository.save(course);
    }
}
