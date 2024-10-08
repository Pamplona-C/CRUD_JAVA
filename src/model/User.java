package model;

import java.time.LocalTime;
import java.util.Date;

public class User {
    LocalTime id;
    String name;
    String email;

    public User(LocalTime id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(){

    }

    public LocalTime getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setId() {
        this.id = LocalTime.now();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString() {
        return "Id : " + id + ";" + " " + "Name : " + name + ";" + " " + "Email : " + email;
    }
}
