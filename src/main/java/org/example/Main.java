package org.example;

import io.sentry.Sentry;

public class Main {
    public static void main(String[] args) {
        Sentry.init(options -> {
            options.setEnableExternalConfiguration(true); // this must be enabled to read from `sentry.properties` file
            options.setDsn("https://502f25099c204a2fbf4cb16edc5975d1@o447951.ingest.sentry.io/5428563");
        });

        Sentry.captureMessage("hello!");
    }
}
