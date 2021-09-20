package alternativeMethod;

public class Ganesh {
	public static void main(String[] args) {
		String[] names= {"Ganesh","priya","pooja","surya","sachin",};
		File file=new File();
		WhatsAPP whatsApp =new WhatsAPP();
		
		try {
		whatsApp.createGroup(names);	
		whatsApp.shareFile(file);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			
}
}
}
