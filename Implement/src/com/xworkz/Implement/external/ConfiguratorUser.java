package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Configurator;
import com.xworkz.Implement.internal.Scanner;

public class ConfiguratorUser {
    private Configurator configurator;

    public ConfiguratorUser(Configurator configurator) {
        this.configurator = configurator;
        System.out.println("ConfiguratorUser created");
    }

    public void execute() {
        System.out.println("Running configuration...");
        if (this.configurator != null) {
            System.out.println("no configure");
        } else {
            System.out.println("runner");
        }

    }
}

