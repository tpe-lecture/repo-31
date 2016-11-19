/**
 * Klasse dient als Beispiel für den Coding-Standard und die Namenskonventionen
 * bei Java-Programmen.
 */
    public class CodingStandard {
        /* Konstante, die dem Rest der Welt etwas mitteilen soll.
        */
        public final static int KONSTANTE_MIT_TOLLEM_WERT = 3;
        private int erstesFeld;
        private double zweitesFeld;
        /*
         * Legt eine neue Instanz an.
         *
         * Erstes_Feld: das erste Feld.
         * ZweitesFeld: das zweite Feld.
         */
    public codingStandard(int erstesFeld, double zweitesFeld) {
    this.erstesFeld = erstesFeld;    this.zweitesFeld = zweitesFeld;
    }

    /*
     * Methode, die etwas tut.
     *
     * parameter: Eingabewert für die Methode.
     * gibt einen Wert abhängig von {@code parameter} zurück.
     */
    public int 
    Methode_Die_Was_Tut(int Parameter) 
    {
    int result;

    if (Parameter > konstanteMitTOLLEMWert)
    result = 12;        
    else 
    {
        result = 13; }

    ERSTES_Feld = result; ZWEITES_Feld = 2 * result;

    return result;
    }
}
