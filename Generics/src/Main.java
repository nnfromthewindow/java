public class Main {

   public static void main(String args[]) {
	  
	   //bounded types = 	you can create the objects of a generic class to have data 
	   //					of specific derived types ex.Number
	   
	   MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
	   MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);   
	   //MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
	   //MyGenericClass<String,Character> myString = new MyGenericClass<>("Hello",'!');
	  
	   	   
	   System.out.println(myInt.getValue());
	   System.out.println(myDouble.getValue());
	  //System.out.println(myChar.getValue());
	  //System.out.println(myString.getValue());
   } 
}

/*
// Generic method
public static <Thing> void displayArray(Thing[] array) {

   for(Thing x : array) {
      System.out.print(x+" ");
   }
   System.out.println();
}

// Generic method with generic return type 
public static <Thing> Thing firstIndex(Thing[] array) {

		return array[0];
}
}*/