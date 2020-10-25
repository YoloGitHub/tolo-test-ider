package com.tolo.test.ider;

import com.tolo.idFactory.impl.step.StepIdFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class IderApplication {


    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(IderApplication.class, args);

        StepIdFactory stepIdFactory = applicationContext.getBean(StepIdFactory.class);

        System.out.println(stepIdFactory.getFactory("t1").generateLong());
        System.out.println(stepIdFactory.getFactory("t1").generateLong());
        System.out.println(stepIdFactory.getFactory("t1").generateString());
        System.out.println(stepIdFactory.getFactory("t2").generateLong());
        System.out.println(stepIdFactory.getFactory("t2").generateString());
    }

}
