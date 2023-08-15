import java.util.Random;

public class Deck{
    //data fields
    private Card[] deck = new Card[52]; //an array of card objects, length: 52
    private int nextCard; //counter to keep track of cards as they are dealt, to let you know which card to deal next
    
    //random object
    Random rand = new Random();

    //no arg constructor to initializes the cards array
    public Deck(){
        int counter = 0;
        for(int s = 0; s < 3; s++){
            for(int r = 1; r <=13; r++){
                deck[counter] = new Card(r, s);
                counter++;
            }
        }
        //deck = {"AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", 
        //"QC", "KC", "AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", 
        //"JH", "QH", "KH", "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", 
        //"10S", "JS", "QS", "KS", "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", 
        //"9D", "10D", "JD", "QD", "KD"};
        /*for(int i = 0; i < suitName.length; i++){
            for(int x = 0; x < rankName.length; x++){
                deck[rankName.length*i + x] = suitName[i] + rankName[x];  
            }
        }*/
    }

    //shuffle deck of cards
    public void shuffle(){
        for(int x = 0; x < 100; x++){
            int randNum = rand.nextInt(51);
            Card swap = deck[randNum];
            deck[randNum] = deck[0];
            deck[0] = swap;
        }
    }

    //deal cards
    public int dealCard(){
        return nextCard++;
    }

    //display cards
    public void display(){
        for(Card values: deck){
            System.out.print(deck + " ");
        }
        System.out.println();
    }

    //getter methods
    //get NextCard value
    public int getNextCard(){
        return nextCard;
    }
    
}