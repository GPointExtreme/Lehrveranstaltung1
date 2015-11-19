
public class Temperatur {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(celsius2Fahrenheit(30.0));
		System.out.println(fahrenheit2Celsius(86.0));
	}
	
	// bei double wert immer 0.0 voll ausschreiben sonst kommen andere Werte raus!
	public static double celsius2Fahrenheit(double celsius) {
		double fahrenheit = (9.0/5.0)*celsius+32;
		return fahrenheit;
	}
	
	public static double fahrenheit2Celsius(double fahrenheit) {
		double celsius = (5.0/9.0)*(fahrenheit-32);
		return celsius;
	}

}
