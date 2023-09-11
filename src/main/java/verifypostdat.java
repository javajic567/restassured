import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
public class verifypostdat {
 int id;
//	@Test(priority=1)
//    void create()
//    { int[] a={45,35,67,53,45};
//    	HashMap data=new HashMap();
//    	data.put("name", "dinesh");
//    	data.put("gender", "male");
//    	data.put("age", 27);
//    	data.put("course","cse");
//    	data.put("marks", a);
//    	 given().contentType("application/json").body(data)
//    	 
//    	.when().post("http://localhost:3000/Students")
//    	
//    	.then()
//    	 .statusCode(201)
//    	 .body("name", equalTo("dinesh"))
//    	 .body("gender", equalTo("male"))
//    	 .body("age",equalTo(27))
//    	 .body("course", equalTo("cse"))
//    	 .body("marks[0]", equalTo(a[0]))
//    	 .body("marks[1]", equalTo(a[1]))
//    	 .body("marks[2]", equalTo(a[2]))
//    	 .body("marks[3]", equalTo(a[3]))
//    	 .body("marks[4]", equalTo(a[4]))
//    	 .header("Content-Type", "application/json; charset=utf-8")
//    	 .log().all();
//    	 
//    }
//	@Test(priority=1)
//    void createbyjson()
//    {   JSONObject data=new JSONObject();
//		int[] a={45,35,67,53,45};
//    	
//    	data.put("name", "dine");
//    	data.put("gender", "male");
//    	data.put("age", 27);
//    	data.put("course","cse");
//    	data.put("marks", a);
//    	 given().contentType("application/json").body(data.toString())
//    	 
//    	.when().post("http://localhost:3000/Students")
//    	
//    	.then()
//    	 .statusCode(201)
//    	 .body("name", equalTo("dine"))
//    	 .body("gender", equalTo("male"))
//    	 .body("age",equalTo(27))
//    	 .body("course", equalTo("cse"))
//    	 .body("marks[0]", equalTo(a[0]))
//    	 .body("marks[1]", equalTo(a[1]))
//    	 .body("marks[2]", equalTo(a[2]))
//    	 .body("marks[3]", equalTo(a[3]))
//    	 .body("marks[4]", equalTo(a[4]))
//    	 .header("Content-Type", "application/json; charset=utf-8")
//    	 .log().all();
//    	 
//    }
 //@Test(priority=1)
//void createbyjson()
//{   Pojorestapi pr=new Pojorestapi();
//	int[] a={45,35,67,53,45};
//	
//	pr.setName("saketh");
//	pr.setAge(25);
//	pr.setGender("male");
//	pr.setCourse("cse");
//	pr.setMarks(a);
//	 given().contentType("application/json").body(pr)
//	 
//	.when().post("http://localhost:3000/Students")
//	
//	.then()
//	 .statusCode(201)
//	 .body("name", equalTo("saketh"))
//	 .body("gender", equalTo("male"))
//	 .body("age",equalTo(25))
//	 .body("course", equalTo("cse"))
//	 .body("marks[0]", equalTo(a[0]))
//	 .body("marks[1]", equalTo(a[1]))
//	 .body("marks[2]", equalTo(a[2]))
//	 .body("marks[3]", equalTo(a[3]))
//	 .body("marks[4]", equalTo(a[4]))
//	 .header("Content-Type", "application/json; charset=utf-8")
//	 .log().all();
//	 
//}
 @Test(priority=1)
void createbyexternaljson() throws FileNotFoundException
{   File f=new File("C:\\Users\\ADMIN\\eclipse-workspace\\RestAssuredproject\\file.json");
	int[] a= {
	         45,
	         35,
	         67,
	         53,
	         45};
	FileReader read=new FileReader(f);
	JSONTokener j=new JSONTokener(read);
	JSONObject pr=new JSONObject(j);
	 given().contentType("application/json").body(pr.toString())
	 
	.when().post("http://localhost:3000/Students")
	
	.then()
	 .statusCode(201)
	 .body("name", equalTo("saketh"))
	 .body("gender", equalTo("male"))
	 .body("age",equalTo(25))
	 .body("course", equalTo("cse"))
	 .body("marks[0]", equalTo(a[0]))
	 .body("marks[1]", equalTo(a[1]))
	 .body("marks[2]", equalTo(a[2]))
	 .body("marks[3]", equalTo(a[3]))
	 .body("marks[4]", equalTo(a[4]))
	 .header("Content-Type", "application/json; charset=utf-8")
	 .log().all();
	 
}

}
