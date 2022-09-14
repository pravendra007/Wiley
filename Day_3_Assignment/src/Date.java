public class Date {
	int dd;
	int mm;
	int yy;
	
	public Date() {
		// TODO Auto-generated constructor stub
		this.dd=8;
		this.mm=9;
		this.yy=2022;
	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public void displayDate() {
		if(dd<=9 && mm<=9) {
			System.out.println("0"+dd+"-"+"0"+mm+"-"+yy);
		}
		else if(dd<=9 && mm>9) {
			System.out.println("0"+dd+"-"+mm+"-"+yy);
		}
		else {
			System.out.println(dd+"-"+mm+"-"+yy);
		}
	}
	
	public boolean checkDate(){
		if(dd<0 || dd>31)
			return false;
		
		if(mm<0 || mm>12)
			return false;
		
		if(yy<0)
			return false;
		
		return true;
		
	}
	
}