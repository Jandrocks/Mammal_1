public class Mammal {
    protected int energyLevel;

    public Mammal() {
        energyLevel = 100;
    }

    public int displayEnergy() {
        System.out.println("Nivel de energía: " + energyLevel);
        return energyLevel;
    }
}

class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("El gorila ha lanzado algo!");
        energyLevel -= 5;
    }

    public void eatBananas() {
        System.out.println("El gorila está satisfecho comiendo bananas.");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("El gorila ha trepado a la cima de un árbol.");
        energyLevel -= 10;
    }
}
