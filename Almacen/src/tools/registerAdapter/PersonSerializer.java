package tools.registerAdapter;

import java.lang.reflect.Type;

import classes.Address;
import classes.Person;
import classes.TypePerson;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class PersonSerializer implements JsonSerializer<Person> {

	@Override
	public JsonElement serialize(Person arg0, Type arg1, JsonSerializationContext arg2) {
		JsonObject result = new JsonObject();
		Address address = arg0.getAddress();
		if(address != null){
			JsonObject result3 = new JsonObject();
			result3.add("mBlock", new JsonPrimitive((address.getBlock() != null)?address.getBlock():""));
			result3.add("mDoor", new JsonPrimitive((address.getDoor() != null)?address.getDoor():""));
			result3.add("mFloor", new JsonPrimitive(address.getFloor()));
			result3.add("mId", new JsonPrimitive(address.getId()));
			result3.add("mLocality", new JsonPrimitive((address.getLocality() != null)?address.getLocality():""));
			result3.add("mNameVia", new JsonPrimitive((address.getNameVia() != null)?address.getNameVia():""));
			result3.add("mNumber", new JsonPrimitive(address.getNumber()));
			result3.add("mProvince", new JsonPrimitive((address.getProvince() != null)?address.getProvince():""));
			result3.add("mStairs", new JsonPrimitive((address.getStairs() != null)?address.getStairs():""));
			result3.add("mTypeVia", new JsonPrimitive((address.getTypeVia() != null)?address.getTypeVia():""));
			result.add("mAddress", result3);
		}
		result.add("mId", new JsonPrimitive(arg0.getId()));
		result.add("mName", new JsonPrimitive(arg0.getName()));
		result.add("mSurname", new JsonPrimitive((arg0.getSurname() != null)?arg0.getSurname():""));
		result.add("mTelefoneNumber", new JsonPrimitive((arg0.getTelefoneNumber() != null)?arg0.getTelefoneNumber():""));
		TypePerson typePerson = arg0.getTypePerson();
		if(typePerson != null){
			JsonObject result2 = new JsonObject();
			result2.add("mDescription", new JsonPrimitive((typePerson.getDescription() != null)?typePerson.getDescription():""));
			result2.add("mId", new JsonPrimitive(typePerson.getId()));
			result2.add("mType", new JsonPrimitive((typePerson.getType() != null)?typePerson.getType():""));
			result.add("mTypePerson", result2);
		}
		return result;
	}
}