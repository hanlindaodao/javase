package simpleFactoryMode;

import org.junit.Test;

public class CustomerTest {

    /**
     * 不带服务员
     */
    @Test
    public void TestCustomerWithoutWaiter() {
        Restaurant restaurant1 = new Meet();
        restaurant1.cook();
        Restaurant restaurant2 = new Duck();
        restaurant2.cook();
    }

    /**
     * 带服务员
     */
    @Test
    public void TestCustomerWithWaiter() {
        Restaurant restaurant = Waiter.getMenu(Waiter.MENU_DUCK);
        restaurant.cook();
    }
}
