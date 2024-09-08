package org.example.model;

import org.example.enums.Builder;
import org.example.enums.Type;
import org.example.enums.Wood;

import java.util.Objects;

public class GuitarSpec {
    private Builder builder;
    private Type type;
    private Wood topWood;
    private Wood bottomWood;
    private int numString;

    public GuitarSpec(GuitarSpec spec) {
        this.builder = spec.builder;
        this.type = spec.type;
        this.topWood = spec.topWood;
        this.bottomWood = spec.bottomWood;
        this.numString = spec.numString;
    }

    public GuitarSpec(Builder builder, Type type, Wood topWood, Wood bottomWood, int numString) {
        this.builder = builder;
        this.type = type;
        this.topWood = topWood;
        this.bottomWood = bottomWood;
        this.numString = numString;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public void setTopWood(Wood topWood) {
        this.topWood = topWood;
    }

    public Wood getBottomWood() {
        return bottomWood;
    }

    public void setBottomWood(Wood bottomWood) {
        this.bottomWood = bottomWood;
    }
    public int getNumString() {
        return numString;
    }

    public void setNumString(int numString) {
        this.numString = numString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        GuitarSpec that = (GuitarSpec) o;
        return numString == that.numString && builder == that.builder && type == that.type && topWood == that.topWood && bottomWood == that.bottomWood;
    }

    @Override
    public int hashCode() {
        return Objects.hash(builder, type, topWood, bottomWood, numString);
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder=" + builder +
                ", type=" + type +
                ", topWood=" + topWood +
                ", bottomWood=" + bottomWood +
                ", numString=" + numString +
                '}';
    }
}
