package serviceTests;

import javax.net.ssl.SSLSession;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

public class ServiceTestHelper
{
    public static HttpResponse<String> createMockedResponse(String body, int status) {

        return new HttpResponse<>() {
            @Override
            public int statusCode() {
                return status;
            }

            @Override
            public HttpRequest request() {
                return null;
            }

            @Override
            public HttpHeaders headers() {
                return null;
            }

            @Override
            public String body() {
                return body;
            }

            @Override
            public Optional<SSLSession> sslSession() {
                return Optional.empty();
            }

            @Override
            public URI uri() {
                return null;
            }

            @Override
            public HttpClient.Version version() {
                return null;
            }



            // Implementing the missing method
            @Override
            public Optional<HttpResponse<String>> previousResponse() {
                return Optional.empty();
            }
        };
    }

    public static String convertJsonFileToString(String filePath) throws IOException {
        // Read the content of the JSON file into a byte array
        byte[] jsonData = Files.readAllBytes(Paths.get(filePath));

        // Convert the byte array to a string
        return new String(jsonData);
    }
}
