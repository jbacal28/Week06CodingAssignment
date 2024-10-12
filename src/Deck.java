import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
//List of Cards
  List <Card> cards = new ArrayList<Card>();
  
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", 
        "Ten", "Jack", "Queen", "King", "Ace"};
  
Deck ()
{
  for (int v = 2; v < 15; v++) {
    for (int s = 0; s < suits.length; s++) {
      Card c = new Card();
      c.setValue(v);
      c.setName(numbers[v-2] + " of " + suits[s]);
      cards.add(c);
    }
  }
}
//Getters and Setters
public List<Card> getCards() {
  return cards;
}

public void setCards(List<Card> cards) {
  this.cards = cards;
}

public void describe() {
  for (Card card : this.cards) {
    card.describe();
  }
  }
//Shuffle - Randomizes the order of the cards
public void shuffle() {
  Collections.shuffle(this.cards);
}

//Draw (Removes and returns to top cards
public Card draw () {
  Card card = this.cards.remove(0);
  card.describe();
  return card;
}


}


