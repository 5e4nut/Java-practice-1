package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Practice 1, Variant 5, Fedorov Ivan, RIBO-01-21");
        System.out.println(workTime(scan()));
    }

    public static int scan() {
        System.out.println("Put in the number of the day: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static String workTime(int day){
        switch (day){
            case 1:
                return("It's Monday you have to work " + 60*60*8 + " seconds.");
            case 2:
                return("It's Tuesday you have to work " + 60*60*8 + " seconds.");
            case 3:
                return("It's Wednesday you have to work " + 60*60*8 + " seconds.");
            case 4:
                return("It's Thursday you have to work " + 60*60*8 + " seconds.");
            case 5:
                return("It's Friday you will only work " + 60*60*6 + " seconds.");
            case 6:
            case 7:
                return("It's weekend you don't need to work today!!");
            default:
                return("There is no such day of week );");

        }
    }
}