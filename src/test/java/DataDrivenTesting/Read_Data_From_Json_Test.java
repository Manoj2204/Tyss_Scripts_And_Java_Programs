package DataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Read_Data_From_Json_Test 
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		FileReader filepath=new FileReader("./src/test/resources/JsonData.json");
		
		// JsonParse is used to read/Write json formatted file
		JSONParser jsonp=new JSONParser();
		Object obj =jsonp.parse(filepath);
		
		//Read data from json
		JSONObject map= (JSONObject)obj;
		
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("passwoed"));
		
	}

}
