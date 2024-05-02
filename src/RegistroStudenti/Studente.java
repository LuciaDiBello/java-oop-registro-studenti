package RegistroStudenti;

public class Studente {
	 //campi
	 private String nome;
	 private String cognome;
	 private String numeroMatricola;
	 
	 //costruttore
	 public Studente (String nome, String cognome, String numeroMatricola)
	 {
		 this.nome = nome;
		 this.cognome = cognome;
		 this.numeroMatricola = numeroMatricola;
	   }
	 
	 //Metodi getter e setter
	  public String getNome() {
		    return nome;
		} 
	  
	  public void setNome (String nome) {
		  this.nome = nome;
		 }
	  
	  public String getCognome() {
		    return cognome;
		} 
	  
	  public void setCognome (String cognome) {
		  this.cognome = cognome;
		 }
	  
	  public String getNumeroMatricola() {
		    return numeroMatricola;
		} 
	  
	  public void setNumeroMatricola (String numeroMatricola) {
		  this.numeroMatricola = numeroMatricola;
		 }
	  
}

