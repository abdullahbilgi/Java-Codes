package com.company;

public class InvalideAgeException extends ArithmeticException{

    public InvalideAgeException(String message){

        super(message );
    }



    @Override
    public void printStackTrace() {
        System.out.println("Bu bir invalid age hatasıdır...");
    }
}


