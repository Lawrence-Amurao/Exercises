package com.techelevator.logger;

import java.io.*;

public class Logger implements Closeable {
    private File logFile;
    private PrintWriter writer;

    public Logger(String path) {
        this.logFile = new File(path);

        if (logFile.exists()) {
            try {
                this.writer = new PrintWriter(new FileWriter(this.logFile, true));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                writer = new PrintWriter(this.logFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    public void write(String logMessage) {
        writer.println(logMessage);
    }

    public void close() throws IOException {
        writer.close();

    }
}
