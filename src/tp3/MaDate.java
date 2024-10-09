package tp3;

public class MaDate {
	private  int Jours ;
	private  int Mois ;
	private  int Année ;
	
	
	public String toString() {
		return Jours+"/"+Mois+"/"+Année ;
	}
	
	public int getJours() {
		return Jours;
	}
	public int getMois() {
		return Mois;
	}
	public int getAnnée() {
		return Année;
	}
	public void setJours(int Jours ) {
		this.Jours=Jours;
	}
	public void setMois(int  Mois) {
		this.Mois=Mois; 
	}
	public void setAnnée(int Année) {
		this.Année=Année;
	}
	
	public MaDate(int jour, int mois,int annee) {
		Jours=jour;
		Mois=mois;
		Année=annee;
	}
	public MaDate(int annee){
		Année=annee;
	}
	 public void ajouterUnJour() {
		 int m = this.getMois();
		 int j= this.getJours();
		 int a =this.getAnnée();
		 if ((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m==10)&& (j==31)) {
			 this.setJours(1);
			 this.setMois(m+1);
		 }
		 
		 else if ((m == 4 || m == 6 || m == 9 || m == 11 )&& (j==30)) {
			 this.setJours(1);
			 this.setMois(m+1);
		 }
		 
		 else if (m==2) {
			 if ((a%4==0) && (j==29)){
				 this.setJours(1);
				 this.setMois(m+1);
			 }
			 else if(j==28) {				 
				 this.setJours(1);
				 this.setMois(m+1);}
			 else {
				 this.setJours(j+1);
			 	}
			 }
		 else if ((m==12) && (j==31)) { 
			 this.setJours(1);
			 this.setMois(1);
			 this.setAnnée(a+1);
			 }
		 else {
			 this.setJours(j+1);
		 }
	}
	 public void ajouterPluseursJours(int n) {
		 for (int i=0;i<n;i++) {
			 this.ajouterUnJour();
		 }
	 }
	 public void ajouterUnAn() {
		this.setAnnée(this.getAnnée()+1);
	 }
	 public void ajouterMois() {
		 if (this.getMois()==12) {
			 this.ajouterUnAn();
		 }
		 else {
			 this.setMois(this.getMois()+1);
		 }
		 
	 }
	 
	 
}
