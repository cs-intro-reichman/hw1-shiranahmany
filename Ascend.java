// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int rnd1 = (int)(Math.random() * lim) + 1;
		int rnd2 = (int)(Math.random() * lim) + 1;
		int rnd3 = (int)(Math.random() * lim) + 1;
		System.out.println(rnd1 + " " + rnd2 + " " + rnd3);
		int n1 = Math.min(Math.min(rnd1, rnd2), Math.min(rnd1, rnd3));
		int n2 = Math.max(Math.min(rnd1, rnd2), Math.min(rnd1, rnd3));
		int n3 = Math.max(Math.max(rnd1, rnd2), Math.max(rnd1, rnd3));
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}
