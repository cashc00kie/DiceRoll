package com.company;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
//https://study.com/academy/lesson/java-generate-random-number-between-1-100.html
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How many sides does your dice have?");
        int diceSides = input.nextInt();
        System.out.println("How many times do you want to throw your dice?");
        int times = input.nextInt();

        HashMap<Integer, Integer> dice = new HashMap<>();
    }
}
