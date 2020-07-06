
public class digit {

	private static void length(String stringchars) {
		int numb = stringchars.length();
		int test = numb - 1;
		int [] m = new int[test];


//initialisé le tableau de int
		for(int i = 0; i < numb-1; i++) {		
			m[i] = Integer.parseInt(stringchars.substring(i, i+1));
		}
//initialisé les variable
		String z =  m[0]  +"";  String result = "";
		
		
		for(int i = 1; i < m.length; i++) {	
			
			int a = m[i - 1]; int b = m[i];

			if( a == b - 1 ) {
				z = z  + b;
			}
			else{
				if(z.length() > result.length()) {
					result = z;
				}
				z = "";	
			}
		}	
		System.out.println("result " + result);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		length("12345123425678910123456123345678");

	}

}
