package trans;

import spark.Spark;

public class TransRoutes {

    public static void setup() {

        // add a trans
        Spark.post("/trans", (req, res) -> "Add trans");

        // get all trans
        Spark.get("/trans", (req, res) -> "Get all trans");

        // get a trans
        Spark.get("/trans/:id", (req, res) -> "Get trans "+req.params(":id"));

        // edit a trans
        Spark.put("/trans/:id", (req, res) -> "Edit trans "+req.params(":id"));

        // delete a trans
        Spark.delete("/trans/{id}", (req, res) -> "Delete a trans "+req.params(":id"));

    }

}
