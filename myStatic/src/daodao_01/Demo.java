package daodao_01;

/**
 * static表示共享
 */
public class Demo {
    public static void main(String[] args) {
        Student.university = "XDU";
        Student s1 = new Student();
        s1.name = "name1";
        s1.age = 1;
//        s1.university = "XDU";
//        s1.university = "aaa";

        System.out.println(s1);

        Student s2 = new Student();
        s2.name = "name2";
        s2.age = 2;
//        s2.university = "XDU";

        System.out.println(s2);


    }
}
