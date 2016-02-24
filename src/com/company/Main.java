package com.company;



import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] alp = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int letter = (int) (Math.random() * alp.length);
        System.out.println(alp[letter]);
        System.out.println("Индекс :" + letter);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String choise = in.nextLine();
        int index = Arrays.asList(alp).indexOf(choise);
        System.out.println("index = " + index);


        if (choise.equals(alp[letter])) {
            System.out.println("You Win");
        }else if (index == -1){
            System.out.println( "no letter");
        } else if( index > letter ) {
            System.out.println(" Try one more the better, letter belong ailphabetical order ");
        } else if (index < letter ) {
            System.out.println(" Try one more the better, letter up ailphabetical order ");
        }



    }
}
