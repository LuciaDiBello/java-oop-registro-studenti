package RegistroStudenti;

import java.util.Scanner;

//Definizione della classe RegistroStudenti
public class RegistroStudenti {
//campo
private Studente[] regStud;  //array di studenti

//costruttore
public RegistroStudenti () {
	    this.regStud = new Studente[19]; 
}


//Metodo aggiungiStudenti
public void aggiungiStudenti (){
	Scanner input = new Scanner(System.in);
	
	for (int i = 0; i < 19; i++)
	{
		System.out.println("Inserire il nome");
		String n = input.nextLine();
 
		System.out.println("Inserire il cognome");
		String c = input.nextLine();
		
		System.out.println("Inserire il numero di matricola");
		String m = input.nextLine();
		
		Studente s = new Studente (n, c, m);
		regStud[i] = s;
		
	    }
  }

//Metodo stampaLista
public void stampaLista () {
	for (int i = 0; i < 19; i++)
	{
		System.out.print(regStud[i].getNome() + " ");
		System.out.print(regStud[i].getCognome() + " ");
		System.out.print(regStud[i].getNumeroMatricola() + " ");
		System.out.println();
	    }
  }

}


