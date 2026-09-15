import java.util.*;
class CalendarDemo {
	public static void main(String[] args) {
		// create calendar class object . by default it contains the system date and time
		Calendar cl =Calendar.getInstance();

		// Display date separetely
		System.out.print("Current date :");
		int dd=cl.get(Calendar.DATE);
		int mm=cl.get(Calendar.MONTH);
		++mm;
		int yy=cl.get(Calendar.YEAR);
		System.out.println(dd+ " / "+mm+" / "+yy );

		//display time alone
		System.out.print("Current time:");
		int h=cl.get(Calendar.HOUR);
		int m=cl.get(Calendar.MINUTE);
		int s=cl.get(Calendar.SECOND);
		System.out.println(h+ ":" + m+":"+s);

		int x=cl.get(Calendar.AM_PM);
		if(x==0) System.out.println("Good Morning");
		else System.out.println("Good Evening");
	}
	
}
