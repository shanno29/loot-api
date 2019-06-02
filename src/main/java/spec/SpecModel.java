package spec;

import java.util.Map;

public class SpecModel {

    public String specId = "";
    public String betId = "";
    public String userId = "";
    public String wager = "";
    public String winCondition = "";
    public String pushCondition = "";
    public String voteFor = "";

    public static SpecModel empty = new SpecModel();

    public static SpecModel fromJson(Map<String,String> json) {
        SpecModel spec = empty;
        spec.specId = json.getOrDefault("spec_id","");
        spec.betId = json.getOrDefault("bet_id","");
        spec.userId = json.getOrDefault("user_id","");
        spec.wager = json.getOrDefault("wager","");
        spec.winCondition = json.getOrDefault("win_condition","");
        spec.pushCondition = json.getOrDefault("push_condition","");
        spec.voteFor = json.getOrDefault("vote_for", "");
        return spec;
    }

    @Override
    public String toString() {
        return "SpecModel{\n" +
            "specId:" + specId + "\n" +
            "betId:" + betId + "\n" +
            "userId:" + userId + "\n" +
            "wager:" + wager + "\n" +
            "winCondition:" + winCondition + "\n" +
            "pushCondition:" + pushCondition + "\n" +
            "voteFor:" + voteFor + "\n" +
            "\n}";
    }
}
