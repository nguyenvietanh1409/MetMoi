package Session3;

import javax.swing.*;

public class TestSwitchEnumeration {
    enum Cards{
        Spade,Heart,Diamond,Club
    }
    public static void main(String[]args){
        Cards cards = Cards.Diamond;
        switch (cards){
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("Heart");
                break;
            case Club:
                System.out.println("Club");
                break;
            case Diamond:
                System.out.println("Diamond");
                break;
        }
    }
}
