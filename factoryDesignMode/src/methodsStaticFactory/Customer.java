package methodsStaticFactory;

public class Customer {

    public static void main(String[] args) {
        Restaurant meetCooker = CookFactory.createMeet("δΈεη");
        meetCooker.cook();
        Restaurant duckCooker = CookFactory.creatDuck();
        duckCooker.cook();
        Restaurant fishCooker = CookFactory.creatFish();
        fishCooker.cook();
    }
}
