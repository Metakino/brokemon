package modele;

public class Type {
	private String nom;
	private Type[] faiblesse;
	private Type[] resistance;
	private Type[] immune;
	
	
	public boolean isFaible(Type type) { //methode pour tester si un pokemon est faible face a une attaque
		for(int i = 0; i<faiblesse.length;i++) {
			if(faiblesse[i]==type)
				return true;
		}
		return false;
	}
	
	public boolean isResistant(Type type) { //methode pour tester si un pokemon est resistant face a une attaque
		for(int i = 0; i<resistance.length;i++) {
			if(resistance[i]==type)
				return true;
		}
		return false;
	}
	
	public boolean isImmune(Type type) { //methode pour tester si un pokemon est immunise face a une attaque
		for(int i = 0; i<immune.length;i++) {
			if(immune[i]==type)
				return true;
		}
		return false;
	}
	
	public Type[] getFaiblesse() {
		return faiblesse;
	}
	
	public Type[] getResistance() {
		return resistance;
	}
	
	public Type[] getImmune() {
		return immune;
	}
}
