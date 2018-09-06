package com.azhen.refactoring.P6_method;

import java.util.Arrays;
import java.util.List;

public class P40_SubstituteAlgorithm {
    class One{
        String findPerson(String[] people) {
            for (int i = 0; i < people.length; i ++) {
                if (people[i].equals("Don")) {
                    return "Don";
                }
                if (people[i].equals("John")) {
                    return "John";
                }
                if (people[i].equals("Kent")) {
                    return "Kent";
                }
            }
            return "";
        }
    }

    class Two {

        String findPerson(String[] people) {
            List candidates = Arrays.asList("Don", "John", "Kent");
            for (int i = 0; i < people.length; i ++) {
               if (candidates.contains(people[i])) {
                   return people[i];
               }
            }
            return "";
        }
    }
}
