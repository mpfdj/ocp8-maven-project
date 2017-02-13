package com.oracle.advanced.clazz.design.object;

// A hash code is a number that puts instances of a class into a finite number of CATEGORIES (clustering objects)
// The hashcode is just a number (a 32-bit signed integer)
// The hash code is used in hash-based collections, such as HashMap and HashSet.

// For example categorising a deck of cards
// You make 13 piles of cards: All aces on one pile, all twos on another pile, etc
// To get a five of hearts, you can just pull the right card out of the four cards in the pile with fives

// page 19 / 20
// Use instance variables which do not change
// hashCode() can use a SUBSET of the variables that equals() uses
// If equals() is false two object still might have the same hashCode()

// It's common to use a prime number when combining multiple fiels

enum Rank {
    DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
}

enum Suit {
    CLUBS, DIAMONDS, HEARTS, SPADES;
}

class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank r, Suit s) {
        if (r == null || s == null) throw new IllegalArgumentException();
        rank = r;
        suit = s;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Card)) return false;
        Card otherCard = (Card) o;
        return rank.equals(otherCard.rank) && suit.equals(otherCard.suit);
    }

    @Override
    public int hashCode(){
        return rank.hashCode();
    }


}

public class HashCode {
    public static void main(String args[]) {
        Card card = new Card(Rank.ACE, Suit.HEARTS);
        System.out.println(card.hashCode());
    }
}
