package com.example.default_methods;

public class LoggingImpl implements Logging {
	@Override
	public void log(String message) {
		System.out.println(message);
	}
}
