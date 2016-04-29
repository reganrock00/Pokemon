import java.util.Scanner;

public class Game
	{
        static String name;
		public static void main(String[] args)
			{
        greetPlayer();
        playgame();
			}
		public static void greetPlayer()
		       {
		    	Scanner userInput =new Scanner (System.in);  
		        System.out.println("Greetings player! What is your name?");
		    	name = userInput.nextLine();
		    	int randomNumber1 = (int)(Math.random()*5);
		    	String [] compliment = {" I like your face!"," I like your socks!"," I like your shirt!"," I like your style!"," that is a nice name!"};
		    	int compliment1 = randomNumber1;
		    	System.out.println("Hello " + name + "," + compliment[compliment1]);
				System.out.println("Please enjoy!");  
		       }
        public static void playgame()
               {
               System.out.println("The board is by rows and columns.");
//               hi how ya doing
               }
	}
