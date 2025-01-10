package essai.pkg2;

import java.util.ArrayList;

public class DossierMedicale {
    private Patient patient;
    private ArrayList<Consultation> consultations;
    private String etatPatient;

    

    public DossierMedicale(Patient patient) {
        this.patient = patient;
        this.consultations = new ArrayList<>();
    }


    public Patient getPatient() {
        return patient;
    }


    public void setPatient(Patient patient) {
        this.patient = patient;
    }


    public ArrayList<Consultation> getConsultations() {
        return consultations;
    }


    public void setConsultations(ArrayList<Consultation> consultations) {
        this.consultations = consultations;
    }


    

    @Override
    public String toString() {
        return "DossierMedical [patient=" + patient.getNom() +" "+ patient.getPrenom() + ", consultations=" + consultations + ", etatPatient="
                + etatPatient + "]";
    }


    public void ajouterConsultation (Consultation Consultation){
        this.consultations.add(Consultation);
        }

    public void AfficherDossierMedical (){
        System.out.println(toString());
    }


    public String getEtatPatient() {
        return etatPatient;
    }


    public void setEtatPatient(String etatPatient) {
        this.etatPatient = etatPatient;
    }
}
