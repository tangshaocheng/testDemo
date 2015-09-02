package GsonTest;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class TestReadJson {
	public static void main(String[] args) throws Exception {
		JsonParser parser = new JsonParser();
		JsonObject object = (JsonObject) parser.parse(new FileReader(
				"test.json"));
		System.out.println("cat=" + object.get("cat").getAsString());
		JsonArray languages = object.getAsJsonArray("languages");
		for (JsonElement jsonElement : languages) {
			JsonObject language = jsonElement.getAsJsonObject();
			System.out.println("id=" + language.get("id").getAsInt() + ",ide="
					+ language.get("ide").getAsString() + ",name="
					+ language.get("name").getAsString());
		}
		System.out.println("pop=" + object.get("pop").getAsString());
	}
}
