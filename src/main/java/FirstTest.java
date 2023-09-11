import static io.restassured.RestAssured.*;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;
/*
 *given() headers auth cookie
 *when() get post put delete
 *then() validate status code data
 */

public class FirstTest {
   int id;
    //@Test
	public void getuser() {
		// TODO Auto-generated constructor stub
		given()
		.when().get("http://localhost:3000/Students")
		.then().statusCode(200)
		.log().all();
	}
	@Test(priority=3)
	public void getsingleuser() {
		// TODO Auto-generated constructor stub
		System.out.println(id);
		given()
		.when().get("http://localhost:3000/Students/"+5166)
		
		.then().statusCode(200)
		.log().all();
	}
	@Test(priority=1)
    void create()
    { int[] a={45,35,67,53,45};
    	HashMap data=new HashMap();
    	data.put("name", "harsha1");
    	data.put("gender", "female");
    	data.put("age", "27");
    	data.put("course","EEE");
    	data.put("marks", a);
    	 id=given().contentType("application/json").body(data)
    	.when().post("http://localhost:3000/Students").jsonPath().getInt("id");
    	
    }
    @Test(priority=2)
    void update()
    { 
    	HashMap data=new HashMap();
    	data.put("name", "harsha");
    	data.put("course", "cse");
    	 id=given().contentType("application/json").body(data)
    	.when().post("http://localhost:3000/Students").jsonPath().getInt("id");
    	 System.out.println(id);
    }
    

}
