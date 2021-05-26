public class Afstand {
    private int afstand;

    public Afstand(){
    }
        public String getAfstand(double afstand) {
            if (afstand > 4) {
                return "het is ver weg";
            } else if (afstand > 2 && afstand <= 4) {
                return "het is verder weg";
            } else if (afstand > 0 && afstand <= 2) {
                return "het is dichtbij";
            }
            return "geen locatie gekozen";
        }
}