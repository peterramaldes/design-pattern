package com.peterramaldes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingletonApplication.class, args);
        demoSingleThread();
    }

    private static void demoSingleThread() {
        String msg = "If we see the same value, then singleton was reused (YAA!)\n"
                + "If we see the different value, then 2 singletons were created (dammit!)\n\n"
                + "Result: \n";
        System.out.println(msg);


        Singleton foo = Singleton.getInstance("FOO");
        Singleton bar = Singleton.getInstance("BAR");

        System.out.println(foo.value);
        System.out.println(bar.value);
    }
}
