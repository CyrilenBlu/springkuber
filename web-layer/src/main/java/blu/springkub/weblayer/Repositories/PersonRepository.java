package blu.springkub.weblayer.Repositories;

import blu.springkub.weblayer.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
