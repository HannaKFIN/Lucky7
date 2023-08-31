import java.util.Random;
import java.util.Scanner;

public class ArvoNumero {

	public static void main(String[] args) {
		// Vaihe 1

		// Tee peli, joka arpoo 3 numeroa väliltä 1-10 ja tulostaa numerot. 
		// Jos joku numeroista on seitsemän, kerro käyttäjälle, että voitit. 
		// Jos mikään ei ole seitsemän, kerro käyttäjälle, että hävisit. Lopuksi ohjelma loppuu.
		
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
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		String startingMoney;
		String uudestaan;
		
		// Kysytään käyttäjältä rahamäärä, jolla aloittaa:
		System.out.println("Syötä rahamäärä, jolla aloitat pelin: ");
		startingMoney = sc.nextLine();
		int money = Integer.parseInt(startingMoney);
		
		// Toistetaan niin kauan, kun rahaa on:
		do 
		{
			// Vähennetään pelin hinta eli 1e:
			money = money - 1;	
			
			// Arvotaan numero väliltä 0-9 ja lisätään 1, jotta saadaan numero väliltä 1-10.
		
			int n1 = random.nextInt(10) + 1;
			int n2 = random.nextInt(10) + 1;
			int n3 = random.nextInt(10) + 1;


			if (n1 == 7 || n2 == 7 || n3 == 7) 
			{
				System.out.println("Voitit!");
				System.out.println("Numerosi olivat: " + n1 + " , " + n2 + " ja " + n3);
				
				// Jos vain yksi seiska, lisää 3e:
				
				if ((n1 == 7 && n2 != 7 && n3 != 7) || (n1 != 7 && n2 == 7 && n3 != 7) || (n1 != 7 && n2 != 7 && n3 == 7))
				{
				System.out.println("Sait yhden seiskan. Voitit 3e!");
				money = money + 3;
				}
				
				 // Jos kaksi seiskaa, lisää vielä 2e:
				
				else if ((n1 == 7 && n2 == 7 && n3 != 7 ) || (n1 == 7 && n3 == 7 && n2 != 7 ) || (n2 == 7 && n3 == 7 && n1 != 7 ))
				{
				System.out.println("Sait kaksi seiskaa. Voitit 5e!");
				money = money + 2;
				}
				// Jos kaikki seiskoja, lisää vielä 2e:
				else if (n1 == 7 && n2 == 7 && n3 == 7)
				{
					System.out.println("Sait kolme seiskaa. Voitit 7e!");	
				money = money + 7;
				}
				

			} else {
				System.out.println("Hävisit!");
				System.out.println("Numerosi olivat: " + n1 + " , " + n2 + " ja " + n3);
			}
			
			System.out.println("Sinulla on rahaa jäljellä: " + money + "e");
			System.out.println("");
			
//			"Haluatko pelata uudestaan? Jos haluat pelata, paina Enter. 
			// Jos et halua pelata, kirjoita e ja paina Enter."
			
		
			System.out.println("Haluatko pelata uudestaan?");
			System.out.println("Jos haluat pelata, paina Enter.");
			System.out.println("Jos et halua pelata, kirjoita e ja paina Enter.");

			uudestaan = sc.nextLine();
			
			
		}while (money > 0 && !uudestaan.equals("e"));
		
		System.out.println("Peli loppui, koska painoit e tai rahasi loppuivat.");
		

		
		
		


	}

}
