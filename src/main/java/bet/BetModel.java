package bet;

import java.util.Map;

public class BetModel {

    public String betId = "";
    public String betStatus = "";
    public String userId1 = "";
    public String userId2 = "";
    public String betTotal = "";
    public String transId1 = "";
    public String transId2 = "";
    public String winningUserId = "";
    public String eventName = "";
    public String eventDate = "";

    public static BetModel empty = new BetModel();

    public static BetModel fromJson(Map<String,String> json) {
        BetModel bet = empty;
        bet.betId = json.getOrDefault("bet_id","");
        bet.betStatus = json.getOrDefault("bet_status", "");
        bet.userId1 = json.getOrDefault("user_id1","");
        bet.userId2 = json.getOrDefault("user_id2","");
        bet.betTotal = json.getOrDefault("bet_total","");
        bet.transId1 = json.getOrDefault("trans_id1","");
        bet.transId2 = json.getOrDefault("trans_id2","");
        bet.winningUserId = json.getOrDefault("winning_user_id","");
        bet.eventName = json.getOrDefault("event_name","");
        bet.eventDate = json.getOrDefault("event_date","");
        return bet;
    }

    @Override
    public String toString() {
        return "BetModel{\n" +
            "betId:" + betId + "\n" +
            "betStatus:" + betStatus + "\n" +
            "userId1:" + userId1 + "\n" +
            "userId2:" + userId2 + "\n" +
            "betTotal:" + betTotal + "\n" +
            "transId1:" + transId1 + "\n" +
            "transId2:" + transId2 + "\n" +
            "winningUserId:" + winningUserId + "\n" +
            "eventName:" + eventName + "\n" +
            "eventDate:" + eventDate + "\n" +
            "\n}";
    }
}
