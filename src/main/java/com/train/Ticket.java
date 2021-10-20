package com.train;

public class Ticket {
    int alltickets;
    int roundtrip;
    int oneway = 1000;
    int round = 1800;

    public Ticket(int alltickets, int roundtrip) {
        this.alltickets = alltickets;
        this.roundtrip = roundtrip;
    }

    public void print(){
        int total = (alltickets-roundtrip)*oneway+roundtrip*round;
        System.out.println("Total tickets: "+alltickets);
        System.out.println("Round-trip: "+roundtrip);
//        System.out.println("Total: "+((alltickets-roundtrip)*oneway+roundtrip*round));
        System.out.println("Total: "+total);
    }

}
