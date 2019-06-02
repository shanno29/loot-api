package user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserModel {

    public String userId = "";
    public String password = "";
    public String phoneNumber = "";
    public String premiumFlag = "";

    public static UserModel empty = new UserModel();

    public static UserModel fromJson(Map<String,String> json) {
        UserModel user = empty;
        user.userId = json.getOrDefault("user_id","");
        user.password = json.getOrDefault("password", "");
        user.phoneNumber = json.getOrDefault("phone_number", "");
        user.premiumFlag = json.getOrDefault("premium_flag", "");
        return user;
    }

    @Override
    public String toString() {
        return "UserModel{\n" +
            "userId:" + userId + "\n" +
            "password:" + password + "\n" +
            "phoneNumber:" + phoneNumber + "\n" +
            "premiumFlag:" + premiumFlag + "\n" +
            "\n}";
    }

    public static List<UserModel> mockUsers() {
        List<UserModel> res = new ArrayList<>();
        res.add(UserModel.fromJson(new HashMap<String,String>() {{
            put("user_id", "1");
            put("password", "abc");
            put("phone_number", "1234567890");
            put("premium_flag", "0");
        }}));
        res.add(UserModel.fromJson(new HashMap<String,String>() {{
            put("user_id", "2");
            put("password", "def");
            put("phone_number", "2345678901");
            put("premium_flag", "0");
        }}));
        res.add(UserModel.fromJson(new HashMap<String,String>() {{
            put("user_id", "3");
            put("password", "ghi");
            put("phone_number", "3456789012");
            put("premium_flag", "0");
        }}));
        return res;
    }
}
