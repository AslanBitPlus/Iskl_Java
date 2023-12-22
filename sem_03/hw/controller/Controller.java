package sem_03.hw.controller;

import sem_03.hw.view.PersonView;
import sem_03.hw.model.Person;

public class Controller {

    public PersonView personView;

    public Controller(Person person) {
        this.person = person;
    }

    public Person person;

    public Controller() {
    }

    public Controller(PersonView personView) {
        this.personView = personView;
    }


}
