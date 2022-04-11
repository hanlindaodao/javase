package abstractFactoryMode;

public abstract class AbstractFactory {

    public abstract Car getCar(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException;
}
