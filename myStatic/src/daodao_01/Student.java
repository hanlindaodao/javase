package daodao_01;

public class Student {
    public String name;
    public int age;
    public static String university;
    // static表示共享的


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
