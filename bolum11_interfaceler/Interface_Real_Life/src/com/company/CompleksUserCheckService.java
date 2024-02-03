package com.company;

public class CompleksUserCheckService implements IUserCheckService{


    @Override
    public boolean checkUser(User user){
        if (user.getAge() >= 18 && user.getName().startsWith("Ab")){
            return true;
        }
        else {
            return false;
        }
    }
}
