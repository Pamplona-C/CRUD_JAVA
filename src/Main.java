import model.User;
import repository.ItemRepository;
import controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.start();
    }
}