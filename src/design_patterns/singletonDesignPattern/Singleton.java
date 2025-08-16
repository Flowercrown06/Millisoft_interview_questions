package design_patterns.singletonDesignPattern;
// Bu sualda ne problem var?

public class Singleton {
    private static Singleton instance;
    public static Singleton getInstance() {

        if (instance == null) {

            instance = new Singleton();
        }

        return instance;
    }
}
//Bu kod multi-thread mühitində təhlükəsiz deyil.
//İki thread eyni anda getInstance() çağırsa, hər ikisi instance == null şərtini görə bilər və iki ayrı obyekt yaradıla bilər.
//synchronized ilə thread-safe temin etmek olar
//Elave olaraq, private konstruktor da yaradilmalidir
