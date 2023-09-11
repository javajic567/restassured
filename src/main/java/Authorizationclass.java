import static io.restassured.RestAssured.*;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class Authorizationclass {
//@Test
//public void testbasicauth()
//{
//	given()
//	.auth().basic("postman", "password")
//	.when()
//     .get("https://postman-echo.com/basic-auth")	
//     .then()
//     .statusCode(200)
//     .body("authenticated",equalTo(true))
//     .log().all();
//}
//	@Test
//	public void testbasicauth()
//	{
//		given()
//		.auth().digest("postman", "password")
//		.when()
//	     .get("https://postman-echo.com/basic-auth")	
//	     .then()
//	     .statusCode(200)
//	     .body("authenticated",equalTo(true))
//	     .log().all();
//	}
//	
//	@Test
//	void  testBearerToke()
//	{
//		String token="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";
//		 given()
//		 .headers("Authorization","Bearer "+token)
//		 .when().get("https://api.github.com/user/repos")
//		 .then().log().all();
//	}
//	void testOauth()
//	{
//		given()
//		.auth().oauth2("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")
//		.when().get("https://api.github.com/user/repos")
//		 .then().log().all();
//	}
	@Test
	void testapikey()
	{
		given()
		.queryParam("appid", "08536a8b8241c3edd6a559bbecc23670")
		.queryParam("id", "524901")
		
		.when().get("https://api.openweathermap.org/data/2.5/forecast")
		 .then().log().all();
	}
//https://postman-echo.com/basic-auth
}
