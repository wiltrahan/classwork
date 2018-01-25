package com.wiltrahan;

import java.util.HashMap;
import java.util.Map;

public class Main {
    
//    private static Map<Integer, Celtics> starters;
//    private static Map<Integer, Celtics> reserves;

    public static void main(String[] args) {

        Map<Integer, Celtics>starters = new HashMap<>();
        Map<Integer, Celtics> reserves = new HashMap<>();

        starters.put(0, new Celtics("Jayson Tatum", "Forward", "6 foot 8", "Duke"));
        starters.put(42, new Celtics("Al Horford", "Center", "6 foot 10", "Florida"));
        starters.put(11, new Celtics("Kyrie Irving", "Guard", "6 foot 3", "Duke"));
        starters.put(7, new Celtics("Jaylen Brown", "Guard", "6 foot 7", "California"));
        starters.put(13, new Celtics("Marcus Morris", "Forward", "6 foot 9", "Kansas"));

        reserves.put(46, new Celtics("Aron Baynes", "Center", "6 foot 10", "Washington State"));
        reserves.put(20, new Celtics("Gordon Hayward", "Forward", "6 foot 8", "Butler"));
        reserves.put(27, new Celtics("Daniel Theis", "Forward-Center", "6 foot 9", "Germany"));
        reserves.put(8, new Celtics("Shane Larkin", "Guard", "5 foot 11", "Miami"));
        reserves.put(37, new Celtics("Semi Ojeleye", "Forward", "6 foot 7", "Southern Methodist"));
        reserves.put(12, new Celtics("Terry Rozier", "Guard", "6 foot 2", "Louisville"));
        reserves.put(36, new Celtics("Marcus Smart", "Guard", "6 foot 4", "Oklahoma State"));

        Celtics coach = new Celtics("Brad Stevens", "Head Coach", "5 foot 11", "Baylor");

        printReserves(reserves);
        printStarters(starters);
        printCoach(coach.getName());
    }

    private static void printReserves(Map<Integer, Celtics>bench) {
        //use entrySet() to get both the KEY & VALUE from the HashMap
        System.out.println("\n");
        for(Map.Entry<Integer, Celtics> player : bench.entrySet()) {
            int number = player.getKey();
            Celtics value = player.getValue();
            System.out.println("At " + value.getPosition() + "; " + value.getHeight() + " out of " +
                    value.getSchool() + ", number " + number + "; " + value.getName());

        }
    }

    private static void printStarters(Map<Integer, Celtics>startingFive) {
        String greenBold = "\033[1;32m";
        String reset = "\u001B[0m";

        System.out.println(greenBold + "\nAND NOW...YOUR STARTING LINEUP! (lights down....music up)" + reset);

        for(Map.Entry<Integer, Celtics> player : startingFive.entrySet()) {
            int number = player.getKey();
            Celtics value = player.getValue();
            System.out.println("\nAt " + value.getPosition() + "; " + value.getHeight() + " out of " +
                    value.getSchool() + ", number " + number + "...\n\t\t\t" + greenBold +  value.getName().toUpperCase() + "!!" + reset);
        }
    }

    private static void printCoach(String name) {
        System.out.println("\n(music off, lights on)");
        System.out.println("\nHead Coach " + name);
    }
}

