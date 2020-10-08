package com.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringMain implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(SpringMain.class);



    public static void main(String[] args) {

        SpringApplication.run(SpringMain.class, args);
    }

    /**
     * Runs after everything has been setup and wired. Good for health checks.
     *
     * @param strings
     * @throws Exception
     */
    @Override
    public void run(String... strings) throws Exception {

        LOG.error("ERROR Level logging visible");
        LOG.warn("WARN Level logging visible");
        LOG.info("INFO Level logging visible");
        LOG.debug("DEBUG Level logging visible");
        LOG.trace("TRACE Level logging visible");

        try {

        } catch (Exception e) {
            System.err.printf("During initial health checks, an error was produced. This is most likely due to application.yml not being configured properly: %s\n%s%n", e.getMessage(), e.toString());
            throw e;
        }

    }
}
