package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Indexer;

public class IndexerUser {
    private Indexer indexer;
    public IndexerUser(Indexer indexer) {
        this.indexer = indexer;
        System.out.println("IndexerUser ready");
    }
    public void execute() {
        System.out.println("Indexing document...");
        if (this.indexer != null) {
            this.indexer.index();
        } else {
            System.out.println("no indexing");
        }
    }
}
