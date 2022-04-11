package methodsStaticFactory;

public class Customer {

    public static void main(String[] args) {
        Restaurant meetCooker = CookFactory.createMeet("三分熟");
        meetCooker.cook();
        Restaurant duckCooker = CookFactory.creatDuck();
        duckCooker.cook();
        Restaurant fishCooker = CookFactory.creatFish();
        fishCooker.cook();
    }
}
