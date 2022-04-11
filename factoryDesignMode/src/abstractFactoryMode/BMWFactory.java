package abstractFactoryMode;

public class BMWFactory extends AbstractFactory{
    @Override
    public Car getCar(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class cl = Class.forName(type);
        return (BMWCar) cl.newInstance();
    }
}
