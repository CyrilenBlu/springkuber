package blu.springkub.weblayer.Controllers;

import blu.springkub.weblayer.Services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping("people")
    public String people(Model model) {
        model.addAttribute("people", personService.getAll());
        return "index";
    }
}
