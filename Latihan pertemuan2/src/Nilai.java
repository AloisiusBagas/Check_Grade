import java.util.Scanner;

public class Nilai {

	public static String checkgrade(int n){
		String grade = null;
		if(n<=100 && n>= 90){
			grade = "A";
		}else if(n<=89 && n>= 85){
			grade = "A-";
		}else if(n<=84 && n>= 80){
			grade = "B+";
		}else if(n<=79 && n>= 75){
			grade = "B";
		}else if(n<=74 && n>= 70){
			grade = "B-";
		}else if(n<=69 && n>= 65){
			grade = "C";
		}else if(n<=64 && n>= 50){
			grade = "D";
		}else if(n<=49 && n>= 1){
			grade = "E";
		}else{
			grade = "F";
		}
		return grade;
	}
	
	public static void print(int jumlah, int nilai[], String grade[]) {
		System.out.println("|no | data           | Nilai  | Grade |");
		System.out.println("=======================================");
		for(int i=0;i<jumlah;i++) {
			System.out.printf("|%-3d|" + "anak ke-"+ (i+1) + "       |" + "%-8d|" + "%-7s|\n",(i+1),nilai[i],grade[i]);
		}
	}
	
	public static void main(String[] args) {			
		
		int jumlah = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukan Jumlah mahasiswa : ");
		try {
			jumlah = sc.nextInt();
		} catch (Exception e1) {
			System.out.println("Harus angka!!");
		} 
		sc.nextLine();
		
		 
		 String grade[] = new String[jumlah];
		 int data[] = new int[jumlah];
		for(int i=0;i<jumlah;i++) {
			System.out.print("Nilai anak ke " + (i+1) + " : ");
			try {
				data[i] = sc.nextInt(); 
				grade[i] = checkgrade(data[i]);
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("Harus angka!!");
			}
		}
		sc.nextLine();
		sc.nextLine();
		
		print(jumlah,data,grade);

		
	}

}
