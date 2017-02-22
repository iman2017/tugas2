public class Latihan2 {
	public static void main(String[] args) {
		int nilai1 = 10;
		int nilai2 = 20;
		int nilai3 = 45;
		int rata1= nilai1+nilai2+nilai3;
		float rata2 = rata1 / 3;
		System.out.println("number 1 = "+nilai1);
		System.out.println("number 2 = "+nilai2);
		System.out.println("number 3 = "+nilai3);
		System.out.println("Rata-rata = "+rata2);
		
		int n1 = 23;
		int n2 = 75;
		int n3 = 55;
		//int x2 = ();
		int x1 = n1 < n2 ? n2 : n1 ;
		int x2 = n3 < x1 ? x1 : n3 ;
		System.out.println("Nilai terbesar :"+x2);
	}
}