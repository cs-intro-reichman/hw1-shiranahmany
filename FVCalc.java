// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int invest = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		int yr = Integer.parseInt(args[2]);
		double calc = invest * (p/100.0);
		calc += invest;
		System.err.println("After " + yr + " years, " + invest + "$ saved at " + (int)p + "% will yield " 
		+ (int)calc + "$");
	}
}