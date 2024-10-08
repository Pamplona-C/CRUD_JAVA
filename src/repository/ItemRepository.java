package repository;

import java.util.ArrayList;
import model.User;

public class ItemRepository {
    ArrayList items = new ArrayList();

   public void addItem(User user) {
       items.add(user);
   }

   public void removeItem(User user){
       items.remove(user);
   }

   public void updateItem(User user, int id, String name){
       user.setId();
       user.setName(name);
   }

   public void listItems()
   {
       for (int i = 0; i < items.size(); i++){
           System.out.println(items.get(i));
       }
   }
}
