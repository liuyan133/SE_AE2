package myReflection;

import java.util.ArrayList;
import java.util.List;
/*
    administrator类表示管理员的行为，包括处理清单、招募教师、培训教师、生成课程信息
    The administrator category represents the actions of the administrator,
    including processing lists, recruiting teachers, training teachers, and generating course information
 */
public class Administrator implements Work{
    private Course course;

    /*
    handleList 处理清单，生成教师集合以及教师信息
    handleList processes lists, generates collections of teachers and teacher information
    */
    public Course handleList(ClassList list) throws Exception {

        int number = list.getTeacherNumber();
        int capacity = list.getRoomCapacity();

        List<Teacher> staffLists = findTeacher(number);

        List<Teacher> teacherLists = trainTeacher(staffLists);

        course = finishList(teacherLists,capacity);

        work();

        return course;
    }

    /*
   findTeacher 模拟招募教师的过程 通过清单中的老师人数，生成相同个数的教师对象，并存储到集合中
   findTeacher simulates the process of recruiting teachers by generating the same number of teacher
   objects as the number of teachers in the list and storing them in a collection
   */
    private List<Teacher> findTeacher(int number) {
        List<Teacher> teacherlists = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            Teacher teacher = new Teacher();
            teacherlists.add(teacher);
        }
        return teacherlists;
    }

    /*
    trainTeacher 模拟培训教师的过程 手动给教师对象添加信息
    trainTeacher simulates the process of training teachers by manually
    adding information to the teacher object

    */
    private List<Teacher> trainTeacher(List<Teacher> teacherlists) {
        Teacher teacher1 = new Teacher();

        teacher1.setName("JACK");
        teacher1.setAge(28);
        teacher1.setTeachingHour(50);

        teacherlists.set(0,teacher1);

        Teacher teacher2 = new Teacher();

        teacher2.setName("KIM");
        teacher2.setAge(33);
        teacher2.setTeachingHour(80);
        teacherlists.set(1,teacher2);

        return teacherlists;
    }

    /*
    finishList 完成清单 手动创建教室类
    finishList Complete the list Create the classroom class manually
    */
    private Course finishList(List<Teacher> teacherLists, int capacity) {
        Course course = new Course();

        course.setTeacherLists(teacherLists);

        Classroom classroom = new Classroom(30,"University Ave, Glasgow G12 8QQ");

        course.setClassroom(classroom);

        return course;
    }

    @Override
    public Course work() throws Exception {

        Util.saveInfo(course);

        return null;
    }


}
