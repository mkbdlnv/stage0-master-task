package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        return "This animal is mostly " + color + ". It has " + numberOfPaws + (numberOfPaws==1?" paw ": " paws ")+
                "and " + (hasFur?"a ":"no ") + "fur.";
    }

    public static void main(String[] args) {
        System.out.println(new Animal("red", 1, true).getDescription());
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }
}
