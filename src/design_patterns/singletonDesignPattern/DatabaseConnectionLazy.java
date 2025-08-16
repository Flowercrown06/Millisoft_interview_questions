package design_patterns.singletonDesignPattern;

class DatabaseConnectionLazy {
    private static DatabaseConnectionLazy instance;

    private DatabaseConnectionLazy() {
        System.out.println("Database connected (Lazy)");
    }

    public static DatabaseConnectionLazy getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionLazy();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}