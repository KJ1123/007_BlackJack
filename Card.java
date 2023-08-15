public class Card{
    //data fields
    private int rank; //rank of the cards 0-12 (A-K)
    private int suit; //suit of the cards 0-3 (C,H,S,D)
    private String[] rankName = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; //holds the face value of the cards in order from lowest to highest
    private String[] suitName = {"C", "H", "S", "D"}; //holding the suit values 

    //two arg constructor to assign rank and suit
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    //getter methods:
    //get rank
    public int getRank(){
        return rank;
    }

    //get suit
    public int getSuit(){
        return suit;
    }

    //get rankName
    public String[] getRankName(){
        return rankName;
    }

    //get suitName
    public String[] getSuitName(){
        return suitName;
    }

    //charAt method for card
    public char charAt(int index){
        return rankName[rank].charAt(index);
    }

}