package myReflection;

/*
    Director代表班级管理员的角色，其主要方法为创建一个课程清单（生成ClassList对象），并传递给administrator
    Director represents the class administrator role and its main method is to create a list of courses
    (generating a ClassList object) and pass it to the administrator
 */
public class Director implements Work{
    private Course course = null;

    public Director() {
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    @Override
    public Course work() throws Exception {
        ClassList list  = new ClassList(2,30);
        Course course = new Administrator().handleList(list);
        setCourse(course);
        return null;
    }

}
