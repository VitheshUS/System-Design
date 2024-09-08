package org.example;

import org.example.enums.Builder;
import org.example.enums.Type;
import org.example.enums.Wood;
import org.example.model.Guitar;
import org.example.model.GuitarSpec;
import org.example.model.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void initializeInventory(Inventory inventory){
        Guitar g1=new Guitar("","urus",new GuitarSpec(
                Builder.MARTIN,             // builder
                Type.ACOUSTIC,              // type
                Wood.SITKA,                 // topWood
                Wood.BRAZILIAN_ROSEWOOD,     // bottomWood
                12
        ));
        inventory.getGuitarList().add(g1);
    }
    public static void searchGuitar(Inventory inventory){
        GuitarSpec spec=new GuitarSpec(
                Builder.MARTIN,             // builder
                Type.ACOUSTIC,              // type
                Wood.SITKA,                 // topWood
                Wood.BRAZILIAN_ROSEWOOD,     // bottomWood
                12
        );
        System.out.println(spec);
        List<Guitar>searchResult=inventory.searchGuitar(spec);
        System.out.println("We have found "+searchResult.size()+" Guitars for you!");

        searchResult.forEach(guitar -> {
            System.out.println(guitar);
            System.out.println();
        });
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Inventory inventory=new Inventory();
        initializeInventory(inventory);
        while(true) {
            System.out.println("1. Search for a guitar?");
            System.out.println("2. Exit");
            switch (s.nextInt()) {
                case 1:
                    searchGuitar(inventory);
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }
}