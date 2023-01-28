package bg.softuni.pathfinder.model.entities;

import bg.softuni.pathfinder.model.entities.enums.Routes;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private boolean approved; // - Accepts boolean values

    @Column(nullable = false)
    private LocalDateTime created;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String textContent;

    @ManyToOne
    private User author;

    @ManyToOne()
    private Route route;

    public Comments() {
    }

    public long getId() {
        return id;
    }

    public Comments setId(long id) {
        this.id = id;
        return this;
    }

    public boolean isApproved() {
        return approved;
    }

    public Comments setApproved(boolean approved) {
        this.approved = approved;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Comments setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public Comments setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    public User getAuthor() {
        return author;
    }

    public Comments setAuthor(User author) {
        this.author = author;
        return this;
    }

    public Route getRoute() {
        return route;
    }

    public Comments setRoute(Route route) {
        this.route = route;
        return this;
    }
}
