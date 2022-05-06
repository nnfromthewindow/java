import java.io.Serializable;

public class User implements Serializable {
 
	private static final long serialVersionUID = 123;
	
	String name;
	transient String password; //transient values are ignored
   
	public void hello() {
		System.out.println("Welcome "+name);
	}
}