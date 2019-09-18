package view;
import java.util.ArrayList;

import model.Dia;
import parser.Weather;

public class Prueba {

	public static void main(String[] args) {
		Weather weather = new Weather();
		ArrayList<Dia> dias = weather.getDias();
		for (Dia dia:dias) {
			System.out.println(dia);
		}		
	}
}
