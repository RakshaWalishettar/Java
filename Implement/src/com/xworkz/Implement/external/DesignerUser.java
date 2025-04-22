package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Designer;

public class DesignerUser {
    private Designer designer;
    public DesignerUser(Designer designer) {
        this.designer = designer;
        System.out.println("DesignerUser ready");
    }
    public void execute() {
        System.out.println("Starting design...");
        if (this.designer != null) {
            this.designer.design();
        } else {
            System.out.println("not design");
        }
    }
}
