package tools.registerAdapter;

import java.lang.reflect.Type;

import classes.Product;
import classes.Shelf;
import classes.Situation;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class ShelfSerializer implements JsonSerializer<Shelf>{

	@Override
	public JsonElement serialize(Shelf arg0, Type arg1, JsonSerializationContext arg2) {
		JsonObject result = new JsonObject();
		result.add("mId", new JsonPrimitive(arg0.getId()));
		Situation situation = arg0.getSituation();
		if(situation != null){
			result.add("situationId", new JsonPrimitive(situation.getId()));
		}
		Product product = arg0.getProduct();
		if(product != null){
			result.add("productId", new JsonPrimitive(product.getId()));
		}
		return result;
	}
}
