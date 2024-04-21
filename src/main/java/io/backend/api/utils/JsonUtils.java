package io.backend.api.utils;

import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtils {

    public static int getObjectLength(Response response, String jsonKey) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(response.asString());
        JSONObject object = (JSONObject) jsonObject.get(jsonKey);
        return object.size();
    }
}