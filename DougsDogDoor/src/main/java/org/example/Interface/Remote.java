package org.example.Interface;

import org.example.DogDoor;

public class Remote {
    private DogDoor door;

    public Remote(DogDoor door) {
        this.door = door;
    }
    public void pressButton(){
        if(door.isOpen()) {
            System.out.println("Door closing ...");
            door.setClosed();
            System.out.println("Door closed");
        }
        else {
            System.out.println("Door opening ...");
            door.setOpen();
            System.out.println("Door opened");
        }
    }
}
