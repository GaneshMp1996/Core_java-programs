package alternativeMethod;

public class WhatsAPP {
	void createGroup(String[] names)   {
		if(names.length> 5){
     throw new  WhatsAppException("cant create groupmore than 5 members");
     
      
}
		else {
			System.out.println("your Watsapp group created Sucessfully...");
			
		}
	}

	void shareFile(File file)  {
		if(file.size>1000) {
		      throw new WhatsAppException("Invalid File size");
	}
		else {
			System.out.println("File uploaded Sucessfully");
		}
	}
}

