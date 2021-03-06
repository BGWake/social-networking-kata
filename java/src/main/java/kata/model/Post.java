package kata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String content;
    private String time;

    public Post(String username, String content) {
        this.username = username;
        this.content = content;
        this.time = LocalDateTime.now().toString();
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(username, post.username) && Objects.equals(content, post.content) && Objects.equals(time, post.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, content, time);
    }
}
