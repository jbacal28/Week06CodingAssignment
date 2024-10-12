import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {
  
    //Initiate a deck and Two Players 
   String name1 = "Jhomar";
   String name2 = "Mike";
   
  
   Deck gameDeck = new Deck ();
   gameDeck.shuffle();
   
   
   List<Card> hand1 = new ArrayList<>();
   List<Card> hand2 = new ArrayList<>();
   
   Player player1 = new Player (name1, 0, hand1);
   Player player2 = new Player (name2, 0, hand2);
   
   
   //Traditional Loop - Iterate 52 times calling the draw method
   for (int i=0; i < 52; i++ ) {
     if (i % 2 == 1 ) {
       player1.draw(gameDeck);
     } if (i % 2 == 0) {
       player2.draw(gameDeck);
     }
   }
   
   player1.describe();
   System.out.println("__________________________________________");
   player2.describe();
   
   //Traditional loop -iterate 26 times and call flip method also compare the final score from each player.
   //To print the score and identify the winner.
   for (int i = 0; i < 26; i++) {
     
     System.out.println("__________________________________________");
     System.out.println("SCOREBOARD ROUND " + i);
     System.out.println(player1.getName() + " : " + player1.getScore());
     System.out.println(player2.getName() + " : " + player2.getScore());
     System.out.println("__________________________________________");
     
     
     if(player1.flip(hand1).getValue() > player2.flip(hand2).getValue()) {
       player1.incrementScore(i);
     } else {
       player2.incrementScore(1);
     }
     
   }
   
   System.out.println("+__________________________________________");
   System.out.println("SCOREBOARD ROUND " + 26);
   System.out.println(player1.getName() + " : " + player1.getScore());
   System.out.println(player2.getName() + " : " + player2.getScore());
   System.out.println("__________________________________________");
   
   System.out.println("******************************************");
   
   if (player1.getScore() > player2.getScore() ) {
     System.out.println(player1.getName() + " is the winner!.");
   }else if (player1.getScore() < player2.getScore()) {
     System.out.println(player2.getName() + " is the winner!.");
   } else {
     System.out.println("The game is a draw.");
    
   }
   
  }

}
