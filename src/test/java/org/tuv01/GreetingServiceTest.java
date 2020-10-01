package org.tuv01;

import com.google.inject.Inject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.greeting.GreetingService;


import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingServiceTest {
    @Inject
    GreetingService greetingService;

    @Test
    void checkReturnHello() {
        Assertions.assertEquals("Guten Tag! your country is Germany",greetingService.greeting());
    }

}