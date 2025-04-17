package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.MySQLDatabase;
import com.xworkz.Connection.internal.Database;

public class MySQLRunner {
    public static void main(String[] args) {
        Database db = new MySQLDatabase();
        db.connect();
        db.query();
        db.disconnect();
        db.store();
    }
}
