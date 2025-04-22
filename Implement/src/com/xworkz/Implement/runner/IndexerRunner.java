package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.IndexerUser;
import com.xworkz.Implement.internal.DocumentIndexer;
import com.xworkz.Implement.internal.Indexer;

public class IndexerRunner {
    public static void main(String[] args) {
        Indexer indexer = new DocumentIndexer();
        IndexerUser user = new IndexerUser(indexer);
        user.execute();
    }
}
