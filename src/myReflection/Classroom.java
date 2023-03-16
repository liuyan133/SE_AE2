package myReflection;
/*
    Classroom 代表教室属性，包括教室容量和地址
    Classroom represents classroom properties, including classroom capacity and address
 */
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

    @Override
    public String toString() {
        return "Classroom{" +
                "capacity=" + capacity +
                ", address='" + address + '\'' +
                '}';
    }
}
