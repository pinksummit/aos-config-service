package com.alwaysonscene.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@EnableConfigServer
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        String version = getClass().getPackage().getImplementationVersion();
        return args -> {
            System.out.println(
                    "    ___    __                          ____       _____                                  ______            _____      \n" +
                            "   /   |  / /      ______ ___  _______/ __ \\____ / ___/________  ____  ___              / ____/___  ____  / __(_)___ _\n" +
                            "  / /| | / / | /| / / __ `/ / / / ___/ / / / __ \\\\__ \\/ ___/ _ \\/ __ \\/ _ \\   ______   / /   / __ \\/ __ \\/ /_/ / __ `/\n" +
                            " / ___ |/ /| |/ |/ / /_/ / /_/ (__  ) /_/ / / / /__/ / /__/  __/ / / /  __/  /_____/  / /___/ /_/ / / / / __/ / /_/ / \n" +
                            "/_/  |_/_/ |__/|__/\\__,_/\\__, /____/\\____/_/ /_/____/\\___/\\___/_/ /_/\\___/            \\____/\\____/_/ /_/_/ /_/\\__, /  \n" +
                            "========================/____/============================================================>>> " + version + " /____/");
            System.out.println();
        };
    }
}
