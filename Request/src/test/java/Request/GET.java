package Request;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Response Resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code=Resp.getStatusCode();
		System.out.println(code);
				
	}

}
