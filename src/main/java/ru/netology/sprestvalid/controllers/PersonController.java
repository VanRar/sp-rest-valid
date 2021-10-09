package ru.netology.sprestvalid.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.sprestvalid.model.Person;

import javax.validation.Valid;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@RestController
@Validated
public class PersonController {
    @PostMapping("person")
    public Person getPerson(@PersonResolver @Valid Person person){
        return person;
        //throw new RuntimeException("Error with person");
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.PARAMETER)
    public @interface PersonResolver{

    }
}
