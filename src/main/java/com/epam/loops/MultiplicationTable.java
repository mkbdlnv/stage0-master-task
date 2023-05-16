package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for(int i=1;i<=10;i++){
            int mult = i * numberTableToPrint;
            System.out.printf("%d x %d = %d\n", i, numberTableToPrint, mult);
        }
    }

}
