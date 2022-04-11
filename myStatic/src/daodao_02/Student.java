package daodao_02;

public class Student {
    // 非静态成员变量
    private String name = "123";
    // 静态成员变量
    private static String university = "XDU";

    // 非静态成员方法
    public void show1() {
    }

    // 静态成员方法
    public static void show2() {
    }

    // 非静态尝试
    public void feiJingtai() {
        System.out.println(name);
        System.out.println(university);
        show1();
        show2();
    }

    // 静态尝试
    public static void jingTai() {
//        System.out.println(name);
        System.out.println(university);
//        show1();
        show2();
    }
}
