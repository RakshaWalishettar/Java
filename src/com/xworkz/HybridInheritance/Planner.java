package com.xworkz.HybridInheritance;

public interface Planner {
    void planEvent();
}

interface Coordinator {
    void manageGuests();
}

class EventManager implements Planner, Coordinator {
    public void planEvent() {
        System.out.println("Planning a corporate event with detailed schedule");
    }

    public void manageGuests() {
        System.out.println("Managing guest list and seating arrangements");
    }

    public static void main(String[] args) {
        EventManager em = new EventManager();
        em.planEvent();
        em.manageGuests();
    }
}
