/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lr2_house;

/**
 *
 * @author Valchevskyi
 */
public class House {
    private static int counter = -1; // Counter objects for identification.
    private final int id;
    private int number;
    private double square;
    private int level;
    private int countRooms;
    private String street;

    public House(int number, double square, int level, int countRooms, String street) {
        counter++;
        this.id = counter;
        this.number = number;
        this.square = square;
        this.level = level;
        this.countRooms = countRooms;
        this.street = street;
    }

    // Setters and getters.
    public void setNumber(int number) {
        this.number = number;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCountRooms(int countRooms) {
        this.countRooms = countRooms;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public double getSquare() {
        return square;
    }

    public int getLevel() {
        return level;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public String getStreet() {
        return new String(street);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Data house:\n");
        stringBuilder.append("\tID: ").append(id).append("\n");
        stringBuilder.append("\tNumber: ").append(number).append("\n");
        stringBuilder.append("\tSquare: ").append(square).append("\n");
        stringBuilder.append("\tLevel: ").append(level).append("\n");
        stringBuilder.append("\tCount rooms: ").append(countRooms).append("\n");
        stringBuilder.append("\tStreet: ").append(street);
        return stringBuilder.toString();
    }
}
