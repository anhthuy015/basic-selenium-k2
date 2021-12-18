package test.authentication;

import com.google.gson.Gson;

public class TestGson {
    public static void main(String[] args) {
        String loginObjectJSON = "{\n" +
                "  \"username\": \"username 01\",\n" +
                "  \"password\": \"password 01\"\n" +
                "}";

        Gson gson = new Gson();
        CredsData credsData = gson.fromJson(loginObjectJSON, CredsData.class);
        System.out.println(credsData.getUsername());
        System.out.println(credsData.getPassword());

        System.out.println(gson.toJson(credsData));
    }
}
