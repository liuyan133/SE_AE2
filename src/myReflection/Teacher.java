package myReflection;
/*
    Teacher类代表教师对象，其中teachingHour表示教师教学经验，初始化为0，需要通过培训达到一定时长，才可担任教师
    Teacher class represents the teacher object, where teachingHour means the teacher teaching experience,
    initialized to 0, need to reach a certain number of hours through training, before you can be a teacher
 */
public class Teacher {
    private String name;
    private int age;
    private int teachingHour;

    public Teacher(String name, int age, int teachingHour) {
        this.name = name;
        this.age = age;
        this.teachingHour = teachingHour;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teachingHour=" + teachingHour +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTeachingHour() {
        return teachingHour;
    }

    public void setTeachingHour(int teachingHour) {
        this.teachingHour = teachingHour;
    }
}
