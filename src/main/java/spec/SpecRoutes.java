package spec;

import spark.Spark;

public class SpecRoutes {

    public static void setup() {

        // get all specs
        Spark.get("/spec", (req, res) -> "Get all specs");

        // edit a spec
        Spark.put("/spec", (req, res) -> "Edit spec "+req.params(":id"));

        // get a spec
        Spark.get("/spec/:id", (req, res) -> "Get spec "+req.params(":id"));

        // add a spec
        Spark.post("/spec/:id", (req, res) -> "Add spec"+req.params(":id"));

        // delete a spec
        Spark.delete("/spec/:id", (req, res) -> "Delete spec "+req.params(":id"));

    }

}
