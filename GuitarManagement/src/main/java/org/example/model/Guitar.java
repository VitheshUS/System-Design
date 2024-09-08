package org.example.model;

import org.example.enums.Builder;
import org.example.enums.Type;
import org.example.enums.Wood;

public class Guitar extends GuitarSpec {
    private String serialNumber;
    private String name;

    public Guitar(String serialNumber, String name,GuitarSpec spec) {
        super(spec);
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                " Serial=" +getSerialNumber()+
                ", Name="+getName()+
                ", builder=" + getBuilder() +
                ", type=" + getType() +
                ", topWood=" + getTopWood() +
                ", bottomWood=" + getBottomWood() +
                ", numString=" + getNumString() +
                '}';
    }
}
