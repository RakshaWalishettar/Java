package com.xworkz.Connection.Main.Connection.external;

import com.xworkz.Connection.internal.Database;

public class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connected to MySQL.");
    }
    public void query() {
        System.out.println("Executing SQL query...");
    }
    public void disconnect() {
        System.out.println("Disconnected from MySQL.");
    }

}
