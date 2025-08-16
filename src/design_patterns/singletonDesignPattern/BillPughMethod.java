package design_patterns.singletonDesignPattern;

public class BillPughMethod {
    private BillPughMethod() {
    }

    private static class SingletonHelper {
        private static final BillPughMethod INSTANCE = new BillPughMethod();
    }

    public static BillPughMethod getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
