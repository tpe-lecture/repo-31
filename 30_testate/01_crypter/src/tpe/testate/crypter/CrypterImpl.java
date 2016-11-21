package tpe.testate.crypter;

public class CrypterImpl implements Crypter {
    /*
     * @autor Dario Capuana 1613518
     * 
     */

	/*
	 * Methode verschluesselt gegebenen String
	 * @param String input zu verschluesselnder Stringtext
	 */
	@Override
	public String encrypt(String input) throws IllegalArgumentException {
		String cryptedText = "";
		//grossbuchstaben in kleinbuchstaben umwandeln und als char speichern
		char[] array = (input.toLowerCase()).toCharArray();
		for (int i = 0; i < array.length; i++) {
			//ASCII Code benutzen um unerwuenschte Symbole auszusondern
			if ((array[i] > 47 && array[i] < 58) || (array[i] > 96 && array[i] < 128) || array[i] == 32) {
				switch (array[i]) {
				case 'e': {
					cryptedText = cryptedText + '3';
					break;
				}
				case '3': {
					cryptedText = cryptedText + 'e';
					break;
				}
				case 'l': {
					cryptedText = cryptedText + '1';
					break;
				}
				case '1': {
					cryptedText = cryptedText + 'l';
					break;
				}
				case 'o': {
					cryptedText = cryptedText + '0';
					break;
				}
				case '0': {
					cryptedText = cryptedText + 'o';
					break;
				}
				case 'a': {
					cryptedText = cryptedText + '4';
					break;
				}
				case '4': {
					cryptedText = cryptedText + 'a';
					break;
				}
				case 't': {
					cryptedText = cryptedText + '7';
					break;
				}
				case '7': {
					cryptedText = cryptedText + 't';
					break;
				}
				default: {
					cryptedText = cryptedText + array[i];
					break;
				}
				}

			} else {
				throw new IllegalArgumentException();
				//Exception bei unerlaubten Symbolen
			}
		}

		return cryptedText;
	}

	@Override
	/*
	 * Methode entschluesselt gegebenen String
	 * @param String input ist der zu entschluesselnde Code
	 * 
	 */
	public String decrypt(String input) throws IllegalArgumentException {
		for (int i = 0; i < input.length(); i++) {
			//Kontrolle auf Grossbuchstaben
			if (Character.isUpperCase(input.charAt(i))) {
				throw new IllegalArgumentException();
			}
		}

		return encrypt(input);
	}

}
