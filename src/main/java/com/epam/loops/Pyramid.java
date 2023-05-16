package com.epam.loops;

public class Pyramid {
    private void printSpaces(int i){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
    }

    public void printPyramid(int cathetusLength) {
        for(int i=0; i<cathetusLength; i++){
            printSpaces(cathetusLength-i-1);
            for(int j=0;j<i;j++){
                System.out.print(i+1-j);
            }
            System.out.print(1);
            for (int j=2;j<=i+1;j++){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
