package user;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import spark.Request;
import spark.Response;
import spark.Spark;

public class UserRoutes {

    public static void setup() {
        Gson gson = new Gson();
        Spark.post("/user", UserRoutes::addUser);
        Spark.get("/user", UserRoutes::allUsers, gson::toJson);
        Spark.get("/user/:id", UserRoutes::getUser, gson::toJson);
        Spark.put("/user/:id", UserRoutes::editUser);
        Spark.delete("/user/:id", UserRoutes::deleteUser);
    }

    private static Object addUser(Request req, Response res) {
        //adfghjkll

        return "User Added";
    }

    private static Object getUser(Request req, Response res) {
        Integer userId = Integer.valueOf(req.params(":id"));
        return UserModel.mockUsers().get(userId);
    }

    private static Object allUsers(Request req, Response res) {
        return UserModel.mockUsers();
    }

    private static Object editUser(Request req, Response res) {
        return "Edit user "+req.params(":id");
    }

    private static Object deleteUser(Request req, Response res) {
        return "Delete user "+req.params(":id");
    }


}
