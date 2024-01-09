package me.piumika.student_manage.exeption;

public class InvalidException extends RuntimeException{
    public InvalidException(String message){
        super(message);
    }
}
