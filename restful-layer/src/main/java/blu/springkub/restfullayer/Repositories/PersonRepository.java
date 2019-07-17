package blu.springkub.restfullayer.Repositories;

import blu.springkub.restfullayer.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
