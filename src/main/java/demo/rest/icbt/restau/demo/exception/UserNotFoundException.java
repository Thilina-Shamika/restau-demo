package demo.rest.icbt.restau.demo.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("could not found user id " + id);
    }
}
