
public class Metropolis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("New York ist eine Metropole: " + isMetropolis(true, 200000, 5000));
		System.out.println("Graz ist eine Metropole: " + isMetropolis(false, 10000, 5000));
		
	}
	
	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
		return ((isCapital=true && inhabitants >= 100000) || 
			(inhabitants >= 200000 && taxPerPersonAndMonth * 12 * inhabitants >= 720000000));
	
	}

}
