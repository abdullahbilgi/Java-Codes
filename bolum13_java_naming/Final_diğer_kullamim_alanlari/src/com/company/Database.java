package com.company;

public final class Database {//bir sınıf final ise ondan başka bir alt sınıf üretilemez

    /*public void baglantiKur(final String username,final String password){//final yaparsak değiştirelez olur

        System.out.println(username);
        System.out.println(password);
    }*/

    public final void baglantiKur( String username, String password){//final yaparsak başka bir sınıf bu methodu override edemez

        System.out.println(username);
        System.out.println(password);
    }
}
