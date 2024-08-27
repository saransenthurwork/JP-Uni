package examp.java;

public class main {
	public int adfun(int x, int y) {
		return x+y;
	}
}


class main1 extends main{
	public static void main(String[] args) {
		main m1 = new main();
		
		System.out.println(m1.adfun(5, 5));
	}
}