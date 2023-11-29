package DataDrivenTesting;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonGenericMethod 
{
    public String readDataFromJson(String key) throws IOException, ParseException
    {
        FileReader filepath=new FileReader("./src/test/resources/JsonData.json");
		
		// JsonParse is used to read/Write json formatted file
		JSONParser jsonp=new JSONParser();
		Object obj =jsonp.parse(filepath);
		
		//Read data from json
		JSONObject map= (JSONObject)obj;
		String value = (String) map.get(key);
		return value;
		 
		
    	
    }
}
