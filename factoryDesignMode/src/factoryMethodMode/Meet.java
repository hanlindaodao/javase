
package factoryMethodMode;

public class Meet implements Restaurant {

    String param;
    public Meet(String param) {
        this.param = param;
    }

    public Meet() {}

    @Override
    public void cook() {
        if (param == null) {
            System.out.println("炒一盘小炒肉");
        } else {
            System.out.println("炒一盘小炒肉" + param);
        }
    }
}
