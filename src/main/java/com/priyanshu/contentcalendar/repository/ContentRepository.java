package com.priyanshu.contentcalendar.repository;

import com.priyanshu.contentcalendar.model.Content;
import com.priyanshu.contentcalendar.model.Status;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
//    declaring an abstract method
    List<Content> findAllByTitleContains(String keyword);

//    query annotation for running custom queries
    @Query("""
        SELECT * FROM Content
        where status = :status   
        """)
    List<Content> listByStatus(@Param("status") Status status);
}