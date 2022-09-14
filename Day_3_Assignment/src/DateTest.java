
public class DateTest {
		public static void main(String[] args) {
		
			Date date1=new Date();
			date1.displayDate();
			System.out.println(date1.checkDate()? "Valid Date":"Invalid Date");
			
			System.out.println();
			Date date2=new Date(32,9,2022);
			date2.displayDate();
			System.out.println(date2.checkDate()? "Valid Date":"Invalid Date");
			System.out.println();
		}
}
