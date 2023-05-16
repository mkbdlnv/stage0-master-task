package com.epam.loops;

public class HalfPyramid {

    private void printSpaces(int i){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
    }


    public void printHalfPyramid(int cathetusLength) {
        for(int i=0; i<cathetusLength; i++){
            printSpaces(cathetusLength-i-1);
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.print('*');

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
