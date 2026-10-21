package playingcard;

public class PlayingCard 
{

    public static void main(String[] args)
    {
       DeckOfCard deck = new DeckOfCard();
       deck.cardShuffle();
       
       for(int i = 0; i<52; i++)
       {
           System.out.printf("%-20s", deck.dealCard());
           if((i+1) % 4 == 0)
           {
               System.out.println("");
           }
       }
    }
      
}

package playingcard;

public class Card 
{
    private String face;
    private String suit;
    
    public Card(String f, String s)
    {
        this.face = f;
        this.suit = s;
    }
    
    @Override
    public String toString()
    {
        return this.face+" of " +this.suit;
        
    }
}

package playingcard;
import java.util.Random;

public class DeckOfCard
{
    private Card[] deck = new Card[52];
    private int currentCard = 0;
    
    public DeckOfCard()
    {
        String [] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String [] face  = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        
        for(int i=0; i<deck.length; i++)
        {
            deck[i] = new Card(face[i%13], suits[i/13]);                  
        }
    }
    
    public void cardShuffle()
    {
        Random rd = new Random();
        for(int i = 0; i<deck.length; i++)
        {
            int j = rd.nextInt(52);
            Card temp = this.deck[i];
            
            this.deck[i] = this.deck[j];
            this.deck[j] = temp;
        }
    }
    
    public Card dealCard()
    {
        if (this.currentCard == 52)
        {
            return null;
        }
        else
        {
            return this.deck[currentCard++];
        }
    }
}   
