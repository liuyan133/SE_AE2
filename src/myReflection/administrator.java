package myReflection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class administrator {

    public void handleList(ClassList list) throws Exception {

        int number = list.getTeacherNumber();
        int capacity = list.getRoomCapacity();

        List<Teacher> staffLists = findTeacher(number);

        List<Teacher> teacherLists = trainTeacher(staffLists);

        Course course = finishList(teacherLists,capacity);


        getInfo(course);
//        getInfo(course.getClassroom());

    }

    private List<Teacher> findTeacher(int number) {
        List<Teacher> teacherlists = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            teacherlists.add(new Teacher());
        }
        return teacherlists;
    }

    private List<Teacher> trainTeacher(List<Teacher> teacherlists) {
        for (Teacher item: teacherlists) {
            item.setAge(18);
            item.setName("JACK");
            item.setSalary(50);
        }
        return teacherlists;
    }

    private Course finishList(List<Teacher> teacherLists, int capacity) {
        Course course = new Course();

        course.setTeacherLists(teacherLists);

//        Classroom classroom = new Classroom();
//
//        classroom.setAddress("G4 0DB");
//        classroom.setCapacity(30);

        course.setAddress("G4 0DB");
        course.setCapacity(30);

//        course.setClassroom(classroom);

        return course;
    }

    public static void getInfo(Object o) throws Exception {
        // 1.获取字节码文件的对象
        Class aClass = o.getClass();

        // 2.创建IO流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/a.txt"));

        // 3.获取所有成员变量
        Field[] fields = aClass.getDeclaredFields();

        for (Field field: fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object value = field.get(o);

            bw.write(name+":"+value);
            bw.newLine();
        }
        bw.close();

    }
}
