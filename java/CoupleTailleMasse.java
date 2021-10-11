package java;

public class CoupleTailleMasse {
    public final double taille;
    public final double masse;

    public CoupleTailleMasse(double taille, double masse) {
        this.taille = taille;
        this.masse = masse;
    }

    @Override
    public String toString() {
        return taille+"cm x "+masse+"kg";
    }
}
