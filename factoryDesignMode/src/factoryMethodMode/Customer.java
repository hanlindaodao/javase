package factoryMethodMode;

public class Customer {

    public static void main(String[] args) {
        Restaurant meet = new MeetFactory().createRestaurant();
        meet.cook();
        Restaurant duck = new DuckFactory().createRestaurant();
        duck.cook();
        Restaurant fish = new FishFactory().createRestaurant();
        fish.cook();
    }
}
