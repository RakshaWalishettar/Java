package com.xworkz.Multilevelinheritance.internal;

public class Sport {
    void startMatch() {
        System.out.println("Match has started");
    }
}

class Cricket extends Sport {
    void tossCoin() {
        System.out.println("Tossing the coin before match");
    }
}

class IPLMatch extends Cricket {
    void cheerTeams() {
        System.out.println("Crowd cheering for IPL teams");
    }

    public static void main(String[] args) {
        IPLMatch match = new IPLMatch();
        match.startMatch();
        match.tossCoin();
        match.cheerTeams();
    }
}
