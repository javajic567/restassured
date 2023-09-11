import static io.restassured.RestAssured.*;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class Cookiesclass {
//    @Test
//	public void  Cookies() {
//		// TODO Auto-generated constructor stub
//		given()
//		.when()
//		.get("https://www.google.com/")
//		.then()
//		.cookie("1P_JAR","2023-09-07-10")
//		.log().all();
//	}
    @Test
	public void  getCookies() {
		// TODO Auto-generated constructor stub
		Response res=given()
		.when()
		.get("https://www.google.com/");
		
		String Cookiedata=res.getCookie("AEC");
		System.out.println(Cookiedata);
		Map<String,String> cookies=res.getCookies();
		System.out.println(cookies);
	}
}
