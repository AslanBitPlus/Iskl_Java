package sem_03.hw.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    private String firstName;
    private String lastName;
    private Character male;
    private String birthDay;
    private Integer telNum;

    public Person(String firstName, String lastName, Character male, String birthDay, Integer telNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.male = male;
        this.birthDay = birthDay;
        this.telNum = telNum;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Character getMale() {
        return male;
    }

    public void setMale(Character male) {
        this.male = male;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getTelNum() {
        return telNum;
    }

    public void setTelNum(Integer telNum) {
        this.telNum = telNum;
    }

    @Override
    public String toString() {
        return  "Имя:     " + firstName + '\n' +
                "Фамилия: " + lastName + '\n' +
                "пол:     " + male + '\n' +
                "Дата р-я:" + birthDay + '\n' +
                "Тел:     " + telNum;
    }
}
