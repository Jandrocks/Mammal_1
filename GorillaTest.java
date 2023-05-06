public class GorillaTest {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();

        for (int i = 0; i < 3; i++) {
            gorilla.throwSomething();
        }

        for (int i = 0; i < 2; i++) {
            gorilla.eatBananas();
        }

        gorilla.climb();
        gorilla.displayEnergy();
    }
}
