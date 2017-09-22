package com.timbuchalka;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Metodo WHILE convencional");
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count Value Is: " + count);
//            count++;
//        }
//        System.out.println("*******************************");
//
//
//        System.out.println("Fazendo com o metodo WHILE setando true");
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//
//            }
//            System.out.println("Count Value Is: " + count);
//
//            count++;
//        }
//        System.out.println("*******************************");
//
//
//        System.out.println("Fazendo com o metodo FOR");
//        for (int i = 1; i != 6; i++) {
//            System.out.println("Count Value Is: " + i);
//
//        }
//        System.out.println("*******************************");
//
//
//        System.out.println("Fazendo com o metodo DO WHILE");
//        count = 6;
//        do {
//            System.out.println("Count Value Is: " + count);
//            count++;
//            if (count > 100){
//                break;
//            }
//        } while (count != 6);
//        System.out.println("*******************************");
//        int number = 5;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            if (!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//            System.out.println("Even Number " + number);
//            number++;

        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even Number " + number);
            number++;

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }


        }
        System.out.println("The Total Even Numbers Found Was: " + evenNumbersFound);
    }


    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
