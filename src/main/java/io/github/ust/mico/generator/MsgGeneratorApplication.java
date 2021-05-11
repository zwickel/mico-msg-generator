package io.github.ust.mico.generator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsgGeneratorApplication {

    @Autowired
    static Sender sender;

    public static void main(String[] args) {
        SpringApplication.run(MsgGeneratorApplication.class, args);

        new MessageGenerator(sender);
    }

}
