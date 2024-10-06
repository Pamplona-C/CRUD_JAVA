package model;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private List<User> users;
    private int nextId;

    public UserDAO() {
        users = new ArrayList<>();
        nextId = 1;
    }

    public void addUser(String name, String email){
        User user = new User(nextId++, name, email);
        users.add(user);
    }

    public User getUserByid(int id){
        for(User user : users){
            if(user.getId() == id){
                System.out.println(user);
            }
        }
        return null;
    }

    public void removeUser(int id){
        for(User user : users){
            if(user.id == id){
                users.remove(user);
            }
        }
    }

    public void updateUser(int id, String name, String email){
        for (User user : users){
            if(user.getId() == id) {
                user.setName(name);
                user.setEmail(email);
            }
        }
    }

    public List<User> getAllUsers(){
        return users;
    }

}
