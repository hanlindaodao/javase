package factoryMethodMode;

public class Duck implements Restaurant {
    @Override
    public void cook() {
        System.out.println("来只北京烤鸭");
    }
}
