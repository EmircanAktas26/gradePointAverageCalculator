/*
* @author Emircan Aktaş - 16.Dec.2022
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Write a program that takes the exam scores of Mathematics, Physics, Chemistry, Turkish, History,
        * Music courses from the user and calculates the averages and prints them on the screen with Java.
        */

        Scanner inp  = new Scanner(System.in);

        System.out.print("Math Score :");
        int math = inp.nextInt();

        System.out.print("Physics Score :");
        int physics = inp.nextInt();

        System.out.print("Chemistry Score :");
        int chemistry = inp.nextInt();

        System.out.print("Turkish Language Score :");
        int turkish = inp.nextInt();

        System.out.print("History Score :");
        int history = inp.nextInt();

        System.out.print("Music Score :");
        int music = inp.nextInt();

        int total = math + physics + chemistry + turkish + history + music;
        int average = total/6;

        String status = (average>=60 )?"passed":"failed";

        System.out.println("Your course average"+ average+" for"+ status);





    }
}