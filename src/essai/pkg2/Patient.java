package essai.pkg2;

import java.util.*;
public class Patient {

    public String numeroDeTel;
    public String nom;
    public String prenom;
    public String DateDeNaissance;
    public double poid;
    public double taille;
    public String adresse;
    public String AntecedentsMedicaux;
    public String AntecedentsChirurgicaux;
    public ArrayList<Patient> patients = new ArrayList<Patient>();
       public void gestionPatient() {
            this.patients = new ArrayList<Patient>();
        }

    private int numeroDossier;
    private static int nbDossier;
   private DossierMedicale dossierMedical;
    public Patient(String numeroDeTel, String nom, String prenom,String DateDeNaissance, double poid, double taille, String adresse,String AntecedentsMedicaux,String AntecedentsChirurgicaux) {
        this.numeroDeTel = numeroDeTel;
        this.nom = nom;
        this.prenom = prenom;
        this.DateDeNaissance =DateDeNaissance ;

        this.poid = poid;
        this.taille = taille;
        this.adresse = adresse;

        this.AntecedentsChirurgicaux=AntecedentsChirurgicaux;
        this.AntecedentsMedicaux = AntecedentsMedicaux;


        this.numeroDossier=nbDossier+1;
        Patient.nbDossier=nbDossier+1;
    }

      public DossierMedicale getDossierMedical() {
        return dossierMedical;
    }
    public String getNumeroDeTel() {
        return numeroDeTel;
    }


    public void setNumeroDeTel(String numeroDeTel) {
        this.numeroDeTel = numeroDeTel;
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


    public String getDateDeNaissance() {
        return DateDeNaissance;
    }


    public void setAge(String DateDeNaissance) {
        this.DateDeNaissance =DateDeNaissance;
    }


    public double getPoid() {
        return poid;
    }


    public void setPoid(double poid) {
        this.poid = poid;
    }


    public double getTaille() {
        return taille;
    }


    public void setTaille(double taille) {
        this.taille = taille;
    }


    public String getAdresse() {
        return adresse;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }



    public String getAntecedentsMedicaux() {
        return AntecedentsMedicaux;
    }


    public void setAntecedentsMedicaux(String antecedentsMedicaux) {
        AntecedentsMedicaux = antecedentsMedicaux;
    }


    public static int getNbDossier() {
        return nbDossier;
    }


    public static void setNumeroDossier(int numeroDossier) {
        Patient.nbDossier = numeroDossier;
    }

    

    public String getAntecedentsChirurgicaux() {
        return AntecedentsChirurgicaux;
    }


    public void setAntecedentsChirurgicaux(String antecedentsChirurgicaux) {
        AntecedentsChirurgicaux = antecedentsChirurgicaux;
    }


    public void setDateDeNaissance(String dateDeNaissance) {
        DateDeNaissance = dateDeNaissance;
    }
   public String toString() {
        return "Patient [numeroDeTel=" + numeroDeTel + ", nom=" + nom + ", prenom=" + prenom + ", DateDeNaissance="
                + DateDeNaissance + ", poid=" + poid + ", taille=" + taille + ", adresse=" + adresse
                + ", AntecedentsMedicaux=" + AntecedentsMedicaux + ", AntecedentsChirurgicaux="
                + AntecedentsChirurgicaux +"]";
    }
   public void afficherinfo(){
        System.out.println(this.toString());
    }
}

