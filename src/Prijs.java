public class Prijs {
    private int geld;

    public Prijs() {
        this.geld = geld;
    }

    public double PrijsBerekenen(boolean contant, boolean invalide, boolean pin, int afstand) {
        if (afstand > 4) {
            if (contant || pin) {
                return 0.5;
            } else if (invalide) {
                return 0.0;
            }
        }
        if (afstand > 2) {
            if (contant || pin) {
                return 0.75;
            } else if (invalide) {
                return 0.0;
            }
        }

        if (afstand <= 2) {
            if (contant || pin) {
                return 1.0;
            } else if (invalide) {
                return 0.0;

            }
        }
        return 0.0;
    }
}

