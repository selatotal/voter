package br.edu.ulbra.election.voter.exception;

public class GenericOutputException extends RuntimeException {

    public GenericOutputException(){
        super("Unexpected error");
    }

    public GenericOutputException(String message){
        super(message);
    }
}
