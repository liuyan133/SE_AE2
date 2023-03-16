package myReflection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Field;
/*
    saveInfo，记录课程所有信息并保存在info.txt文件中 作为数据库的功能
    saveInfo, which records all information about the course and saves it in the info.txt
    file as a database function
 */
public class Util {
    public static void saveInfo(Object o) throws Exception {
        // 1.获取字节码文件的对象
        //Get the object of the bytecode file
        Class aClass = o.getClass();

        // 2.创建IO流
        // 2. Create IO streams
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/info.txt"));

        // 3.获取所有成员变量
        // 3. Get all member variables
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
