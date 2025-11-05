// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int invest = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);
		int yr = Integer.parseInt(args[2]);
		double calc = Math.pow((1 + (p / 100.0)) , yr);
		int future = (int)(invest * calc);
		System.out.println("After " + yr + " years, $" + invest + " saved at " + p + "% will yield $" 
		+ future);
	}
}