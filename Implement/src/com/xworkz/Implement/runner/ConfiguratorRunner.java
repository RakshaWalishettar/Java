package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.ConfiguratorUser;
import com.xworkz.Implement.internal.Configurator;
import com.xworkz.Implement.internal.DatabaseConfigurator;

public class ConfiguratorRunner {
    public static void main(String[] args) {
        Configurator configurator = new DatabaseConfigurator();
        ConfiguratorUser user = new ConfiguratorUser(configurator);
        user.execute();
    }
}
