package usingUNIREST;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpRequestExample {
	
	public void getRequestExample() throws UnirestException {
		
		//first we have to add external jar file of Unirest -java file
		HttpResponse<JsonNode> jsonresponse=Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();
		
		//to get the status code
		System.out.println("Status code "+jsonresponse.getStatus());
		//to get the status message
		System.out.println("Status message "+jsonresponse.getStatusText());
		//to get the Body
		System.out.println("Response body :"+jsonresponse.getBody());
	}
	
public void postRequestExample() throws UnirestException {
		
		//first we have to add external jar file of Unirest -java file
	HttpResponse<JsonNode> jsonresponse=Unirest.post("http://dummy.restapiexample.com/api/v1/create").
		
		body("{\"name\":\"Anto\",\"salary\":\"300000\",\"age\":\"5\"}").asJson();
		
		
		//to get the status code
		System.out.println("Status code "+jsonresponse.getStatus());
		//to get the status message
		System.out.println("Status message "+jsonresponse.getStatusText());
		//to get the Body
		System.out.println("Response body :"+jsonresponse.getBody());
	}
	
public void putRequestExample() throws UnirestException {
	
	//first we have to add external jar file of Unirest -java file
HttpResponse<JsonNode> jsonresponse=Unirest.put("http://dummy.restapiexample.com/api/v1/update/id").
	
	body("{\"name\":\"Anto\",\"salary\":\"400000\",\"age\":\"5\"}").asJson();
	
	
	//to get the status code
	System.out.println("Status code "+jsonresponse.getStatus());
	//to get the status message
	System.out.println("Status message "+jsonresponse.getStatusText());
	//to get the Body
	System.out.println("Response body :"+jsonresponse.getBody());
}

public void deleteRequestExample() throws UnirestException {
	
	
	
	HttpResponse<JsonNode> jsonresponse=Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/id").asJson();
	//to get the status code
		System.out.println("Status code "+jsonresponse.getStatus());
		//to get the status message
		System.out.println("Status message "+jsonresponse.getStatusText());
		//to get the Body
		System.out.println("Response body :"+jsonresponse.getBody());
	}

	

	
	
	

	public static void main(String[] args) throws UnirestException {
		// TODO Auto-generated method stub
		UnirestHttpRequestExample unirestResponse=new UnirestHttpRequestExample();
		//unirestResponse.getRequestExample();
		//unirestResponse.postRequestExample();
		//unirestResponse.putRequestExample();
		unirestResponse.deleteRequestExample();
	} 

}
