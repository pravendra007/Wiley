
public class Fibonacci {
	int n;

	public Fibonacci(int n) {
		this.n = n;
	}

	public Fibonacci() {
		this.n=5;
		// TODO Auto-generated constructor stub
	}
	
	public void printSeries() {
		int a=0,b=1;
		System.out.print(a+" "+b);
		
		for(int i=0;i<n-2;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		System.out.println();
	}
}
