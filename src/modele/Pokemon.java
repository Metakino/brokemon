package modele;

import java.awt.Image;

import javax.sound.midi.Soundbank;

public class Pokemon {
	private int id;
	private String nom;
	private Type[] type;
	private Talent talent;
	private int Niveau;
	private int xp_actuel;
	private int xp_max;
	private int pv;
	private int pv_max;
	private int att;
	private int attSpe;
	private int def;
	private int defSpe;
	private int vit;
	private Attaque[] attaque;
	private int IV[];
	private int EV[];
	private Nature nature;
	private Sexe Sexe;
	private String Description;
	private double taille;
	private double poids;
	private Image sprite_avant;
	private Image sprite_arriere;
	private Soundbank cri;
	private Status status;
	
	public void attaque(Pokemon opponent, int attaque) {
		int dommage=0;
		if(this.attaque[attaque].getClasse().toString()=="Physique")
			dommage = (int) ((((this.Niveau*0.4+2)*this.att*this.attaque[attaque].getPuissance())/opponent.getDef())+2);
		if(this.attaque[attaque].getClasse().toString()=="Special")
			dommage = (int) ((((this.Niveau*0.4+2)*this.attSpe*this.attaque[attaque].getPuissance())/opponent.getDefSpe())+2);

		this.setPV(this.getPV()-dommage);
	}

	public void setPV(int newhp) {
		this.pv = newhp;
	}
	
	public int getPV() {
		return pv;
	}
	
	public int getDef() {
		return def;
	}
	
	private int getDefSpe() {
		return defSpe;
	}
	
}