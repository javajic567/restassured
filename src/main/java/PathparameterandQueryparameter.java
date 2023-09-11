import static io.restassured.RestAssured.*;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
public class PathparameterandQueryparameter {
    @Test
	public void  check() {
		// TODO Auto-generated constructor stub
		given()
		.pathParam("path","Students")
		.queryParam("id",3)
		.when()
		.get("http://localhost:3000/{path}")
		.then() 
		.statusCode(200)
		.log().all();
	}

}
