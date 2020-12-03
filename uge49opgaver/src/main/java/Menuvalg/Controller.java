package Menuvalg;

import java.util.Scanner;

public class Controller {
    Scanner sc = new Scanner(System.in);

    public void runProgram(){
        int choice = 1;
        int value = 5;
        while (choice != value){
            printMenu();
            choice = sc.nextInt();
            switch (choice){
                case 1: calculate();printMenu();break;
                case 2: print();printMenu(); break;
                case 3: help();printMenu();break;
                case 4: exit();break;
                default: exit();break;
            }
        }
    }

    public void printMenu(){
        System.out.println("Vælg");
        System.out.println("1) Beregn ");
        System.out.println("2) Udskriv ");
        System.out.println("3) Hjælp");
        System.out.println("4) Afslut program");
    }

    public void calculate(){
        System.out.println("Beregn");
    }

    public void print(){
        System.out.println("Udskriv");
    }

    public void help(){
        System.out.println("Hjælp");
    }
    public void exit(){
        System.out.println("tryk 5 for at afslutte");
    }
}
