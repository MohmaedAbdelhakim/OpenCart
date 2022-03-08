package Readers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import Pages.pageBase;

public class JsonReader{

	public static void Read() throws IOException, ParseException {
		
		JSONParser jsonParser = new JSONParser();
		
		FileReader reader = new FileReader("Testdata.json");
		
		//Read JSON file
		Object obj = jsonParser.parse(reader);
		
		JSONArray usersList = (JSONArray) obj;
		System.out.println("Users List-> "+usersList); 
		
		for(int i=0;i<usersList.size();i++) 
		{
		JSONObject users = (JSONObject) usersList.get(i);
		
		System.out.println("Users -> "+users);
		//This prints every block - one json object
		
		JSONObject user = (JSONObject) users.get("users");
		
		System.out.println("User -> "+user); //This prints each data in the block
		
		String FirstName = (String) user.get("FirstName");
		String LastName = (String) user.get("LastName");
		String email=(String) user.get("Email");
		String password=(String) user.get("Password");
		String confirmPassword=(String) user.get("ConfirmPassword");

		}	
	}

}
