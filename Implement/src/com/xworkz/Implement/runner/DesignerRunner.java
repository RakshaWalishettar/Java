package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.DesignerUser;
import com.xworkz.Implement.internal.Designer;
import com.xworkz.Implement.internal.LogoDesigner;

public class DesignerRunner {
    public static void main(String[] args) {
        Designer designer = new LogoDesigner();
        DesignerUser user = new DesignerUser(designer);
        user.execute();
    }
}
