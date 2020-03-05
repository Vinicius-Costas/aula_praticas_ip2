package aula02;

public class ProgramaPessoa {

	public static void main(String[] args) {
		
		Pessoa alguem;
		alguem = new Pessoa();
		
		alguem.nome ="Vinicius";
		alguem.idade = 18;
		
		alguem.fazerAniversario();
		alguem.fazerAniversario();
		alguem.fazerAniversario();
		alguem.fazerAniversario();
		
		System.out.println(alguem.nome);
		System.out.println(alguem.idade);
	}

}
