package blu.springkub.restfullayer.Services.impl;

import blu.springkub.restfullayer.Model.Person;
import blu.springkub.restfullayer.Repositories.PersonRepository;
import blu.springkub.restfullayer.Services.PersonService;
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
