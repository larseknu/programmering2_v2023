public class IfWhileFor {
	
	public static void main(String[] args) {

		// Deklarerer variabelen score
		int score;
		
		// Undersøker om vi har fått input til main-metoden vår (args har en lengde på større enn 0)
		if (args.length > 0)
			// Forsøker å gjøre om første elementet i args-arrayen til en int (kræsjer nå hvis det ikke er et tall)
			score = Integer.parseInt(args[0]);
		else
			// Hvis ikke setter vi score til 90
			score = 90;


		// Sjekker om score er over 60 og under 100
		if (score >= 60 && score <= 100) {
			System.out.println("Pass!");
		}
		// Sjekker om score er et negativt tall (vil også trigge hvis score er over 100)
		else if (0 < score) {
			System.out.println("Fail!");
		} 
		else {
			System.out.println("Invalid!");
		}



		// While-løkke som vil kjøre så lenge variabelen iteration er mindre enn 5.
		System.out.println();
        int iteration = 0;
        while (iteration < 5){
            System.out.println(iteration);
            iteration++;
        }


		// for-løkke som vil skrive ut 0 til, men ikke med, 5
        System.out.println();
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }

        // for-løkke som vil skrive ut 5 til, men ikke med, 0
        System.out.println();
        for (int x = 5; x > 0; x--) {
            System.out.println(x);
        }

        // for-løkke som vil skrive ut 10 til og med 20, med inkrement på 2 for hver gjennomgang
        System.out.println();
        for (int x = 10; x <= 20; x += 2) {
            System.out.println(x);
        }

	}


}