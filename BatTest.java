public class BatTest {  
        public static void main(String[] args) {
            Bat bat = new Bat();
    
            for (int i = 0; i < 3; i++) {
                bat.attackTown();
            }
    
            for (int i = 0; i < 2; i++) {
                bat.eatHumans();
            }
    
            for (int i = 0; i < 2; i++) {
                bat.fly();
            }
    
            bat.displayEnergy();
        }
    
}
