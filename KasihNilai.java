public class KasihNilai {
	public static void main(String [] args) {
		String Nilai = args[0];
			if (Nilai.equals("A")) {
			System.out.print("Excellent");
			} else
				if(Nilai.equals("B")) {
					System.out.print("Good Job");
				} else
					if(Nilai.equals("C")) {
						System.out.print("Study Harder");
					} else
						System.out.print("Sorry, you failed.");
	}
}

//
//compile : C:\javac KasihNilai.javac
//
//running dengan perintah C:\java KasihNilai A
//hasilnya : 
//C:\java KasihNilai A
//Excellent
//