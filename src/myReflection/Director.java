package myReflection;

/*
    Director代表班级管理员的角色，其主要方法为创建一个课程清单（生成ClassList对象），并传递给administrator
    Director represents the class administrator role and its main method is to create a list of courses
    (generating a ClassList object) and pass it to the administrator
 */
public class Director implements Work{

    @Override
    public void work() throws Exception {
        ClassList list  = new ClassList(2,30);
        new Administrator().handleList(list);
    }

}
