package httpconnection;

import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpPostConnection {

	public static void main(String[] args) {
		String urlParam = "http://localhost:8080/managerdd";
		String dataParam = "a";
		System.out.println(httpPost(urlParam, dataParam));
	}
	
	public static String httpPost(String urlParam, String dataParam){
		byte[] data = dataParam.getBytes();
		String response = null;
		HttpURLConnection connection = null;
		
		try {
			URL url = new URL(urlParam);
			connection = (HttpURLConnection) url.openConnection();
			connection.setConnectTimeout(6000);
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setUseCaches(true);
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Connection", "Keep-Alive");
			connection.setRequestProperty("Charset", "UTF-8");  
			connection.setRequestProperty("Content-Length", String.valueOf(data.length));  
			connection.setRequestProperty("Content-Type", "text/xml; charset=utf-8");  
			connection.connect(); 
			
			DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
			outputStream.write(data);
			outputStream.flush();
			outputStream.close();
			
			int responseCode = connection.getResponseCode();
			InputStream inputStream = connection.getInputStream();
			byte[] buffer = new byte[10000];
			inputStream.read(buffer);
			
			
			String s = new String(buffer);
			System.out.println(s);
			
			response = inputStream.toString();
			
			if(responseCode == 200){
			}else {
				System.out.println("返回码" + responseCode);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			connection.disconnect();
		}
		return response;
	}
}
