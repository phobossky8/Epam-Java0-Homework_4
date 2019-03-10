package ldy.java0.hw4.exceptions;

public class WrongOptionException extends Exception {
	public WrongOptionException(){
		super();
	}
	
	public WrongOptionException(String msg){
		super(msg);
	}
	
	public WrongOptionException(Exception e){
		super(e);
	}
	
	public WrongOptionException(String msg, Exception e){
		super(msg, e);
	}

}
