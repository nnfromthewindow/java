
public class Fish implements Prey,Predator {
	

	@Override
	public void hunt() {
		System.out.println("The fish is hunting smaller fish");
	}

	@Override
	public void flee() {
		System.out.println("The fish is fleeing from bigger fish");
	
	}
	
	

}
