package com.bootcoding.basic;
import java.util.Scanner;
public class Echo {
    public static void main(String[] args) {
        String line;
        Scanner in=new Scanner(System.in);
        System.out.print("Type Something: ");
        line=in.nextLine();
        System.out.println("You Said: " + line);
        System.out.print("Type Something else: ");
        line=in.nextLine();
        System.out.println("You also Said: " + line);

    }
}
