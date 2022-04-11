package factoryMethodMode;

public class DuckFactory extends CookFactory{
    @Override
    public Restaurant createRestaurant() {
        return new Duck();
    }
}
