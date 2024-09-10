package main;

import abiturient.Abitura;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Abitura> abiturients = new ArrayList<>();

        abiturients.add(new Abitura(10001, "Ivanchyk", "Orest", "Yosypovych", "stryska 21", "0961223344", 81.2));
        abiturients.add(new Abitura(10002, "Kachmar", "Igor", "Stepanovych", "lyubinska 22", "0962334456", 70.1));

        while(true){
            //Menu
            System.out.println("\nMenu:");
            System.out.println("1. Add a new abiturient");
            System.out.println("2. Print abiturients");
            System.out.println("3. List of abiturient with the specified name");
            System.out.println("4. List of abiturient whose avarage score is higher than the specified one");
            System.out.println("5. Choose N count abituriens who have the higher score ");
            System.out.println("6. Exit");
            System.out.print(" Choose menu option: ");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    addNewAbiturient(abiturients, scanner);
                    break;
                case 2:
                    printAbiturients(abiturients);
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    printAbiturientsWithName(abiturients, name);
                    break;
                case 4:
                    System.out.print("Enter Avarage score: ");
                    scanner.nextLine();
                    double score = scanner.nextDouble();
                    printAvarageScoreHigherScecified(abiturients, score);
                    break;
                case 5:
                    System.out.print("Enter N: ");
                    scanner.nextLine();
                    int N = scanner.nextInt();
                    printAbituraWithHigherAvarageScore(abiturients, N);
                    break;
                case 6:
                    System.out.println("Program end");
                    scanner.close();
                    return;
                default:
                    System.out.println("Incorrect choose, Try again.");
            }
        }
    }

    public static void printAbiturients(List<Abitura> abiturients){
        for(Abitura abitura: abiturients){
            System.out.println(abitura);
        }
    }

    public static void addNewAbiturient(List<Abitura> abiturients, Scanner scanner){
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter second name: ");
        String second_name = scanner.nextLine();
        System.out.print("Enter adress: ");
        String adress = scanner.nextLine();
        System.out.print("Enter phone: ");
        String phone_num = scanner.nextLine();
        System.out.print("Enter avarage score: ");
        double avarage_score = scanner.nextDouble();

        Abitura newAbitura = new Abitura(id, surname, name, second_name, adress, phone_num, avarage_score);
        abiturients.add(newAbitura);

        System.out.println("Abiturient successfully added!");
    }

    public static void printAbiturientsWithName(List<Abitura> abiturients, String name){
        boolean found = false;
        for(Abitura abitura: abiturients){
            if(abitura.getName().equalsIgnoreCase(name)){
                System.out.println(abitura);
                found = true;
            }
        }
        if(!found){
            System.out.println("There are no abiturients with that name");
        }
    }

    public static void printAvarageScoreHigherScecified(List<Abitura> abiturients, double userScore){
        boolean found = false;
        for(Abitura abitura: abiturients){
            if(abitura.getAvarageScore() > userScore){
                System.out.println(abitura);
                found = true;
            }
        }

        if(!found){
            System.out.println("There are no such abiturients");
        }
    }

    public static void printAbituraWithHigherAvarageScore(List<Abitura> abiturients, int userN){
        Collections.sort(abiturients);

        System.out.println("Top " + userN + " abiturients with highest score:");
        for (int i = 0; i < userN && i < abiturients.size(); i++) {
            System.out.println(abiturients.get(i));
        }
    }
}