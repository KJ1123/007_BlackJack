import java.util.Scanner;

public class BlackJack{
    public static void main (String [] args){
        //scanner object
        Scanner scnr = new Scanner(System.in);

        boolean gameOver = false; //if the player wants to play again or not 

        while(!gameOver){
            //deck object: deck of cards
            Deck deck = new Deck();

            //unshuffled deck of cards
            System.out.println("Unshuffled deck of cards: ");
            deck.display();

            //shuffled deck of cards
            System.out.println("The shuffled deck: ");
            deck.shuffle();
            deck.display();

            //two hand objects for dealer and player with space for 10 cards
            Hand dealer = new Hand(10);
            Hand player = new Hand(10);

            //deal cards alternately //i dont know how to do this
            dealer.addCard();
            player.addCard();
            dealer.addCard();
            player.addCard();

            int value = 0; //user hand value
            int dealerVal = 0; //dealer hand value 
            String userInput;

            while(value <= 21){
                //display players hand value
                System.out.println("Your current hand: ");
                player.display();

                //get soft value of hand and display
                value = player.getSoftValue();
                dealerVal = dealer.getSoftValue();
                System.out.println("The value of your current hand is: " + value);

                if(value > 16){
                    //ask player if they want to stay or hit 
                    System.out.println("Do you want to Stay or Hit?");
                    userInput = scnr.nextLine();

                    //if hit they continue if stay they leave 
                    if(userInput.equals("Hit")){
                        System.out.println("Hitting...");
                    }   
                    else if(userInput.equals("Stay")){
                        break;
                    }
                    else{
                        System.out.println("Try again. Stay or Hit?");
                    }
                }
                else if(value <= 16){
                    System.out.println("Hitting...");
                }
                else if(dealerVal >= 17){
                    break;
                }
            }

            System.out.println("The value of your current hand is: " + value);
            
            //dealer's hand 
            System.out.println("The dealer's hand: ");
            dealer.display();
            System.out.println("The value of your dealer's hand is: " + dealerVal);

            //determine winner
            winner(value, dealerVal);

            System.out.println("Do you want to play again?");
            userInput = scnr.nextLine();
            if(userInput.equals("yes")){
                gameOver = false;
            }
            else if(userInput.equals("no") || deck.getNextCard() == 52){
                gameOver = true;
                System.out.println("Goodbye");
                break;
            }
            else{
                System.out.println("Yes or no.");
            }
        }

    } 

    public static void winner(int userVal, int dealerVal){
        //determine the winner
        if(userVal > dealerVal){
            System.out.println("The user wins!");
        }
        else if(dealerVal > userVal){
            System.out.println("The dealer wins!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }
}