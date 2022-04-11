package abstractFactoryMode;

import java.lang.reflect.Constructor;

public class FactoryProducer {

    public static AbstractFactory getFactory(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class cl = Class.forName(type);
        System.out.println("创建工厂" + type);
        return (AbstractFactory) cl.newInstance();
    }
}
