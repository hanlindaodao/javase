package simpleFactoryMode;

public class Rubbish implements Restaurant{
    @Override
    public void cook() {
        System.out.println("你是来消遣我的？");
    }
}
