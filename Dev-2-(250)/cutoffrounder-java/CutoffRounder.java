public class CutoffRounder {
	public static int round(String num, String cutoff) {
		Double N=Double.parseDouble(num);
		Double C=Double.parseDouble(cutoff);
		if(N-Math.floor(N) >= C)return (int)Math.floor(N)+1;
		return (int)Math.floor(N);
	}
}
