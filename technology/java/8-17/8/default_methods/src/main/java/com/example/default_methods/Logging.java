package com.example.default_methods;

import java.util.Date;

public interface Logging {
	void log(String message);
	
	default void log(String message, Date date) {
		System.out.println(date.toString() + ": " + message);
	}
}
