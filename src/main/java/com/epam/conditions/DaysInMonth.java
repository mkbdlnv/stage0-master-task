package com.epam.conditions;

public class DaysInMonth {

    private boolean isLeap(int year){
        if(year%400==0) return true;
        if(year%100==0) return false;
        if(year%4==0) return true;
        return false;
    }

    public void printDays(int year, int month) {
        if(year<0 || month<1 || month>12){
            System.out.println("invalid date");
        } else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==11) {
            System.out.println(31);
        } else if(isLeap(year) && month==2) {
            System.out.println(29);
        } else if(!isLeap(year) && month==2){
            System.out.println(28);
        } else{
            System.out.println(30);
        }
    }

}
