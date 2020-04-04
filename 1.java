//package nebula;



public class Nomor1 {
	public static void main(String[] args){

	int umur = 24;
	int umur2 = 28;
	int thnmsk =2010;
	int thnkeluar = 2013;
	
	String nama = "Prayoga Mutasi";
	String alamat = "Purworejo,Jawa Tengah";
	String[] hobi = {"membaca buku", "memancing", "menonton TV"};
	String[] skill = {"beginner", "advance", "expert"};
	
		
		System.out.print("Nama Saya = " + nama +"\n");
		System.out.print ("Umur Saya = " + umur + "\n");
		System.out.print ("Alamat = " + alamat +"\n");
		System.out.println("Hobi = " +hobi[2]);
		
		if (umur2 > umur ) {
			  System.out.println("Status = Belum");
		} else {
			  System.out.println("Status = Sudah");
			}
		
		
		System.out.println("Tahun masuk =" + thnmsk + " Tahun keluar = " + thnkeluar);
		System.out.println("Skill = " +skill[0]);
		
		boolean isInterestinCoding = true;
	    System.out.println("is Interest in Coding ? = " +isInterestinCoding);
		
		
	}

}
