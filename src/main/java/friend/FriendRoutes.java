package friend;

import spark.Spark;

public class FriendRoutes {

    public static void setup() {

        // add a friend
        Spark.post("/friend", (req, res) -> "Add friend");

        // get all friends
        Spark.get("/friend", (req, res) -> "Get all friends");

        // get a friend
        Spark.get("/friend/:id", (req, res) -> "Get friend "+req.params(":id"));

        // edit a friend
        Spark.put("/friend/:id", (req, res) -> "Edit friend "+req.params(":id"));

        // delete a friend
        Spark.delete("/friend/:id", (req, res) -> "Delete friend "+req.params(":id"));

    }

}
