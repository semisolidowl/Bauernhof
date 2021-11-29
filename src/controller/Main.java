package controller;

import java.util.ArrayList;
import java.util.Date;

import model.Huhn;
import model.Kuh;
import model.Schaf;
import model.Schwein;
import model.Tier;

public class Main {
	ArrayList<Tier> tiere = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Kuh k1 = new Kuh("Eric", "Gras", new Date(), 42);
		Kuh k2 = new Kuh("asdf", "Gras", new Date(), 42);
	
	
		Huhn h1 = new Huhn("Melissa", "Gras", new Date(), 5);
		Huhn h2 = new Huhn("poiu", "Gras", new Date(), 4);
		
		Schwein s1 = new Schwein("SFD", "Gras", new Date(), 42);
		Schwein s2 = new Schwein("gfndset", "Gras", new Date(), 42);
		
		System.out.println("Ich bin Kuh 1"+" "+k1.makeSound());
		System.out.println("Ich bin Huhn 1"+" "+h1.makeSound());
		System.out.println("Ich bin Schwein 1"+" "+s1.makeSound());
	
		System.out.println("Ich bin Kuh 2"+" "+k2.makeSound());
		System.out.println("Ich bin Huhn 2"+" "+h2.makeSound());
		System.out.println("Ich bin Schwein 2"+" "+s2.makeSound());
	}
	
	
	
	public ArrayList<Tier> getTierByType(String typ){
        ArrayList<Tier> result = new ArrayList<>();
        try {
            Class<Tier> filter =  (Class<Tier>) Class.forName("model."+typ);
       //jedes tier Objekt aus der Liste holen
            
            //prüfen on es die gleiche Klasse hat wie "filter"
            for(Tier tiere  : tiere) {
            //wenn ja, zur result-liste hinzufügen
            if (tiere.getClass().equals(filter)) {
            	System.out.println(tiere);
            }
            }
            	
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
	
	public void addTier(Tier t) {
		tiere.add(t);
	}
}

