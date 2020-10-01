package org.tuv01;

import io.quarkus.test.Mock;
import io.quarkus.test.junit.QuarkusTest;

import org.greeting.GreetingService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;


import java.util.UUID;


@QuarkusTest
public class GreetingResourceTest {

    @Mock
    GreetingService greetingService;

    @Disabled
    @Test
    public void testHelloEndpoint() {
        
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("Hello!"));
    }

    @Disabled
    @Test
    public void testGreetingEndPoint(){
        final String name = UUID.randomUUID().toString();
        given()
            .when().get("/hello/"+name)
            .then()
                .statusCode(200)
                .body(is("Hello " + name +", your id is 1234"));
    }

}