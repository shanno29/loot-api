package trans;

import java.util.Map;

public class TransModel {

    public String transId = "";
    public String transStatus = "";
    public String userId = "";
    public String betId = "";
    public String transTotal = "";
    public String winFlag = "";
    public String venmoUser = "";

    public static TransModel empty = new TransModel();

    public static TransModel fromJson(Map<String,String> json) {
        TransModel trans = empty;
        trans.transId = json.getOrDefault("trans_id","");
        trans.transStatus = json.getOrDefault("trans_status","");
        trans.userId = json.getOrDefault("user_id","");
        trans.betId = json.getOrDefault("bet_id","");
        trans.transTotal = json.getOrDefault("trans_total","");
        trans.winFlag = json.getOrDefault("win_flag","");
        trans.venmoUser = json.getOrDefault("venmo_user","");
        return trans;
    }

    @Override
    public String toString() {
        return "TransModel{\n" +
            "transId:" + transId + "\n" +
            "userId:" + userId + "\n" +
            "betId:" + betId + "\n" +
            "transTotal:" + transTotal + "\n" +
            "winFlag:" + winFlag + "\n" +
            "venmoUser:" + venmoUser + "\n" +
            "\n}";
    }
}
