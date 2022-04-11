
package methodsStaticFactory;

public class Meet implements Restaurant {

    String param;
    public Meet(String param) {
        this.param = param;
    }

    @Override
    public void cook() {
        System.out.println("炒一盘小炒肉" + param);
    }
}
