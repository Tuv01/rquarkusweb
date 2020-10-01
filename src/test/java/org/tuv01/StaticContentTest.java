package org.tuv01;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class StaticContentTest {

    @TestHTTPResource("index.html")
    URL url;

    @Test
    public void testRootPath(){
        String body;
        try {
            body = IOUtils.toString(url, Charset.defaultCharset());
            System.out.println(body);
            Assertions.assertTrue(body.contains("<h2> Why do you see this?</h2>"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}