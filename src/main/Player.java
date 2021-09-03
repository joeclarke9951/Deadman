package main;

import java.util.ArrayList;

public class Player {
    private int id;
    private ArrayList<Card> hand;
    private ArrayList<Card> tableDown;
    private ArrayList<Card> tableUp;

    public Player(int i)
    {
        id = i;
        hand = new ArrayList<Card>();
        tableDown = new ArrayList<Card>();
        tableUp = new ArrayList<Card>();
    }

    public int getId() { return id; }
}
