import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	/*	
		int value = 123456789;
	System.out.println(DescendingOrder.sortDesc(value));
		

	}

}

 class DescendingOrder {
	  public static int sortDesc(final int num) {
		  
	String n = Integer.toString(num);
	char[] arr = n.toCharArray();
	
	for(int i = 0; i < arr.length ; i++) {
		int min = i;
		for(int j = i + 1; j < arr.length; j++) {
			if(arr[min] < arr[j]) {
				min = j;
			}
		}
		
		int temp = arr[i];
		arr[i] = arr[min];
		arr[min] = (char) temp;
		
		}
		int x = Integer.parseInt(new String(arr));
	
		  return x;
	*/
		
//----------------------------------------
//TWO SUM
		
		/*
	int[] arr = {1,2,3,5};
	int tar = 7;
	Solution.twoSum(arr, tar); 	
	}

	class Solution{
			
		    public static int[] twoSum(int[] numbers, int target){
		    	
		    	int[]ar = new int[2];
		    	
		    	  for(int i=0; i<numbers.length;i++) {
		    		for(int j=0; j<numbers.length;j++) {
		    			if(numbers[i]+numbers[j]==target) {
		    			ar[0] = j;
		    			ar[1] = i;
		    				}
		    			}
		    		}
		    	
		    	  return ar;
		    	  }
		    }
	}
*/
//------------------------------------------------------
//DUBSTEP
	/*
		//String dub = "WUBWUBABCWUB";
		//System.out.println(Dubstep.SongDecoder(dub));
		String dub2 = "RWUBWUBWUBLWUB";
		System.out.println(Dubstep.SongDecoder(dub2));
		//String dub3 = "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
		//System.out.println(Dubstep.SongDecoder(dub3));
	}
	
	class Dubstep {
		  public static String SongDecoder (String song) {
			
			String st =  song.replaceAll("(WUB)+", " ").trim(); // (WUB)+ El + significa que las n cantidad de veces que se repita WUB lo toma como uno solo
			String st2 =  song.replaceAll("WUB", " ").trim();
	
			
			System.out.println(st);
			System.out.println(st2);


			  String[] newst = song.split("WUB");
			  String lis = "";
			  
			  for(int i =0; i<newst.length;i++) {
				if(newst[i] != "") {
					lis += newst[i] + " " ;
					song=lis.trim();
					
					}
				   }
			
			  return song;
		  }
	 	}
}
*/
//------------------------------------------------------------
//PRODUCT OF CONSECUTIVE FIB NUMBERS		
	
/*		
		
		ProdFib.productFib(4895);
		//System.out.println(r);
	}
	public class ProdFib { // must be public for codewars	
		
		public static long[] productFib(long prod) {
	    
		long tf= 0;	
		long x = 0;
		long y = 1;
		long [] fib = {x,y,tf};	
		
		for(int i =2; i>0;i++) {
			fib[0]=y;
			fib[1]=x+y;
			x = fib[0];
			y = fib[1];
			if(fib[0]*fib[1]==prod) {
				fib[2]=1;
				System.out.println(fib[0]+","+fib[1]+","+fib[2]);
				return fib;
			
			}
			if(fib[0]*fib[1]>prod) {
				
				System.out.println(fib[0]+","+fib[1]+","+tf);	
				return fib ;
			}
							
		}
		return null;	
	   }
	}
	
}		
		
*/
//-----------------------------------
//FULL WALLY
		
	Random random = new Random();
	int [] dados = new int[5];
	
	for(int i = 0; i<dados.length;i++) {
		dados[i]= random.nextInt(1,7);
		
		System.out.println(dados[i]);
	}
		Dado.dadosfull(dados);
	}		

	public class Dado { 
		
		public static int[] dadosfull(int[] full) { 
			
			for(int i = 0; i < full.length ; i++) {
				int min = i;
				for(int j = i + 1; j < full.length; j++) {
					if(full[min] > full[j]) {
						min = j;
					}
				}
				
				int temp = full[i];
				full[i] = full[min];
				full[min] = temp;
			
				if(full[0]==full[1] && full[1]==full[2] && full[3]==full[4] ) {
					System.out.println("Sacaste Full");
					return full;
			}
				if(full[4]==full[3] && full[3]==full[2] && full[0]==full[1] ) {
					System.out.println("Sacaste Full");
					return full;
			}
		}	
			return full; 
		}	
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	