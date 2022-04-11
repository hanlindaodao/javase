package factoryMethodMode;


public class MeetFactory extends CookFactory{

    @Override
    public Restaurant createRestaurant() {
        return new Meet();
    }
}
