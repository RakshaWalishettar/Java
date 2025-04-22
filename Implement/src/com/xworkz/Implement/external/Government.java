package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Consitution;

public class Government {
    private Consitution consitution;

    public Government(Consitution consitution) {
        this.consitution = consitution;
        System.out.println("the constitue is implement");
    }

    public void minister() {
        System.out.println("the minister in the govt");
        if (this.consitution != null) {
            this.consitution.folloeLaws();
        }
        else {
            System.out.println("the minister is not from the govt");
        }
    }
}
