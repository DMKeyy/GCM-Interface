package essai.pkg2;
import java.time.LocalDate;
import java.util.ArrayList;
public class Ordonnance {
     private String nom;
    private String prenom;
    private ArrayList<String> medicament;
    private ArrayList<String> doses;
    private LocalDate dateOrdonnance = LocalDate.now();
    private String nomMedecin;

    public Ordonnance() {
        medicament=new ArrayList<>();
        doses=new ArrayList<>();
    }


    
    public Ordonnance(String nom, String prenom, ArrayList<String> medicament, ArrayList<String> doses, String nomMedecin) {
        this.nom = nom;
        this.prenom = prenom;
        this.medicament = medicament;
        this.doses = doses;
        this.nomMedecin = nomMedecin;
    }


    public ArrayList<String> getMedicament() {
        return medicament;
    }

    public void setMedicament(ArrayList<String> medicament) {
        this.medicament = medicament;
    }

    public ArrayList<String> getDoses() {
        return doses;
    }

    public void setDoses(ArrayList<String> doses) {
        this.doses = doses;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public LocalDate getDateOrdonnance() {
        return dateOrdonnance;
    }


    public void setDateOrdonnance(LocalDate dateOrdonnance) {
        this.dateOrdonnance = dateOrdonnance;
    }


    public String getNomMedecin() {
        return nomMedecin;
    }


    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }



    @Override
    public String toString() {
        return "Ordonnance [Nom = " + nom + ", Prenom = " + prenom + ", Medicament = " + medicament + ", Doses = " + doses
                + ", date = " + dateOrdonnance + ", Nom Medecin=" + nomMedecin + "]";
    }
}
