package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsTestApplicationTests {

    @Test
    void contextLoads() {

        System.out.println("sampple test");
    }

    @Test
    void testMethod() {
        assertEquals(true, true);
    }

}
