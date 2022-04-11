package simpleFactoryMode;

public class Waiter {

    public static final int MENU_MEET = 1;
    public static final int MENU_FISH = 2;
    public static final int MENU_DUCK = 3;

    public static Restaurant getMenu(int menuType) {
        switch (menuType) {
            case MENU_MEET:
                return new Meet();
            case MENU_FISH:
                return new Fish();
            case MENU_DUCK:
                return new Duck();
            default:
                return new Rubbish();
        }
    }
}
