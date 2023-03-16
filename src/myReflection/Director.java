package myReflection;

public class Director {
    public void createList() throws Exception {
        ClassList list  = new ClassList(2,30);
        new administrator().handleList(list);
    }

}
