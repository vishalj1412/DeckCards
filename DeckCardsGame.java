package javasimpple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class DeckCardsGame {

    public void deckCards(){
        /*
        Initialize suit and rank;
         */
        String suit[]={"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[]={"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        /*
        Initialization of ArrayList
         */

        ArrayList<String> suits=new ArrayList<>();
        ArrayList<String> ranks=new ArrayList<>();
        /*
        Adding suit and rank in Arraylist
         */
        suits.addAll(Arrays.asList(suit));
        ranks.addAll(Arrays.asList(rank));
        /*
        print game started
         */
        System.out.println("*****************************************"+"\n"+
                "GAME STARTED"+"\n"+"****************************");
        /*
        create HashSet for check uniqueness
         */
        HashSet<String> deck=new HashSet<>();
        for(int i=0;i<suit.length;i++){
            for(int j=0;j<rank.length;j++){
                /*
                Assign suits to rank
                 */
                deck.add(suits.get(i)+"\tof\t"+ranks.get(j));
                for(String cards:deck){


                }
            }
        }
        /*
        check size of deck it must be 52
         */
        System.out.println("Size"+deck.size());
    }
    public static void main(String args[]){
        DeckCardsGame card=new DeckCardsGame();
        card.deckCards();
    }
}
