import java.util.Random;

public class ArvoNumero {

	public static void main(String[] args) {
		// Vaihe 1

		// Tee peli, joka arpoo 3 numeroa väliltä 1-10 ja tulostaa numerot. 
		// Jos joku numeroista on seitsemän, kerro käyttäjälle, että voitit. 
		// Jos mikään ei ole seitsemän, kerro käyttäjälle, että hävisit. Lopuksi ohjelma loppuu.
		
		Random random = new Random();
		
		// arvotaan numero väliltä 0-9 ja lisätään 1, jotta saadaan numero väliltä 1-10.
		int n1 = random.nextInt(10) + 1;
		int n2 = random.nextInt(10) + 1;
		int n3 = random.nextInt(10) + 1;
		
		if (n1 == 7 || n2 == 7 || n3 == 7) 
		{
			System.out.println("Voitit!");
			System.out.println(n1 + " , " + n2 + " ja " + n3);
			
		} else {
			System.out.println("Hävisit!");
			System.out.println(n1 + " , " + n2 + " ja " + n3);
		}
		
		// Vaihe 2 Jatka peliä esim. seuraavasti:
		//
		//· Lisää rahat peliin. Käyttäjällä on alussa 5 € rahaa. Joka peli maksaa euron. 
		// Jos yksi arvotuista numeroista on seitsemän, pelaaja voittaa vaikka 3 €. Jos kaksi numeroa on seitsemän, 
		// hän voittaa 5 euroa jne. Kun kaikki rahat ovat loppuneet, peli loppuu.
		//
		//· Tarvitset siis jonkinlaisen toistorakenteen...
		//
		//· Jos menet ihan sekaisin ehtorakenteissa, tehtävänannon lopussa on linkki vuokaavioon.
		
		
		
		// Vaihe 3 Jatka peliä esim. seuraavasti:
		//
		//· Pelaaja voi alussa syöttää rahamäärän, jolla pelaa.
		//
		//· Yhden pelikerran jälkeen kysytään: "Haluatko pelata uudestaan? Jos haluat pelata, paina Enter. 
		// Jos et halua pelata, kirjoita e ja paina Enter."

	}

}
