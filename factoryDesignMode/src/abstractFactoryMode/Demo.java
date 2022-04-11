package abstractFactoryMode;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String pak = "abstractFactoryMode.";

        AbstractFactory abstractFactory1 = FactoryProducer.getFactory(pak + "BMWFactory");

        Car bmwCar1 = abstractFactory1.getCar(pak + "BMW320");
        bmwCar1.drive();

        Car bmwCar2 = abstractFactory1.getCar(pak + "BMW530");
        bmwCar2.drive();

        Car bmwCar3 = abstractFactory1.getCar(pak + "BMW740");
        bmwCar3.drive();


        AbstractFactory abstractFactory2 = FactoryProducer.getFactory(pak + "BenzFactory");

        Car benzCar1 = abstractFactory2.getCar(pak + "BenzC200");
        benzCar1.drive();

        Car benzCar2 = abstractFactory2.getCar(pak + "BenzE300");
        benzCar2.drive();
    }
}
