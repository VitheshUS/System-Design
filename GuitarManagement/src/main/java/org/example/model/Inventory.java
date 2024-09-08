package org.example.model;

import org.example.model.Guitar;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitarList;

    public Inventory() {
        this.guitarList = new ArrayList<>();
    }

    public List<Guitar> getGuitarList() {
        return guitarList;
    }

    public void setGuitarList(List<Guitar> guitarList) {
        this.guitarList = guitarList;
    }

    public List<Guitar> searchGuitar(GuitarSpec guitarSpec){
        List<Guitar>list=new ArrayList<>();

        for(Guitar invGuitar:this.guitarList){
            if(guitarSpec.equals(invGuitar))
                list.add(invGuitar);
        }
        return list;
    }
}
