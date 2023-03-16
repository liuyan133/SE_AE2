package myReflection;

public class Teacher {
    private String name;
    private int age;
    private int salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    public void teach() {
        System.out.println("Teacher can teach!");
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Teacher() {
    }

    public Teacher(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
