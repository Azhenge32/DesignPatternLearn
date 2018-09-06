package com.azhen.refactoring.P8_data;

public class ReplaceArrayWithObject {
    static class One {
        public static void main(String[] args) {
            String[] row = new String[3];
            row[0] = "Liverpool";
            row[1] = "15";
        }
    }

    static class Performance {
        private String name;
        private String wins;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWins() {
            return wins;
        }

        public void setWins(String wins) {
            this.wins = wins;
        }
    }

    static class Two {
        public static void main(String[] args) {
            Performance row = new Performance();
            row.setName("Liverpool");
            row.setWins("15");
        }
    }
}
