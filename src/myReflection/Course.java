package myReflection;

import java.util.List;
/*
    Course代表一个课程的属性，即当管理员完成处理课程清单后，会生成一份课程信息并保存在本地info.txt文件中
    Course represents a property of a course, i.e. when the administrator has finished processing the course list,
    a copy of the course information is generated and saved in the local info.txt file
 */

public class Course {
    private List<Teacher> teacherLists;
    private Classroom classroom;

    public Course() {
    }

    public Course(List<Teacher> teacherLists, Classroom classroom) {
        this.teacherLists = teacherLists;
        this.classroom = classroom;
    }

    public List<Teacher> getTeacherLists() {
        return teacherLists;
    }

    public void setTeacherLists(List<Teacher> teacherLists) {
        this.teacherLists = teacherLists;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Course{" +
                "teacherLists=" + teacherLists +
                ", classroom=" + classroom +
                '}';
    }
}
