package ed.genradorIp;

import java.util.Random;

public class GeneradorIp {
	public int generarNumero(int min, int max)
	{
		Random rnd = new Random();
		return min + rnd.nextInt(max - min + 1);
	}
	
	public String generarIp()
	{
		String stringBuilderString = "";
		for (int i = 0; i < 4; i++) {
			if (i == 0){
				stringBuilderString += generarNumero(1, 254) + ".";
			}else if (i == 3) {
				stringBuilderString += generarNumero(1, 254);
			}else {
				stringBuilderString += generarNumero(0, 254) + ".";
			}
		}
		
		return stringBuilderString;
	}
}
