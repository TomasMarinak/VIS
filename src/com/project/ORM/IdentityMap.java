package com.project.ORM;

import com.project.models.User;

import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private Map users = new HashMap();
    public  void addPerson(User arg) {
       this.users.put(arg.getId(), arg);
    }
    public  User getUser(Long key) {
        return (User) users.get(key);
    }
   /* public static User getUser(long key) {
        return getUser(new Long(key));
    }*/
}
