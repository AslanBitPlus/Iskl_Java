package sem_03.hw.view;

import sem_03.hw.model.Person;

public class PersonView {

    public void printPerson(Person person) {
        System.out.println(person.getFirstName() + " " +
                person.getLastName() + "\n " +
                person.getMale() + " " +
                person.getBirthDay() + " " +
                person.getTelNum());
    }
}
