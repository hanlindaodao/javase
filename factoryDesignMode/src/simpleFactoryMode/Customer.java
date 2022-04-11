package simpleFactoryMode;

public class Customer {


    public static void main(String[] args) {
        Restaurant restaurant1 = new Meet();
        restaurant1.cook();
        Restaurant restaurant2 = new Duck();
        restaurant2.cook();
    }
}
