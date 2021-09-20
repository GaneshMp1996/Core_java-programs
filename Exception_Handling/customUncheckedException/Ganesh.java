
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
			if(names.length>5) {
				System.out.println(e.getMessage());
		}
			else {
				System.out.println(e);
			}
}

	}
}
//*change the file size
//*add the names more than 5members 
