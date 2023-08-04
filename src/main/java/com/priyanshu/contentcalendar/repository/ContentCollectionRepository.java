package com.priyanshu.contentcalendar.repository;

import com.priyanshu.contentcalendar.model.Content;
import com.priyanshu.contentcalendar.model.Status;
import com.priyanshu.contentcalendar.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {

    }
    public List<Content> findAll() {
        return contentList;
    }
    public Optional<Content> findById(Integer id){
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init(){
        Content c = new Content(
//                id:
        1,
                 "India to the moon",
//                desc:
        "India's moon exploration program",
                Status.READING,
                Type.HISTORY,
                LocalDateTime.now(),
//                dateUpdated:
        null,
//                url:
        "https://finshots.in/archive/to-the-moon/");

        contentList.add(c);
    }

    public void save(Content content){
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);
    }

    public boolean existsById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
