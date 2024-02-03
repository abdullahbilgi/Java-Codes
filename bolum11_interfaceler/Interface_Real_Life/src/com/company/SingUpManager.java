package com.company;

public class SingUpManager {

    private IUserCheckService iUserCheckService;

    public SingUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }

    public void singUp(User user){

        if (iUserCheckService.checkUser(user)){
            System.out.println("Kullanici kayit oldu : "+user.getName());
        }
        else {
            System.out.println("Kullanici kayit olamadi");
        }


    }









}
