package com.dsa.jsonConversion;
import org.json.JSONArray;
import org.json.JSONObject;

public class A {
    public static void main(String[] args) {
        String json = """
                {
                  "data": [
                                    {
                                      "id": "123",
                                      "name": "Test User",
                                      "status": "SUCCESS"
                                    }
                                  ]
                                }
                """;
        jsonConversion(json);
    }

    private static void jsonConversion(String json) {
        JSONObject jsonObject = new JSONObject(json);
        JSONArray jsonArray = jsonObject.getJSONArray("data");
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jo = jsonArray.getJSONObject(i);
            String id = jo.getString("id");
            String name = jo.getString("name");
            String status = jo.getString("status");
            System.out.println(id + "|" + name + "|" + status);
        }
    }
}
