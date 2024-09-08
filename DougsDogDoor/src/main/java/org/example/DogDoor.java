package org.example;

import org.example.Interface.IDogDoor;

public class DogDoor implements IDogDoor {
    private boolean open=false;
    private boolean close=true;
    @Override
    public boolean isOpen() {
        return open;
    }
    @Override
    public void setOpen() {
        if(open)
            System.out.println("The door is already open");
        else{
            open=true;
            close=false;
        }
    }

    @Override
    public boolean isClosed() {
        return close;
    }

    @Override
    public void setClosed() {
        if(close)
            System.out.println("Door is already closed");
        else{
            close=true;
            open=false;
        }
    }
}
