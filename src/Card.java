/**
  Card class to keep track of a single card's suit and rank.
**/
public class Card{
  private int rank;
  private int suit;

  public Card(int rank, int suit){
    this.rank = rank;
    this.suit = suit;
  }
  // getters
  public int getRank(){
    return this.rank;
  }
  public int getSuit(){
    return this.suit;
  }
  // setters
  public void setRank(int rank){
    this.rank = rank;
  }

  public void setSuit(int suit){
    this.suit = suit;
  }
}
