package exo1;

public class Main {
	public static void main(String[] args) {
        Humain humain1 = new Humain("Duvet", "G�rard", 27, "le go");
        humain1.presente();
        
        Humain humain2 = new Humain("Orpion", "Murielle", 98, "le crochet");
        humain2.presente();
        
        // Impossible de mettre un age n�gatif
        humain1.setAge(-28);
        System.out.println(humain1.getAge());
        
        
    } 
}
