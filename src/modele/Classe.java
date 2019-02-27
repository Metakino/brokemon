package modele;

public enum Classe {
	Physique, Special, Status;
	
	public String toString() {
		switch (this) {
	        case Physique:  return "Physique";
	        case Special:  return "Special";
	        case Status:  return "Status";
		}
		return null;
	}
}
