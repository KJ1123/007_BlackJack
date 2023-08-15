public class Hand{
    private Card[] hand; //card objects that represents the current hand
    private int value = 0; //value of hit (soft or hard)

    //one arg constructor to declare hand array to be the length of size
    public Hand(int size){
        hand = new Card[size];
    }

    //display the cards in hand
    public void display(){
        for(Card value: hand){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    //add card to current hand 
    public void addCard(Card add){
        for(int i = 0; i < hand.length; i++){
            if(hand[i] == null){
                hand[i] = add;
                break;
            }
        }
    }

    public int getSoftValue(){
        for(int i = 0; i < hand.length; i++){
            switch(hand[i].charAt(0)){
                case 'A': value += 1; break;
                case '2': value += 2; break;
                case '3': value += 3; break;
                case '4': value += 4; break;
                case '5': value += 5; break;
                case '6': value += 6; break;
                case '7': value += 7; break;
                case '8': value += 8; break;
                case '9': value += 9; break;
                case '1': 
                case 'J': 
                case 'Q': 
                case 'K': value += 10; break;
            }
        }
        return value;
    }

    public int getHardValue(){
        for(int i = 0; i < hand.length; i++){
            switch(hand[i].charAt(0)){
                case 'A': value += 11; break;
                case '2': value += 2; break;
                case '3': value += 3; break;
                case '4': value += 4; break;
                case '5': value += 5; break;
                case '6': value += 6; break;
                case '7': value += 7; break;
                case '8': value += 8; break;
                case '9': value += 9; break;
                case '1': 
                case 'J': 
                case 'Q': 
                case 'K': value += 10; break;
            }
        }
        return value;
    }

}