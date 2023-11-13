package co.develhope.springcalendar.repository;

import co.develhope.springcalendar.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EventsRepository extends JpaRepository<Events, Long> {
}
