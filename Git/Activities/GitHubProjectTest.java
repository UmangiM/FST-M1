package Project;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import io.restassured.RestAssured;
import io.restassured.builder.*;
import io.restassured.response.Response;

public class GitHubProjectTest {
	String sshKey="ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIHlEEXKDLVgWC9kX7B5qqSM+vhbhwtEDM4Ch9vaMudXh";
		int keyid;
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	@BeforeClass()
	public void setUp () {
		requestSpec = new RequestSpecBuilder().
				setBaseUri("https://api.github.com/user/keys").
				addHeader ("Content-Type" , "application/json").
				addHeader ("Authorization", "token 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").
				addHeader("X-GitHub-Api-Version", "2022-11-28").
				build();

		responseSpec = new ResponseSpecBuilder().
				expectBody("title",Matchers.equalTo("TestKey")).
				expectBody("key", Matchers.equalTo(sshKey)).
				expectResponseTime(Matchers.lessThanOrEqualTo(3000L)).
				build();
				
	}		
	
	@Test(priority=1)
	public void postRequestTest() {
		HashMap<String, String> reqBody = new HashMap<String, String>();
		reqBody.put("title", "TestKey");
		reqBody.put("key", sshKey);
		
		Response response = RestAssured
			.given().spec(requestSpec).body(reqBody).log().all()
			.when().post();
		keyid = response.then().extract().path("id");
		response.then().
			statusCode(201).
			spec(responseSpec).log().all();
	}
		
		@Test(priority = 2)
	    public void getRequestTest() {
	    	// Send request, save response
	    	RestAssured.given().spec(requestSpec).pathParam("keyId", keyid).
			when().get("/{keyId}").
			then().statusCode(200).spec(responseSpec);
	    
	}
}
