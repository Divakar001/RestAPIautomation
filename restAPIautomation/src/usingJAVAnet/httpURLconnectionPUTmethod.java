package usingJAVAnet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class httpURLconnectionPUTmethod {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/2929");

		HttpURLConnection connection=(HttpURLConnection)url.openConnection();

		//to send the get response
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		String jsonBody="{\"name\":\"DivakarRamesh3\",\"salary\":\"300000\",\"age\":\"27\"}";
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


