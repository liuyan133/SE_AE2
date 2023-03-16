package myReflection;

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
