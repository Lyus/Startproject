package speed;

public class duration {

	private static void getDurationString(int min, int sec) {

		if(min <= 0) {
			System.out.println("invalud value");
			return;
		}

		if(sec < 0 || sec > 59 ) {
			System.out.println("invalud value");
			return;
		}

		int res = convertHour(min);
		if(res > 1)
		System.out.println(String.valueOf(res) + " h " +  String.valueOf(min%60)  + " min " + String.valueOf(sec) + " sec" );
		else
			System.out.println( String.valueOf(min%60) + "  min " +  String.valueOf(sec) + " sec");
			
	}
	
	private static void getDurationString( int sec) {


		if(sec < 0 ) {
			System.out.println("invalud value");
			return;
		}
		int min = convertMin(sec);
		int hour = convertHour(min);
		int days = convertDay(hour);
		if(days > 0)
			System.out.println(String.valueOf(days) + " jours " + String.valueOf(hour%24) + " h " +  String.valueOf(min%60)  + " min " + String.valueOf(sec%60) + " sec" );
		else if(hour > 0)
		System.out.println(String.valueOf(hour) + " h " +  String.valueOf(min%60)  + " min " + String.valueOf(sec%60) + " sec" );
		else if (min > 0)
			System.out.println( String.valueOf(min) + "  min " +  String.valueOf(sec%60) + " sec");
		else
			System.out.println( String.valueOf(sec) + " sec");
	}
	private static int convertDay(int heure) {

		if(heure < 24) 
			return 0;

		int day = heure/24;
		return day;

	}
	private static int convertHour(int min) {

		if(min < 60) 
			return 0;

		int heure = min/60;
		return heure;

	}
	private static int convertMin(int sec) {

		if(sec < 60) 
			return 0;

		int min = sec/60;
		return min;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m={
			    {200, 59},
			    {600, 70},
			    {0, 50},
			    {25, 42},
			    {75, 114}
			};
		for(int i = 0; i < m.length; i++){
		
		getDurationString(m[i][0], m[i][1] );
		}
		int[][] mp={
			    {200},
			    {0},
			    {2000},
			    {150},
			    {75},
			    {59},
			   {1000000}
			};
		for(int i = 0; i < mp.length; i++){
		
		getDurationString(mp[i][0] );
		}

	}

}
