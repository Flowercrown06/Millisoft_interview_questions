package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        List<? super Developer> developers = employees;
        developers.add(new Developer());
       // developers.add(new Employee());
        // developers.add(new Object());
        Object object = developers.get(0);
       // Employee e = developers.get(0);


        List<Manager> managers =  Arrays.asList(new Manager());
        List<?extends Employee> employees1 = managers;
        for(Employee e : employees1){
            e.introduceUrself();
        }





    }
}
