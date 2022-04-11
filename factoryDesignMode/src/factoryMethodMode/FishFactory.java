package factoryMethodMode;

public class FishFactory extends CookFactory{
    @Override
    public Restaurant createRestaurant() {
        return new Fish();
    }
}
