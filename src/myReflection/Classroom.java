package myReflection;

import java.util.HashMap;

public class Classroom {
    private int capacity;
    private String address;

    public Classroom() {

    }

    public Classroom(int capacity, String address) {
        this.capacity = capacity;
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
