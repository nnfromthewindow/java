import java.io.*;

public class Main {

	public static void main(String[] args) {
		  
		User user = null;
	          
		      FileInputStream fileIn;
				try {
					fileIn = new FileInputStream("C:\\Users\\Usuario\\eclipse-workspace\\Serialization\\UserInfo.ser");
			         ObjectInputStream in = new ObjectInputStream(fileIn);
			         user = (User) in.readObject();
			         in.close();
			         fileIn.close();
			      
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			  long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
			  System.out.println("serialVersionUID: "+serialVersionUID);
			      
		      System.out.println("name: " + user.name);
		      System.out.println("password: " + user.password);

		      user.hello();
		      
		   }
		}