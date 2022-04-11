package simpleFactoryMode;

public class Meet implements Restaurant{
    @Override
    public void cook() {
        System.out.println("炒一盘小炒肉");
    }
}
