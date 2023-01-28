package bg.softuni.pathfinder.reporistory;

import bg.softuni.pathfinder.model.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {

    @Query("select r from Route r order by r.comments.size desc")
    List<Route> findMostCommentedRoute();
}
