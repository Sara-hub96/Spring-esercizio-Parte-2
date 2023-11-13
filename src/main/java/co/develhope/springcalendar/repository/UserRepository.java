package co.develhope.springcalendar.repository;

import co.develhope.springcalendar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
