package org.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.store.web_ui.config.SpringWebConfiguration;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(SpringWebConfiguration.class);
    }
}