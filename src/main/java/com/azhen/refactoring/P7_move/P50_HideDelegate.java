package com.azhen.refactoring.P7_move;

public class P50_HideDelegate {
    static class Person {
        Department department;

        public Department getDepartment() {
            return department;
        }

        public void setDepartment(Department department) {
            this.department = department;
        }
        public Person getManager() {
            return department.getManager();
        }
    }

    static class Department {
        private String chargeCode;
        private Person manager;

        public String getChargeCode() {
            return chargeCode;
        }

        public void setChargeCode(String chargeCode) {
            this.chargeCode = chargeCode;
        }

        public Person getManager() {
            return manager;
        }

        public void setManager(Person manager) {
            this.manager = manager;
        }
    }

    static class One {
        public static void main(String[] args) {
            Person join = new Person();
            Person manager = join.getDepartment().getManager();
        }
    }

    static class Two {
        public static void main(String[] args) {
            Person join = new Person();
            Person manager = join.getManager();
        }
    }
}
