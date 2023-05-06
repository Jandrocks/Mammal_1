public class Bat extends Mammal {
    
        public Bat() {
            energyLevel = 300;
        }
    
        public void fly() {
            System.out.println("El murciélago despega con un sonido aterrador!");
            energyLevel -= 50;
        }
    
        public void eatHumans() {
            System.out.println("Bueno, no importa. El murciélago se ha alimentado de humanos.");
            energyLevel += 25;
        }
    
        public void attackTown() {
            System.out.println("¡La ciudad está en llamas! El murciélago ataca con furia.");
            energyLevel -= 100;
        }
    }
    


