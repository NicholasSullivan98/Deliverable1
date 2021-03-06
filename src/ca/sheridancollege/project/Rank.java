/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author Nicholas Sullivan, Saturday Febuary, 27, 2021
 */
public enum Rank {

    ACE(1,"Ace","A"),
    TWO(2,"Two","2"),
    THREE(3,"Three","3"),
    FOUR(4,"Four","4"),
    FIVE(5,"Five","5"),
    SIX(6,"Six","6"),
    SEVEN(7,"Seven","7"),
    EIGHT(8,"Eight","8"),
    NINE(9,"Nine","9"),
    TEN(10,"Ten","T"),
    JACK(10,"Jack","J"),
    QUEEN(10,"Queen","Q"),
    KING(10,"King","K");
    
    private String displayName;
    private double value;
    private String shortName;
    
    public String getDisplayName(){
        return displayName;
    }
    public double getValue(){
        return value;
    }
    public String getShortName(){
        return shortName;
    }
    
    private Rank(double value, String displayName, String shortName){
        this.displayName = displayName;
        this.value = value;
        this.shortName = shortName;
    }
}
