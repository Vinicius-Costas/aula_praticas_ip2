package programa02;

public class Porta {
		
	boolean aberta;
	String cor;
	double dimensaoX,dimensaoY,dimensaoZ;
	
	void abre() {
		aberta = true;
	}
	
	void fecha() {
		aberta = false;
	}
	
	void pinta (String novaCor) {
		cor = novaCor; 
	}
	
	boolean estaAberta(){
		return aberta;
	}

}
