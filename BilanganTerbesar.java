public class BilanganTerbesar {
	public static void main(String [] args) {
	int A = 23;
	int B = 15;
	int C = 8;
	
	int x1 = A > B? A : B;
	int x2 = C > x1? C : x1;
	
	System.out.println("Nilai pertama :"+A);
	System.out.println("Nilai kedua :"+B);
	System.out.println("Nilai ketiga :"+C);
	System.out.print("Nilai Terbesar adalah :"+x2);
	}
}

//mencari nilai terbesar dalam suatu tabel data
//menggunakan fungsi if segaris
//sintax nya (yg diuji) (kondisi pengujian) ? (True) : (False);
//by Iman M - 1641808