package entities;

public class Distrit {
	String nameDistrit;
	
	public Distrit() {
		
	}

	public Distrit(String nameDistrit) {
		this.nameDistrit = nameDistrit;
	}

	public String getNameDistrit() {
		return nameDistrit;
	}

	public void setNameDistrit(String nameDistrit) {
		this.nameDistrit = nameDistrit;
	}

	@Override
	public String toString() {
		return "Bairro: " 
				+ nameDistrit ;
	}
	
	
	

}
