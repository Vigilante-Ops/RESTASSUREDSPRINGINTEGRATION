package com.example.RestAssuredIntegration;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RestAssuredIntegrationApplicationTests {

	private final static String BASE_URI = "http://localhost";

	@LocalServerPort
	private int port;

	@Before
	public void configureRestAssured() {
		RestAssured.baseURI = BASE_URI;
		RestAssured.port = port;
	}
	@Test
	@DisplayName("PRINT")
	void test()
	{
		System.out.println("test");
	}

	@Test
	@DisplayName("CONTEXT LOAD")
	void contextLoads()
	{
		String s=given()
				.when()
				.port(port)
				.get("/greetings")
				.then()
				.extract().response().asString();
		System.out.println(s);

	}

}
