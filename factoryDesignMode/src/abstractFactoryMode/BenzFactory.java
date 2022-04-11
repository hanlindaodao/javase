package abstractFactoryMode;

public class BenzFactory extends AbstractFactory {
    @Override
    public Car getCar(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class cl = Class.forName(type);
        return (BenzCar) cl.newInstance();
    }
}
