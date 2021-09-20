
@SuppressWarnings("serial")
public class WhatsAppException extends RuntimeException {
	@Override
	public String getMessage() {
		
	return "cant create group more than 5 members";	
	}
	
	
	@Override
public String toString() {
	
	return "cant upload more than 1Gb";
	
}
}
