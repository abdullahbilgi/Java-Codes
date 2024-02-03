package com.company;

public class Database2 extends Database{

    public final void baglantiKur( String username, String password){//final yaparsak başka bir sınıf bu methodu override edemez

        System.out.println(username);
        System.out.println(password);
    }

}
