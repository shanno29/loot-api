package friend;

import java.util.Map;

public class FriendModel {

    public String userId1 = "";
    public String userId2 = "";

    public static FriendModel empty = new FriendModel();

    public static FriendModel fromJson(Map<String,String> json) {
        FriendModel friend = empty;
        friend.userId1 = json.getOrDefault("user_id1","");
        friend.userId2 = json.getOrDefault("user_id2","");
        return friend;
    }

    @Override
    public String toString() {
        return "FriendModel{\n" +
            "userId1:" + userId1 + "\n" +
            "userId2:" + userId2 + "\n" +
            "\n}";
    }

}
