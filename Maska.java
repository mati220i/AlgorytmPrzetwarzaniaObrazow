package GrafikaProjekt;

import java.util.Random;

public class Maska {
	//Predefiniowana maska
	private int[] filtrUsredniajacy = {
						1, 1, 1, 1, 1,
						1, 1, 1, 1, 1,
						1, 1, 1, 1, 1,
						1, 1, 1, 1, 1,
						1, 1, 1, 1, 1
					};
	
	//Predefiniowana maska
	private int[] filtrHP3 = {
				-1, 0, 0, 0, 0,
				0, -1, 0, 0, 0,
				0, 0, 1, 0, 0,
				0, 0, 0, 0, 0,
				0, 0, 0, 0, 0
			};
	
	//Predefiniowana maska
	private int[] pionowyFiltrSobela = {
			2, 1, 0, -1, -2,
			3, 2, 0, -2, -3,
			4, 3, 0, -3, -4,
			3, 2, 0, -2, -3,
			2, 1, 0, -1, -2
		};
	
	
	private int[] wylosujMaske() {
		Random rand = new Random();
		final int rozmiarMaski = 5;
		
		int[] losowaMaska = new int[rozmiarMaski * rozmiarMaski];
		
		for(int i=0; i<rozmiarMaski; i++) {
			losowaMaska[i] = rand.nextInt(30);
		}
		
		return losowaMaska;
	}
	
	
	public int[] pobierzMaske(Typ typ) {
		if(typ == Typ.USREDNIAJACY)
			return this.filtrUsredniajacy;
		if(typ == Typ.HP3)
			return this.filtrHP3;
		if(typ == Typ.PIONOWY_SOBELA)
			return this.pionowyFiltrSobela;
		if(typ == Typ.LOSOWY)
			return this.wylosujMaske();
		
		return null;
	}

}
