package exo1;

public class Humain {
	// Attribut
	String prenomH;
	String nomH;
	int ageH;
	String hobbyH;
	
	// Constructor
	public Humain(String pPrenomH, String pNomH, int pAgeH) {
		this.prenomH = pPrenomH;
		this.nomH = pNomH;
		this.ageH = pAgeH;
	}
	
	public Humain(String pPrenomH, String pNomH, int pAgeH, String pHobbyH) {
		this (pPrenomH, pNomH, pAgeH);
		this.hobbyH = pHobbyH;
	}
	
	// Getter & Setter
	public int getAge() {
        return this.ageH;
    }
    
    String getNom() {
        return this.nomH;
    }
    
    public String getPrenom() {
        return this.prenomH;
    }
    
    public String getHobby() {
        return this.hobbyH;
    }
    
    public void setAge(int pAgeH) {
        if (ageH < 0) {
            System.out.println("L'age doit être positif");
        } else {
            this.ageH = pAgeH;
        }
    }
    
    public void setNom(String pNomH) {
        this.nomH = pNomH;
    }
    
    public void setPrenom(String pPrenomH) {
        this.prenomH = pPrenomH;
    }
    
    public void setHobby(String pHobbyH) {
        this.hobbyH = pHobbyH;
    }
    
    // Opérations
    public void presente() {
        System.out.println("Bonjour, je m'appelle "
                + this.nomH + " " + this.prenomH
                + " , j'ai " + this.ageH
                + " et j'aime " + this.hobbyH);
    }
}
