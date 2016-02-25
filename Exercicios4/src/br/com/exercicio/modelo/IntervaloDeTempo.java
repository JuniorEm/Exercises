package br.com.exercicio.modelo;

public class IntervaloDeTempo {
	int hh;
	int mm;
	int ss = 0;
	int tempo;
	int tt = 0;
	
	public IntervaloDeTempo (int tempo) {
		this.tempo = tempo; //3500
	}
	
	public String getTempo() {
		/*
			while (ss < tempo) {
				ss = ss + 1;
			
				if (ss == 59) {
					mm = mm + 1;
					ss = 0;
				}
			
				if (mm == 59) {
					hh = hh + 1;
					mm = 0;
				}
			
			}*/
		
		//Enquanto 0 for menor do que 150
		while (tt < tempo) { //enquanto 0 < 150
			
			if (ss > 59) { //se segundo for igual a 60
				ss = ss + 1;
				mm = mm + 1; //minuto acrescente um
				ss = 0;
			}
			

			
			
			
			if (mm > 59) {
				hh = hh + 1;
				mm = 0;
				ss = 0;
			}
			
	
			
	
	     ss = ss + 1; //acrescente um segundo
		 tt = tt + 1; //acrescente um
		 
		}

		
		return + hh + " hora(s), " + mm + " minuto(s), " + ss + " segundo(s)";
	}
		
}
