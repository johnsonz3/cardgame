import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.HashMap;
/**
  Deck Class is used to track a deck of cards. Currently
  this class has been implemented to initialize a deck of 52 cards.
**/
public class Deck{
  // Arraylist of 52 cards
  private static ArrayList<Card> cards = new ArrayList<Card>();
  // Hashmaps to specify suit and ranks of cards
  HashMap<Integer, String> cardvalues = new HashMap<Integer, String>();
  HashMap<Integer, String> suitvalues = new HashMap<Integer, String>();
  public Deck(){
    this.suitvalues.put(0, "Clubs");
    this.suitvalues.put(1, "Diamonds");
    this.suitvalues.put(2, "Hearts");
    this.suitvalues.put(3, "Spades");
    // Add the numbers 2-10 to hashmap
    for(int k=2;k<11;k++){
      this.cardvalues.put(k, Integer.toString(k));
    }
    this.cardvalues.put(1, "Ace");
    this.cardvalues.put(11, "Jack");
    this.cardvalues.put(12, "Queen");
    this.cardvalues.put(13, "King");
    for(int i = 0; i < 4;i++){
      for(int j = 1; j <= 13; j++){
        Card c1 = new Card(j,i);
        cards.add(c1);
      }
    }
  }
  // Shuffle the deck in O(n) time
  public void shuffle(){
     Collections.shuffle(this.cards);
  }

  // Compare 2 cards and return the highest card
  // return card 1 if they are the same card and card 1's suit is ranked higher
  // else return card 2
  public Card compareCards(Card card1, Card card2){
    if (card1.getRank() > card2.getRank()) {
      return card1;
    } else if (card1.getRank() == card2.getRank()){
      if (card1.getSuit() >= card2.getSuit()) {
        return card1;
      }
    }
    return card2;
  }

  // Sorts the deck according to suit and ranking of the cards
  public void sort(){
   Collections.sort(this.cards, Comparator.comparing(Card::getSuit)
            .thenComparing(Card::getRank));
  }

  /**
    Prints the deck of cards
  **/
  public void printDeck(){
    for(int i = 0; i<this.cards.size();i++){
      String suit = suitvalues.get(cards.get(i).getSuit());
      String value = cardvalues.get(cards.get(i).getRank());
      System.out.println("Suit = "+ suit + ", Value = " + value);
    }
  }
}