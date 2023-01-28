package bg.softuni.pathfinder.model.entities;

import bg.softuni.pathfinder.model.entities.enums.Roles;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Roles role;

    public Role(){}

    public long getId() {
        return id;
    }

    public Role setId(long id) {
        this.id = id;
        return this;
    }

    public Roles getRole() {
        return role;
    }

    public Role setRole(Roles role) {
        this.role = role;
        return this;
    }
}
