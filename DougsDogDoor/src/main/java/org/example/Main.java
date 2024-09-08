package org.example;

import org.example.Interface.Remote;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        DogDoor door=new DogDoor();
        Remote remote=new Remote(door);

        System.out.println("Fido's Barking");
        remote.pressButton();
        System.out.println("----------------");
        System.out.println("Fido went out");
        remote.pressButton();
        System.out.println("----------------");
        System.out.println("Fido's done");
        remote.pressButton();
        System.out.println("----------------");
        System.out.println("Fido came in");
        remote.pressButton();

    }
}