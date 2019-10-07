package org.rgo.logging;

import java.io.PrintStream;

public interface BasicLogger {

	default void log(String msg) {
            getOutputStream().println("basic-logger:" + msg);
	}


	private PrintStream getOutputStream() {
		return System.out;
	}

}

