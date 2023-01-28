package bg.softuni.pathfinder.model.entities;

import bg.softuni.pathfinder.model.entities.enums.Routes;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private Routes name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Categories() {
    }

    public long getId() {
        return id;
    }

    public Categories setId(long id) {
        this.id = id;
        return this;
    }

    public Routes getName() {
        return name;
    }

    public Categories setName(Routes name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Categories setDescription(String description) {
        this.description = description;
        return this;
    }
}
