import java.io.*;

public class Main {

		   public static void main(String [] args) {
			   
			   //Serialization = 	The process of converting an object into a byte stream.
			   //					Persists (saves the state) the object after program exits
			   //					This byte stream can be saved as a file or sent over a network
			   //					Byte stream can be saved as a file (.ser) which is platform independent
			   //					(Think of this as if you're saving a file with the object's information)
			   
			   //					Steps to Serialize
			   //					---------------------------------------------------------------
			   //					1. Your class should implement Serializable interface
			   //					2. add import java.io.Serializable;
			   //					3. FileOutputStream fileOut = new FileOutputStream(file path)
			   //					4. ObjectOutputStream out = new ObjectOutputStream(fileOut);
			   //					5. out.writeObject(objectName)
			   //					6. out.close(); fileOut.close();
			   //					---------------------------------------------------------------
			   
			   //Deserialization = 	The reverse process of converting a byte stream into an object.
			   //					(Think of this as if you're loading a saved file)
			   
			   //					Steps to Deserialize
			   //					---------------------------------------------------------------
			   //					1. Your class should implement Serializable interface
			   //					2. add import java.io.Serializable;
			   //					3. FileInputStream fileIn = new FileInputStream(file path);
			   //					4. ObjectInputStream in = new ObjectInputStream(fileIn);
			   //					5. objectNam = (Class) in.readObject();
			   //					6. in.close(); fileIn.close();
			   //					---------------------------------------------------------------
			   
			   // important notes	1. children classes of a parent class that implements Serializable will do so as well
			   //					2. static fields are not serialized (they belong to the class, not an individual object)
			   //					3. Fields declared as "transient" aren't serialized, they're ignored
			   //					4. the class's definition ("class file") itself is not recorded, cast it as the object type
			   //					5. serialVersionUID is a unique version ID 
			   
			   //SerialVersionUID =	serialVersionUID is a unique ID that functions like a version #
			   //					verifies that the sender and receiver of a serialized object,
			   //					have loaded classes for that object that are compatible
			   //					Ensures object will be compatible between machines
			   //					Number must match. otherwise this will cause a InvalidClassException
			   //					A SerialVersionUID will be calculated based on class properties, members, etc.
			   //					A serializable class can declare its own serialVersionUID explicitly (recommended)
			   
		      User user = new User();
		      
		      user.name = "Bro";
		      user.password = "I<3Pizza";
		      
		      try {
		         FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		         out.writeObject(user);
		         
		         out.close();
		         fileOut.close();
		         System.out.println("Object saved!");
		      } catch (IOException i) {
		         i.printStackTrace();
		      }
		      
		      long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
		      System.out.println("serialVersionUID: "+serialVersionUID);
		   }
		

	}


