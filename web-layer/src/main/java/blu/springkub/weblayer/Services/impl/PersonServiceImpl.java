package blu.springkub.weblayer.Services.impl;

import blu.springkub.weblayer.Model.Person;
import blu.springkub.weblayer.Repositories.PersonRepository;
import blu.springkub.weblayer.Services.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();
    }
}
