import java.util.ArrayList;
import java.util.List;

public class Player {
  

  int score;
  String name;
  
//Hand (List of cards)
  List<Card> hand = new ArrayList<Card>();
  
  //Score -set to 0
 public Player (String name, int score, List <Card> hand) {
   this.name = name;
   this.score = 0;
   
 }

 //getters and setters

public int getScore() {
  return score;
}


public void setScore(int score) {
  this.score = score;
}


public String getName() {
  return name;
}


public void setName(String name) {
  this.name = name;
}


public List<Card> getHand() {
  return hand;
}


public void setHand(List<Card> hand) {
  this.hand = hand;
}


public void describe () {
  System.out.println(this.name + " has a hand of: \n__________________________________________");
  for (Card card : hand) {
    card.describe();
  }
}

//FLIP
public Card flip (List<Card> hand) {
  Card card = this.hand.remove(0);
  System.out.print(name + " : ");
  card.describe();
  return card;
}

//DRAW
public void draw (Deck deck) {
  this.hand.add(deck.draw());
}

//INCREMENT
public void incrementScore (int point) {
  this.score += point;
}

}
