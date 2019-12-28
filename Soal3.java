package com.gilbertsubay;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();


        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            if ("AEIOUaeiou".indexOf(word.charAt(i)) > -1) {

                sb.append(word.charAt(i));
            }
        }
        for (int i = 0; i < word.length(); i++) {

            if ("BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(word.charAt(i)) > -1) {

                sb.append(word.charAt(i));
            }
        }

        System.out.println(sb.toString());

    }

}
