package practice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class SampleTestUsingMtdChaining {

	@Test
	public void getRequestTest() {
		/*RestAssured.get("https://reqres.in/api/users?page=2").prettyPrint();
		Response resp=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(resp.prettyPrint());*/
		get("https://reqres.in/api/users?page=2").prettyPrint();
		get("https://reqres.in/api/users?page=2").then().log().all();
	}
}
