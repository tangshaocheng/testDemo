package GsonTest;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class TestCreateJson {
	public static void main(String[] args) {
		JsonObject object = new JsonObject();
		object.addProperty("cat", "it");
		JsonArray languages = new JsonArray();
		JsonObject language = new JsonObject();
		language.addProperty("id", 1);
		language.addProperty("ide", "Eclipse");
		language.addProperty("name", "java");
		languages.add(language);

		language = new JsonObject();
		language.addProperty("id", 2);
		language.addProperty("ide", "Xcode");
		language.addProperty("name", "Swift");
		languages.add(language);

		language = new JsonObject();
		language.addProperty("id", 3);
		language.addProperty("ide", "Visual Studio");
		language.addProperty("name", "c#");
		languages.add(language);

		object.add("languages", languages);
		object.addProperty("pop", true);

		String jsonStr = object.toString();
		System.out.println(jsonStr);
	}
}
