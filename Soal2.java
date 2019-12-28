package com.gilbertsubay;

import java.util.regex.Pattern;

public class Soal2 {
    public static Boolean Validation(String nama, String umur, String username){
        Pattern specialCharPatten = Pattern.compile("[--. ]", Pattern.CASE_INSENSITIVE);
        Pattern UpperCasePatten = Pattern.compile("[A-Z ]");
        Pattern lowerCasePatten = Pattern.compile("[a-z ]");
        Pattern digitCasePatten = Pattern.compile("[0-9 ]");

        if ((nama.length()>=3) && (!lowerCasePatten.matcher(nama).find())) {
            System.out.println("True");
            return true;
        }
        if ((umur.length()== 2) && (umur.matches("[0-9]+"))){
            System.out.println("True");
            return true;
        }
        if ((username.length()>=4) && (!UpperCasePatten.matcher(username).find()) && (specialCharPatten.matcher(username).find()) && (!digitCasePatten.matcher(username).find())){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
