public class Main{
	
	public static void main(String[] args) {

		DynamicArray dynamicArray = new DynamicArray();
		
		dynamicArray.add("1");
		dynamicArray.add("2");
		dynamicArray.add("3");
		dynamicArray.add("4");
		dynamicArray.add("5");
		dynamicArray.add("6");
		dynamicArray.add("7");
		dynamicArray.add("8");
		dynamicArray.add("9");
		dynamicArray.add("10");
		dynamicArray.add("11");
		//dynamicArray.add("12");
		//	dynamicArray.insert(8,"FF");
	//dynamicArray.insert(9, "Shit");
		//System.out.println(dynamicArray.get(0));
		//dynamicArray.insert(0, "X");
	//	dynamicArray.delete("C");
		//System.out.println(dynamicArray.search("C"));
		
		System.out.println(dynamicArray);
		System.out.println("size: " + dynamicArray.size);
		System.out.println("capacity: " + dynamicArray.capacity);
		System.out.println("empty: " + dynamicArray.isEmpty());
	}
}
 
