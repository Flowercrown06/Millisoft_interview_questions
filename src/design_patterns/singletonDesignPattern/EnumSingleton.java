package design_patterns.singletonDesignPattern;

public enum EnumSingleton {
    INSTANCE;

    public void connect() {
        System.out.println("Database connected!");
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
