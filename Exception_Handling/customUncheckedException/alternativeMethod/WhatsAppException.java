package alternativeMethod;
@SuppressWarnings("serial")
public class WhatsAppException extends RuntimeException {
	
private String message;

WhatsAppException (String message){
	this.message=message;
}

public String getMessage() {
	return message;
}

}


