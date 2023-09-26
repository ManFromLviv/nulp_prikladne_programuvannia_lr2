/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lr2;

import java.util.Random;
import lr2_house.House;

/**
 *
 * @author Valchevskyi
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main houses = new Main(5);
        System.out.println(houses + "\n");
        houses.taskA(2);
        System.out.println();
        houses.taskB(1, 4, 8);
        System.out.println();
        houses.taskC(50);
        System.out.println();
    }
    
    // ===========================================================================
    // ===========================================================================
    // ===========================================================================
    
    String[] streets = {"Shevchenka", "Chornovola", "Zernova", "Ivasiuka", "Franka"}; // Array streets (for generation array houses).
    String line = "--------------------------------------------------------"; // Line for output information.
    House[] houses;

    
    private double roundDouble(double number)  { // For round number to x,xx.
        return Math.round(number * 100) / 100.0;
    }

    public Main(int countHouses) {
        houses = new House[countHouses];
        Random random = new Random();
        for (int i = 0; i < countHouses; i++) {
            houses[i] = new House(i + 1, roundDouble(random.nextDouble(99) + 1), random.nextInt(8) + 1, random.nextInt(3) + 1, streets[random.nextInt(streets.length)]);
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("All houses:\n").append(line).append("\n");
        for (House house : houses) {
            stringBuilder.append(house).append("\n").append(line).append("\n");
        }
        stringBuilder.append("Count houses: ").append(houses.length).append("\n").append(line).append("\n");
        return stringBuilder.toString();
    }

    public void taskA(int countRooms) {
        int counter = 0;
        System.out.println("Task A: List houses with count rooms: " + countRooms + "\n" + line);
        for (House house : houses) {
            if (house.getCountRooms() == countRooms) {
                counter++;
                System.out.println(house + "\n" + line);
            }
        }
        outputCountHousesInTask(counter);
        System.out.println(line + "\n");
    }

    public void taskB(int countRooms, int levelMin, int levelMax) {
        int counter = 0;
        System.out.println("Task B: List houses with count rooms: " + countRooms + " and level range: [" + levelMin + "; " + levelMax + "]\n" + line);
        for (House house : houses) {
            if (house.getCountRooms() == countRooms && house.getLevel() >= levelMin && house.getLevel() <= levelMax) {
                counter++;
                System.out.println(house + "\n" + line);
            }
        }
        outputCountHousesInTask(counter);
        System.out.println(line + "\n");
    }

    public void taskC(double square) {
        int counter = 0;
        System.out.println("Task C: List houses where square more: " + square + "\n" + line);
        for (House house : houses) {
            if (house.getSquare() > square) {
                counter++;
                System.out.println(house + "\n" + line);
            }
        }
        outputCountHousesInTask(counter);
        System.out.println(line + "\n");
    }

    private void outputCountHousesInTask(int counter) {
        if (counter == 0) {
            System.out.println("Not houses in this condition!");
        } else {
            System.out.println("Count houses: " + counter);
        }
    }
}
