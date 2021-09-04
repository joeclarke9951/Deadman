package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class Board {
    ArrayList<Player> players;
    LinkedList<Card> deck;
    LinkedList<Card> pile;

    public Board(int num_players)
    {
        //pile starts out empty
        pile = new LinkedList<Card>();

        //initialise the deck
        generateDeck(deck);

        //create the players
        players = new ArrayList<Player>();
        for (int i=0; i < num_players; i++)
        {
            players.add(i, new Player(i));
        }
    }

    private void generateDeck(LinkedList<Card> d)
    {
        Suit s = Suit.SPADES;
        d = new LinkedList<Card>();
        //for every suit, for every value, create a card
        for (int i=0; i<4; i++)
        {
            //add 13 cards for each suit
            for (int j=0; j<13; j++)
            {
                d.add((13 * i) + j, new Card(j, s) );
            }
            //change the suit
            switch (s)
            {
                case SPADES:
                    s = Suit.DIAMONDS;
                    break;
                case DIAMONDS:
                    s = Suit.HEARTS;
                    break;
                case HEARTS:
                    s = Suit.CLUBS;
                    break;
                default:
                    break;
            }
        }

    }

}
