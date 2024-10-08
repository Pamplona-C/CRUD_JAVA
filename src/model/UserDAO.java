package model;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalTime;

public class UserDAO {
    private List<User> users;
    private LocalTime id;

    public UserDAO() {
        users = new ArrayList<>();
        id = LocalTime.now();
    }

    public void addUser(String name, String email){
        id = LocalTime.now();
        User user = new User(id, name, email);
        users.add(user);
    }

    public User getUserByName(String name){
        for(User user : users){
            if(user.getName().equals(name)){
                System.out.println(user);
            }
        }
        return null;
    }

    public void removeUser(String name){
        if(users.isEmpty()){
            System.out.println("Lista vazia");
            return;
        }
        for(User user : users){
            if(users.isEmpty()) {
                return;
            }else {
                if(user.name.equals(name)) {
                    users.remove(user);
                    return;
                }
            }
        }
    }

    public void updateUser(String antName, String name, String email){
        for (User user : users){
            if(user.getName().equals(antName)) {
                user.setId();
                user.setName(name);
                user.setEmail(email);
            }
        }
    }

    public List<User> getAllUsers(){
        if(users.isEmpty()){
            System.out.println("Lista vazia");
        }
        return users;
    }

}
