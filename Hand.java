import java.util.ArrayList;
/**
  A single player's hand of cards
**/
public class Hand{
  private int numCards;
  private ArrayList<Card> cards;

  public Hand(int numCards, ArrayList<Card> cards){
    this.numCards = numCards;
    this.cards = cards;
  }
  
  // getters
  public int getNumCards(){
    return this.numCards;
  }
  public ArrayList<Card> getCards(){
    return this.cards;
  }

  // setters
  public void setNumCards(int numCards){
    this.numCards = numCards;
  }
  public void setCards(ArrayList<Card> cards){
    this.cards = cards;
  }
}