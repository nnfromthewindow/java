import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main2 {

	public static void main(String[] args) {

//----------------------------------------------------------
//BREAK CAMEL CASE		
/*		
		String camel = "camelCasing";
		System.out.println(Solution.camelCase(camel));			
	}

}
class Solution {
	  public static String camelCase(String input) {
	
		  String out = "";
	
		 for(int i = 0 ; i< input.length(); i ++) {
			 char ch = input.charAt(i);
				if(ch>='a' && ch<='z') out+= ch;
				if(ch>='A' && ch<='Z') out+= " "+ch;	
		 }
		  			   
		  return out;
		  //  return input.replaceAll("([A-Z])", " $1");  //Esto solo  
	  }
	}
//-----------------------------------------
*/
//REGEX (REGULAR EXPRESSIONS) EXAMPLES
//		
//		String reg = "A bAA  cAAA,dAAAA.eAAAA32";
//		// Removes whitespace between a word character and . or ,
//		String pattern = "(\\w)(\\s+)([\\.,])";
//		System.out.println(reg.replaceAll(pattern, "$1$3"));
//------------------------------------------------------
//COUNT A SPIRAL
/*		
		BigInteger sp = new BigInteger("8");	
	System.out.println(Spiral.sum(sp))	;
		
		}	
	}
	//5,4,4,2,2
	//7,6,6,4,4,2,2
	//8,7,7,5,5,3,3,1
//Tengo que hacer que a mi numero se le sume el anterior dos veces y que se le sume a los dos anteriores dos veces del anterior a mi numero de manera 
//repetida hasta que el resultado sea mayor que cero


class Spiral {
		    public static BigInteger sum(BigInteger size) {
		    	

		   // 	return size.add(BigInteger.ONE).pow(2).shiftRight(1).subtract(BigInteger.ONE);
		
		    	   BigInteger res = size.multiply(size).divide(new BigInteger("2"));
		    	      if ( size.mod(new BigInteger("2")).equals(BigInteger.ZERO)){
		    	        return res.add(size).subtract(BigInteger.ONE);
		    	      }
		    	        return res.add(size);
		    }
		}
*/		
//---------------------------------------------		
//Kingdoms Ep4: The Dancing Witch	
		/*
		String[] ex1 = {"a b", " ba"};
		String[] ex2 = {"ab kl", "ba kl", "a blk"};
		String[] ex3 ={"hop", "hpo", "pho"};	
		String[] ex4 = {"abdgefc", "adbegcf", "daebgfc", "adegfcb", "aedfgbc", "adegfcb", "dagecfb", "adegfcb", "adgefbc"};
		
//		Kata.figureOut(ex2);
		System.out.println(Kata.figureOut(ex1));
		System.out.println(Kata.figureOut(ex2));
		System.out.println(Kata.figureOut(ex3));
		System.out.println(Kata.figureOut(ex4));
	}	
}
*/
/*
 //Usa Hashmap porque le puedo asignar un clave y un valor, siendo en este caso un Character la clave y un Integer el valor (seria el index del char)
 //En el primer loop le asigna a j con getOrDefault la clave charAt(i) y le asigna el valor -1 para luego con .put agregar la clave de charAt(i) y el valor de i
 //Entonces con el if checkeo que si restando j(que es el index anterior de mi clave) a i (que es el index actual) si la diferencia es mayor que uno
 //me retorne la substring de entre i(seria mi actual char) y i+1 (para que me retorne un solo caracter)
   
 class Kata {
  public static String figureOut(String[] arr) {
    HashMap<Character, Integer> h = new HashMap<>();
    
    for(String s : arr) {
      for(int i = 0, l = s.length(), j; i < l; i++) {
        if(s.charAt(i) == ' ') { continue; }
        j = h.getOrDefault(s.charAt(i), -1);
        if(j >= 0 && Math.abs(i - j) > 1) {
          return s.substring(i, i + 1);
        }
        h.put(s.charAt(i), i);
      }
    }
    
    return null;
  }
}
*/		
/*
 class Kata {
    static Map<Character, Integer> getIndexes(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ') map.put(s.charAt(i), i);
        return map;
    }

    public static String figureOut(String[] arr) {
        Map<Character, Integer> a, b;
        for (int i = 0; i < arr.length - 1; i++) {
            a = getIndexes(arr[i]);
            b = getIndexes(arr[i + 1]);
            for (char c : a.keySet())
                if (Math.abs(a.get(c) - b.get(c)) > 1) return c + "";
        }
        return null;
    }
}
*//*
 class Kata {
	  public static String figureOut(String[] arr) {
	    for (int i = 1; i < arr.length; i++) {
	      for (char c : arr[i].toCharArray()) {
	        if (c != ' ' && Math.abs(arr[i].indexOf(c)-arr[i-1].indexOf(c)) > 1) {
	          return Character.toString(c);
	        }
	      }
	    }
	    return null;
	  }
}*/
//--------------------------------------------
//GAP IN PRIMES
/*
int gap = 2;
long st = 100;
long fin = 200;

System.out.println(GapInPrimes.gap(gap, st, fin));
//GapInPrimes.gap(gap, st, fin);

	}
}

class GapInPrimes {
    
    public static long[] gap(int g, long m, long n) {
    	
    	long[] result = new long[2]; 
    	int count = 0;
    	for(long i = m; i<=n ; i++) {
    		isPrime(i);
    		if(isPrime(i)==true) {
    			result[count] = i;
    			count++;
    			if(result[1]-result[0]==g) {
        			System.out.println(result[0] +"," + result[1]);
        			return result;
        		}
    		}
    		if(count==2) {
    			result[0] = result [1];
    			count--;
    		   	}
        	}
        	    	
    	return null ;
    }
    
    static boolean isPrime(long numToCheck) {
    	
    	if(numToCheck==0 || numToCheck==1) return false;
    	
    	for(long i = 2; i<numToCheck/2 ; i++) {
    		long flag=0;
    		if(numToCheck%i == 0) {
    			flag = 0;
    		}else {
    			flag++;
        		}
    		if (flag==0)return false;
    		
    		}
    	
    	return true;
    	}
}
*/
//------------------------------------------------------
//LONGEST PALINDROME
/*
String test = "aab";
System.out.println(Palindromes.longestPalindrome(test));
		
		
	}		
}
		
 class Palindromes {
    public static int longestPalindrome(final String s) {
        int result = 0;        
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j > i; j--) {
                StringBuilder sb = new StringBuilder(s.subSequence(i, j));
                if (sb.length() <= result) break;
                if (sb.toString().equals(sb.reverse().toString())) {
                    result = sb.length();
                    break;
                }
            }
        }
        return result;
    }
}
	
*/
//-----------------------------------------
//Duplicate Encoder
/*		
String test = "(( @";
		

System.out.println(DuplicateEncoder.encode(test));
	}
}

class DuplicateEncoder{
	public static String encode(String word) {
		
		String sLow = word.toLowerCase();
	
		char [] res = new char[word.length()];
		
		for(int i = 0 ; i<word.length() ; i++) {
		res[i]='(';	
			for(int j = 0 ; j<word.length() ; j++) {
				
				if(i==j)continue;
				
				if(sLow.charAt(i)==sLow.charAt(j)) {
					res[i]= ')';
				}
			}
		}
		
		 String result = new String(res);

		return result;
	}
}
*/
//------------------------------
//Give me a Diamond
/*		
int test = 9;		
System.out.println(GiveMeADiamond.diamond(test));
	}
}

class GiveMeADiamond{
	public static String diamond(int n) {
		
		
		if(n%2 == 0)return null;
		if(n==1) return "*\n";
		if(n<0) return null;
		
		StringBuilder result = new StringBuilder();
		
			
		int indexBlank= Math.round(n/2);
	
				
		for(int i=1; i<=n; i++) {
									
			if(i==1) {
				for(int j=1; j <= indexBlank; j++) {
					result.append(" ");
				}
					result.append("*").append("\n");
					indexBlank--;
			}
			
			
			if(i%2 != 0 && i!=1 && i!= n) {
				for(int j=1; j <= indexBlank; j++) {
					result.append(" ");
				}
				for(int k=1; k <= i ; k++) {
					result.append("*");
				}
				result.append("\n");
				indexBlank--;
			}
			
			if(i==n) {
				for(int j=1; j<=n; j++)result.append("*");
				result.append("\n");
			}
		}
		indexBlank = 1;
		for(int i = n-2 ; i>0 ; i--) {
			
			if(i%2 != 0 && i!=1 && i!= n) {
				for(int j=1; j <= indexBlank; j++) {
					result.append(" ");
				}
				for(int k=1; k <= i ; k++) {
					result.append("*");
				}
				result.append("\n");
				indexBlank++;
				}
			if(i==1) {
				for(int j=1; j <= indexBlank; j++) {
					result.append(" ");
				}
					result.append("*" + "\n");
			}
		}	

		return result.toString();
	}

}
*/
//--------------------------------------
//Simple Encryption #1 - Alternating Split
		
System.out.println(Kata.decrypt(null,0 ));
	}
}
	class Kata{
		public static String encrypt (final String text ,final int n) {
			
		String result = text;
		
			for(int i = 1; i<=n ; i++) {
			result = enc(result);
			//System.out.println(S);
		}
			
			return result;
		}
		
		public static String enc (String x) {
		
			String st = "";
			
			for(int i = 0 ; i<x.length();i++) {
				if(i !=0 && i%2!=0) {
				st+=x.charAt(i);
				}
			}
			for(int i = 0 ; i<x.length();i++) {
				if(i%2==0) {
					st+=x.charAt(i);
				}
			}
			x = st;
			return x;
		}
		public static String decrypt (final String encryptedText , final int n) {
			
			String result = encryptedText;
			
				for(int i = 1; i<=n ; i++) {
				result = dec(result);
				//System.out.println(S);
			}
				
				return result;
			}
			
			public static String dec (String x) {
			
				String st = "";
				
				String st1 = x.substring((int)Math.ceil(x.length()/2), x.length());
				String st2 = x.substring(0, (int)Math.ceil(x.length()/2));
			
				
				try {
					for(int i = 0 ; i<x.length();i++) {
						st+= st1.charAt(i);
						st+= st2.charAt(i);
						
					}
				} catch (Exception StringIndexOutOfBoundsException) {
					
				}
				
				x = st;
				return x;
			}
		
	}



