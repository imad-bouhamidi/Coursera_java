package ensat.java;

import java.util.Iterator;
import java.util.Vector;

public class Main {

	
	public static void main(String[] args) {
		Vector<Employe> v = new Vector<Employe>();
		Employe p;
		p = new Patron("houda","houda",4000);
		v.addElement(p);
		p= new TravailleurComission("houda", "houda", 0.1f, 3000);
		v.addElement(p);
		p=new TravailleurHoraire("houda", "houda",40, 20);
		v.addElement(p);
		p=new TravailleurPiece("houda", "houda", 4);
		v.addElement(p);
		System.out.println("L'entreprise contient "+ v.size());
		
		Iterator<Employe> i = v.iterator();
		
		while(i.hasNext()){
			p = i.next();
			System.out.println(p.getClass() + " "+ p.getNom()+ " " + p.getPrenom());
			p.gain();
			System.out.println(p);
		}
	}

}
