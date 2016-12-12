package tpe.testate.crypter;

/* 
 * Implementiert Interface crypter und verschluesselt oder entschluesselt strings
 * @autor Dario Capuana 1613518
 * 
 */

public class CrypterImpl implements Crypter {
  /*
  * Methode verschluesselt gegebenen string
  * 
  * @param String input zu verschluesselnder Stringtext
  * @return String cryptedText verschluesselter Text
  * 
  * */
  @Override
  public String encrypt(String input)  {
    String cryptedText = "";
    //Grossbuchstaben in Kleinbuchstaben umwandeln und als char speichern
    char[] array = (input.toLowerCase()).toCharArray();
    for (int i = 0; i < array.length; i++) {
      //ASCII Code benutzen um unerwuenschte Symbole auszusondern
      if ((array[i] >= '0' && array[i] <= '9') || (array[i] >= 'a' && array[i] <= 'z') 
          || array[i] == ' ') {
        switch (array[i]) {
          case 'e':
            cryptedText = cryptedText + '3';
            break;
          case '3':
            cryptedText = cryptedText + 'e';
            break;
          case 'l':
            cryptedText = cryptedText + '1';
            break;
          case '1':
            cryptedText = cryptedText + 'l';
            break;
          case 'o':
            cryptedText = cryptedText + '0';
            break;
          case '0':
            cryptedText = cryptedText + 'o';
            break;
          case 'a':
            cryptedText = cryptedText + '4';
            break;
          case '4':
            cryptedText = cryptedText + 'a';
            break;
          case 't':
            cryptedText = cryptedText + '7';
            break;
          case '7':
            cryptedText = cryptedText + 't';
            break;
          default:
            cryptedText = cryptedText + array[i];
            break;
        }
      }
    }
    return cryptedText;
  }
  
  /*
   * 
   * Methode die gegebenen String entschluesselt
   * 
   * @param String input ist der zu entschluesselnde Text
   * @return Gibt den entschluesselnten Text zurueck
   * @throw IllegalArgumentException
   *          Wird ausgeworfen wenn Eingabe ungültige Zeichen enthaelt
   *          
   */
  @Override
  public String decrypt(String input) throws IllegalArgumentException {
    for (int i = 0; i < input.length(); i++) {
      //Kontrolle auf Grossbuchstaben
      if (Character.isUpperCase(input.charAt(i))) {
        throw new IllegalArgumentException();
      }
      // Kontrolle auf unerlaubte Zeichen
      if (!((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') 
          || input.charAt(i) >= '0' && input.charAt(i) <= '9' || input.charAt(i) == ' ')) {
        throw new IllegalArgumentException();
      }
    }
    return encrypt(input);
  }
}
