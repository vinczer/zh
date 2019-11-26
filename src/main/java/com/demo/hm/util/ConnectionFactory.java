package com.demo.hm.util;

import org.lightcouch.CouchDbClient;

public class ConnectionFactory {

    private static final String DATABASE_URL = "http://vir.inf.u-szeged.hu";
    private static final String DATABASE_USERNAME = "dbreader";
    private static final String DATABASE_PASSWORD = "ReadOnlyUser";
    private static final String TABLE_NAME = "vir-db";
    private static final int DATABASE_PORT = 5986;
    private static final String CONNECTION_PROTOCOL = "http";

    private static final CouchDbClient COUCH_DB_CLIENT = new CouchDbClient(
            TABLE_NAME,
            true,
            CONNECTION_PROTOCOL,
            DATABASE_URL,
            DATABASE_PORT,
            DATABASE_USERNAME,
            DATABASE_PASSWORD
    );

    public static CouchDbClient getInstance() {
        return COUCH_DB_CLIENT;
    }
}
