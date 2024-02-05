
public class labsoru8 {
	
	    public static void main(String[] args) {
	        int numberRabbits = 1042;
	        int numberBirds = 2272;
	        int year = 0;
	        double reproducedRabbit = 0.038;
	        double reproducedBird = 0.012;

	        while (numberRabbits <= numberBirds) {
	            numberRabbits += (int) (numberRabbits * reproducedRabbit);
	            numberBirds += (int) (numberBirds * reproducedBird);
	            year++;
	        }
	            System.out.println("Number of rabbits: " + numberRabbits);
	            System.out.println("Number of birds: " + numberBirds);
	            System.out.println("After " + year + " years, the number of rabbits will exceed the number of birds.");
	    
	}


}
