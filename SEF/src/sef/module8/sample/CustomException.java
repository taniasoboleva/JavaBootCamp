package sef.module8.sample;
// Needs to be completed
//Extending from Exception class makes CustomException a Checked Exception
public class CustomException extends Exception{

	//1 - Override the toString method of Exception.
	//This message gets printed as soon as CustomException is thrown.
	public String toStrng () {
		return "This is my custom exception";
	}

	//You can also write more information about this exception in getMessage()
	//2 - Override getMessage()
	public String getMessage() {
		//3 - Enter a message in it and return the same
		String msg = "Here, I am going to provide you with more information about this exception";
		
			return msg;
	}
	
	
	
	
	
}
