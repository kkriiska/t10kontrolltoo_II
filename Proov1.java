public class Proov1{
	
	public static void main(String[] arg){
		
		Toiduaine t1 = new Toiduaine("Kartul", 8.0, 10.0, 82.0);
		Toiduaine t2 = new Toiduaine("Hapukoor", 4.8, 40.0, 4.0);
		
		Toidukomponent k1 = new Toidukomponent();
		k1.t = t1;
		k1.kogus = 80.0;	//Grammides
		
		Toidukomponent k2 = new Toidukomponent();
		k2.t = t2;
		k2.kogus = 40.0;    //Grammides
		
		System.out.println(k1.rasvakogus());
		System.out.println(k2.rasvakogus());

	}
	
	
}