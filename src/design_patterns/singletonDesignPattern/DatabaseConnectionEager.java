package design_patterns.singletonDesignPattern;

class DatabaseConnectionEager {
    private static final DatabaseConnectionEager instance = new DatabaseConnectionEager();

    private DatabaseConnectionEager() {
        System.out.println("Database connected (Eager)");
    }

    public static DatabaseConnectionEager getInstance() {
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
