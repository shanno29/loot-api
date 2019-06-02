
import bet.BetRoutes;
import friend.FriendRoutes;
import spec.SpecRoutes;
import trans.TransRoutes;
import user.UserRoutes;
import spark.Spark;

public class LootAPI {
    public static void main(String[] arg) {
        print("Initializing server...");
        Spark.initExceptionHandler(e -> {
            print("exception "+e.toString());
            System.exit(100);
        });

        print("Setting up routes...");
        Spark.get("/", (req, res) -> "Hello from Loot Root");
        Spark.path("/api", () -> {
            Spark.before("/*", (req, res) -> print("Received api call "));
            UserRoutes.setup();
            TransRoutes.setup();
            SpecRoutes.setup();
            FriendRoutes.setup();
            BetRoutes.setup();

        });

        print("Server ready");

    }


    public static void print(String msg) {
        System.out.println("<LootAPI> "+msg);
    }

}
