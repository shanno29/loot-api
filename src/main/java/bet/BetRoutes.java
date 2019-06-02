package bet;

import spark.Spark;

public class BetRoutes {

    public static void setup() {

        // add a bet
        Spark.post("/bet", (req, res) -> "Add bet");

        // get all bets
        Spark.get("/bet", (req, res) -> "Get all bets");

        // get a bet
        Spark.get("/bet/:id", (req, res) -> "Get bet "+req.params(":id"));

        // edit a bet
        Spark.put("/bet/:id", (req, res) -> "Edit bet "+req.params(":id"));

        // delete a bet
        Spark.delete("/bet/:id", (req, res) -> "Delete bet "+req.params(":id"));

    }

}
