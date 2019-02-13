package MemoryLeackReplication;

import model.Person;
import model.PersonPerformance;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    public void noEqualsOrHasImplemented(){
        Map<Person, Integer> map = new HashMap<>();

        for(int i=0; i<100; i++) {
            map.put(new Person("leo"), 1);
            System.out.println("person added: "+ (i+1));
        }

    }

    public void EqualsAndHasImplemented(){
        Map<PersonPerformance, Integer> map = new HashMap<>();

        for(int i=0; i<100; i++) {
            map.put(new PersonPerformance("leo"), 1);
            System.out.println("person added: "+ (i+1));
        }

    }
}
