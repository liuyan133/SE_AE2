package myReflection;
/*
    ClassList类表示课程的需求清单，目前假设仅有三个属性，教师人数，教室大小
    The ClassList class represents a list of requirements for a course,
    currently assuming only three attributes, number of teachers, classroom size

 */
public class ClassList {
    private int teacherNumber;
    private int roomCapacity;

    public ClassList(int teacherNumber, int roomCapacity) {
        this.teacherNumber = teacherNumber;
        this.roomCapacity = roomCapacity;
    }

    public int getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(int teacherNumber) {
        this.teacherNumber = teacherNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }
}
