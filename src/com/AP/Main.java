package com.AP;

import java.util.Scanner;

public class Main {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);


        //Registracija
        System.out.println("Reģistrācija");

        // 1. User
        //Vārds
        System.out.println("Lietotāja vārds:");
        String name = sc.nextLine();

        //Parole
        System.out.println("Parole:");
        String pas = sc.nextLine();
        while (pas.length() < 8) {
            System.out.println("Vismaz 8 simboli");
            pas = sc.nextLine();}

        //Epasts
        System.out.println("Epasts:");
        String email = sc.nextLine();
//            while (email.length() < 10) {
//                System.out.println("Vismaz 10 simboli");
//                email = sc.nextLine();}

        System.out.println(name);
        System.out.println(pas);
        System.out.println(email);
        System.out.println("Reģistrācija veiksmīga!");

        //Login
        System.out.println("Ievadiet lietotājvārdu");
        String logname = sc.nextLine();

        System.out.println("Ievadiet paroli");
        String logpas = sc.nextLine();

        if (logname == logname) {    // && ir un; || ir vai; ! ir not
            System.out.println("Welcome" + " " + " " + logname);
        } else {
            System.out.println("Mēģiniet vēlreiz");}

        // Profils
        System.out.println("Čau!");
        System.out.println(name);
        System.out.println(email);
        System.out.println(pas);

        //Logout
        System.out.println("Iziet y/n");
        String exit = sc.nextLine();
        if (exit.equals("y")) {
            System.out.println("Tiekamies rīt!");}
    }
}