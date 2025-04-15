package com.xworkz.HybridInheritance;

public interface Dietician {
    void suggestDiet();
}

interface Trainer {
    void conductWorkout();
}

class FitnessCoach implements Dietician, Trainer {
    public void suggestDiet() {
        System.out.println("Suggesting a balanced high-protein diet");
    }

    public void conductWorkout() {
        System.out.println("Conducting strength and cardio workout");
    }

    public static void main(String[] args) {
        FitnessCoach fc = new FitnessCoach();
        fc.suggestDiet();
        fc.conductWorkout();
    }
}
