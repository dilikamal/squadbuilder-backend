package htw.berlin.webtech.teambackend.web.api;

import jakarta.persistence.*;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String content;

    public Post(Long id, String title, String content) {
    }

    public Post(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Post() {

    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
