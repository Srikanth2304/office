import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Jsonconverter {
	public static void main(String[] args) {
		String Logdetails = 1 + "#" + 2 + "#" + "O" + "#" +3 + "#" + 4 + "#" + 5 + "#" + 6 + "#" + 7 + "#" + 8 + "#" + 9;
		String[] data = Logdetails.split("#");
		Map<String,String> map = new HashMap<>();
		map.put("headerParameters" , data[0]);
		map.put("startTime" , data[1]);
		map.put("typeofTrn" , data[2]);
		map.put("APIServices" , data[3]);
		map.put("timeTaken" , data[4]);
		map.put("getMethod" , data[5]);
		map.put("getRequestURI" , data[6]);
		map.put("getQueryString" , data[7]);
		map.put("company_ID" , data[8]);
		map.put("message_Sender" , data[8]);
		
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(map);
			System.out.println(json);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
