package com.company;

public class Main {

    public static void main(String[] args) {

        SingUpManager singUpManager = new SingUpManager(new CompleksUserCheckService()/*buradan sevis degistirebiliriz new AgeUserCheckService kullabiliriz*/);

        singUpManager.singUp(new User(1,"Abdullah",18));






    }
}
