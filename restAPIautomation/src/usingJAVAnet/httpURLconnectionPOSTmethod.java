package usingJAVAnet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpURLconnectionPOSTmethod {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub


		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");

		HttpURLConnection connection=(HttpURLConnection)url.openConnection();

		//to send the get response
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody="{\"name\":\"DivakarRamesh\",\"salary\":\"400000\",\"age\":\"25\"}";
		byte[] jsonbody=jsonBody.getBytes();
		OutputStream Outputstream=connection.getOutputStream();
		Outputstream.write(jsonbody);
		
	

		//to get the response code
		int statusCode=connection.getResponseCode();
		System.out.println("Status code is "+statusCode);

		//to get the status message
		String responsemessage=connection.getResponseMessage();
		System.out.println("Response message is "+responsemessage);

		//to get the input stream
		InputStream inputStream=connection.getInputStream();

		InputStreamReader inputStreamreader=new InputStreamReader(inputStream);
		BufferedReader buffered = new BufferedReader(inputStreamreader);
		String line;
		StringBuffer buffer= new StringBuffer();
		
		
		
		
		while((line=buffered.readLine())!=null) {

		buffer.append(line);
		//System.out.println(buffer);

	}
		System.out.println(buffer);
	}

	
	

}
