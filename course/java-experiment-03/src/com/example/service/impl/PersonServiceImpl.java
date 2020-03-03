package com.example.service.impl;

import com.example.entity.Person;
import com.example.resourse.Database;
import com.example.service.PersonService;

public abstract class PersonServiceImpl implements PersonService {
    @Override
    public Person findbyusernumber(int usernumber){
        Person person=null;
        for (Person p: Database.getPersons()){
            if(p.getUsernumber()==usernumber)
                person=p;
        }
        return person;
    }

}
