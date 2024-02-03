package com.core.deploy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTest {
        private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

        public static void main(String[] args) {
            logger.info("Hello SLF4J!");
            logger.info("Application deployed Successfully, HAPPY Kubernete CLUSTER DEPLOYMENT");
        }
}
