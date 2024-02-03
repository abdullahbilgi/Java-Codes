package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cumle girim : ");
        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cumle.length()/2; i++) {
            stack.push(cumle.charAt(i));
        }

        if (isPalindrom(cumle,stack))
            System.out.println("palindrom");
        else
            System.out.println("Palimdrom değil");








    }
    public static boolean isPalindrom(String cumle,Stack<Character> stack)
    {
        for (int i = (cumle.length()/2)+1; i <cumle.length(); i++) {
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }

        }
        return true;
    }
}
