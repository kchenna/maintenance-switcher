package com.kc.mswitcher.executor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class StreamGobbler implements Runnable {

	private InputStream inputStream;
    private Consumer<String> consumeInputLine;
    
    public StreamGobbler(InputStream inputStream,Consumer<String> consumeInputLine) {
        this.inputStream = inputStream;
        this.consumeInputLine = consumeInputLine;
    }
 
    @Override
    public void run() {
            new BufferedReader(new InputStreamReader(inputStream)).lines().forEach(consumeInputLine);
    }
    
}