package com.mycompany.concertticketingsystem;

/**
 *
 * @author Joshua Koh
 */
public class Venue {
    private static int count = 1;
    private String id;
    private String name;
    private String address;
    private String type;
    private int capacity;

    // Constructor
    public Venue() {
        this("", "" , "", 0);
    }
    
    public Venue(String name, String location, String type, int capacity) {
        this.id = formatId(count);
        this.name = name;
        this.address = location;
        this.type = type;
        this.capacity = capacity;
        
        count++;
    }
    
    // Getters
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    // Setters
    
    // Methods
    private String formatId(int count) {
        if(count < 10) 
            return "V00" + count;
        else if(count >= 10 && count < 100) 
            return "V0" + count;
        else if(count >= 100 && count < 1000) 
            return "V" + count;
        return "";
    }

}
