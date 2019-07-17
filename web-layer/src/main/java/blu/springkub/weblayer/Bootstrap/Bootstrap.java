package blu.springkub.weblayer.Bootstrap;

import blu.springkub.weblayer.Model.Person;
import blu.springkub.weblayer.Repositories.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final PersonRepository personRepository;

    public Bootstrap(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        loadInMemoryPersonData();
    }

    private void loadInMemoryPersonData() {
        if (personRepository.findAll().size() < 1) {
            Person luke = Person.builder().name("Luke").age(19).build();
            Person az = Person.builder().name("Az").age(16).build();
            personRepository.saveAll(Arrays.asList(luke, az));
            log.info("Bootstrap Person Data:", personRepository.findAll());
        }
    }

}
