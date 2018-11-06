package com.sparta.jlb.Model;

public enum Suits {

    HEARTS{
        public String getSymbol(){
            return "\u2665";
        }
    },
    SPADES{
        public String getSymbol(){
            return "\u2664";
        }
    },
    DIAMONDS {
        public String getSymbol(){
            return "\u2666";
        }
    },
    CLUBS{
        public String getSymbol(){
            return "\u2667";
        }
    };

    public abstract String getSymbol();

}
