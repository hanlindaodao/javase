package methodsStaticFactory;

public class CookFactory {

    public static Restaurant createMeet(String param) {
        return new Meet(param);
    }

    public static Restaurant creatFish() {
        return new Fish();
    }

    public static Restaurant creatDuck() {
        return new Duck();
    }
}
