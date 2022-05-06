import java.lang.reflect.Array;
import java.util.Arrays;

/*
public class Main {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		System.out.println(sol.whoLikesIt());
		System.out.println(sol.whoLikesIt("Peter"));
		System.out.println(sol.whoLikesIt("Jacob", "Alex"));
		System.out.println(sol.whoLikesIt("Max", "John", "Mark"));
		System.out.println(sol.whoLikesIt("Alex", "Jacob", "Mark", "Max","Nico","Mario","Sol"));
		
		
	}

}
					//v v v v estos argumentos retornan la variable?
class Solution {			
    public static String whoLikesIt(String... names) {
     
    
    	String nombre = new String();
    	   int nlike = names.length;
    	   
    	if(nlike==0) {
    		return "no one likes this";
    	}
    	if(nlike==1) {
    		return names[0] + " likes this";
    	}
    	if(nlike==2) {
    		return names[0] + " and " +  names[1] + " like this";
    	}
    	if(nlike==3) {
    		return names[0] + ", " + names[1] + " and " + names[2] + " like this";
    	}
    	if(nlike>=4) {
    		return names[0] + ", " + names[1] + " and " + (nlike - 2) + " others like this";
    	}
    	
    	return nombre;
    }
}

*/
//People in the Bus

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	/*	
		 System.out.println("Basic Tests");
		 BasicOperations basicOps = new BasicOperations();
		 basicOps.basicMath("+", 4, 7);
		 System.out.println(basicOps.basicMath("+", 4, 7));
		 System.out.println(basicOps.basicMath("-", 15, 18));
		 System.out.println(basicOps.basicMath("*", 5, 5));
		 System.out.println(basicOps.basicMath("/", 49, 7));
	}
}
class BasicOperations {
	
  public static Integer basicMath(String op, int v1, int v2){
	  	
	  Integer suma = v1 + v2;
	  Integer resta = v1 - v2;
	  Integer mult = v1 * v2;
	  Integer div = v1 / v2;
	  Integer result = 0;
	  
	  switch(op.charAt(0)) {
	  case '+' : result=(suma+result);
	  break;
	  case '-' : result=(resta+result);
	  break;
	  case '*' : result=(mult+result);
	  break;
	  case '/' : result=(div+result);
	  break;
	  }
	  
	  
    return result;
  }
}
		 

/*		System.out.println(Kata.solution("world"));	
	
	}
//Dar vuelta un String : uso un for loop para castear a la inversa, creo una variable String "" vacia y le sumo esa misma String mas los caracteres casteados de i  
// Tambien se puede hacer con un String Builder como copio luego
	public class Kata {

	  public static String solution(String str) {
		 
		String name = "";
		int i = 0;
					
			for(i=str.length()-1;i>-1;i--) {
				name = name + str.charAt(i);
						}
			return name;	
	  }
}
}/*
public class Kata {

  public static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }

}
	
*/		
/*
		Metro metro = new Metro();
		ArrayList<int[]> list = new ArrayList<int[]>();
		list.add(new int[] {10,0});
		list.add(new int[] {3,5});
		list.add(new int[] {2,5});
		
		System.out.println(metro.countPassengers(list));

	}
		
}
*/

//MI SOLUCION
/*
class Metro {

  public static int countPassengers(ArrayList<int[]> stops) {
	  

	  int passin = 0;
	  int passout = 0;
	 
	  
	  for(int i=0;i<stops.size();i++) {
		  passin= passin + stops.get(i)[0];
	  }
	  for(int i=0;i<stops.size();i++) {
		  passout= passout + stops.get(i)[1];
	  }		 
	  
	  int result = passin - passout;
	  
	 	  	  
	  return result ;
	  
  }
}
*//*
//SOLUCION MAS CORTA USANDO mapToInt y lamda operator
class Metro {

	  public static int countPassengers(ArrayList<int[]> stops) {
	    return stops.stream()
	                .mapToInt(x -> x[0] - x[1])
	                .sum();
	  }
	}

*/
//------------------------------------------
//SORT THE ODD
		
	/*	
		int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		int[] arr2 = {5, 8, 6, 3, 4};
		int[] arr3 = {7, 1};
		
	//	for(int i = 0;i<lista.length;i++) {
		//Arrays.sort(array2);
		//System.out.println(array2[0]);
		
		Kata.sortArray(arr1);
		//Kata.sortArray(arr2);
		//Kata.sortArray(arr3);
	}

}

class Kata {
	  public static int[] sortArray(int[] array) {
		  	
				  		  
		  for(int i = 0;i<array.length;i++) {
			  int min=i;
		
				for(int j = i + 1;j<array.length;j++) {
					if(array[j]%2!=0 && array[min] > array[j] && array[min]%2!=0) {
						 min=j;
							}
					}
					
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
							
				System.out.print(array[i]);
			  }
		  		return array; 
	  }
	}

*/
//---------------------
//MULTIPLES OF 3 OR 5 
	/*	
		int x=10;
		Solution sol = new Solution();
		System.out.println(sol.solution(x));
		
	}
}

	class Solution {
		
		  public int solution(int number) {
				  
			 int suma= 0;
			  
			 for(int i=0;i<number;i++) {
				 if(i%3==0 || i%5==0 )
				 suma = i + suma;
			 	}
			  	return suma;
			  	}
		}
*/
//-----------------------------------------		
//Array.diff NO SALIO		
/*		

		int[] array1 = {1, 5, 2, 2, 3};
		int[] array2 = {2};
		//int[] result= Kata.arrayDiff(array1, array2);
		Kata.arrayDiff(array1, array2);
//		System.out.println(result[0]);
				
		}	
	}
		class Kata {

			  public static int[] arrayDiff(int[] a, int[] b) {
			    				  
				   for(int i = 0; i < b.length; i++){
					      for(int j = 0; j < a.length; j++){
					        if(b[i] == a[j]){
					          int[] anotherArray = new int[a.length-1 ];//COMO ESTA DENTRO DE EL FOR EN CADA VUELTA QUE ENCUENTRA LA IGUALDAD RESTA 1 AL LENG	
					       
					          for (int g = 0, k = 0; g < a.length; g++) {
					              if (g == j) {
					                  continue;	//RESCATO LOS INDICES 0,1 Y 3, YA QUE CUANDO g Y j SEAN IGUALES VA A SALTAR LA ITERACION CON EL continue
					              }
					              anotherArray[k++] = a[g];   	
					          }
					          a = arrayDiff(anotherArray,b);//UTILIZO RECURSION PARA REEMPLAZAR a POR MI NUEVA ARRAY anotherArray 	
					        }
					      }
					  
					    }
					    
					    return a;
					  }

					}
			  		
*/		
//----------------------------------------------
//TAKE A TEN MINUTE WALK
		
		char[] cadena = {'n','n','n','s','n','s','n','s','n','s'}; 
		
		//TenMinWalk.isValid(cadena);
		System.out.println(TenMinWalk.isValid(cadena));
		//System.out.println((int)cadena[3]);
	}
}
	 class TenMinWalk {
			  public static boolean isValid(char[] walk) {
				  int n=0;
				  int s=0;
				  int e=0;
				  int w=0;
				  
				  if(walk.length!=10) return false;
				  
				  for(int i = 0 ;i<walk.length;i++) {
					 if(walk[i]=='n') n++;
					 if(walk[i]=='s') s++;
					 if(walk[i]=='e') e++;
					 if(walk[i]=='w') w++;
					 				 
				  }
				  
				  if(n-s!=0 || e-w!=0) return false;
				
				  return true;
			  }
	 }
	 
	
		
		
		
		
		