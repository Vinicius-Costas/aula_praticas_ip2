package programa02;

public class ProgramaPorta {

	public static void main(String[] args) {
			
		Porta p1 = new Porta();
		
		p1.abre();
		p1.fecha();
		
		p1.pinta("Azul");
		p1.pinta("Preta");
		p1.pinta("Vermelha");
		p1.pinta("Amarela");
		
		p1.dimensaoX = 15;
		p1.dimensaoY = 45;
		p1.dimensaoZ = 30;
		
		p1.abre();
		
		System.out.println(p1.estaAberta());
		
	}

}
