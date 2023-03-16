package myReflection;

import java.util.List;

public class Course {
    private List<Teacher> teacherLists;
//    private Classroom classroom;
    private int capacity;
    private String address;

    public Course() {
    }

    public Course(List<Teacher> teacherLists, int capacity, String address) {
        this.teacherLists = teacherLists;
        this.capacity = capacity;
        this.address = address;
    }

    public List<Teacher> getTeacherLists() {
        return teacherLists;
    }

    public void setTeacherLists(List<Teacher> teacherLists) {
        this.teacherLists = teacherLists;
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
