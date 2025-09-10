package escola;

public class Aluno {
	
	String nome;
	int idade; 
	double media;
	
	public Aluno(String nomeTemp, int idadeTemp) {
		nome = nomeTemp;
		idade = idadeTemp;
	}
	
	public Aluno(String nomeTemp, int idadeTemp, double mediaTemp) {
		nome = nomeTemp;
		idade = idadeTemp;
		media = mediaTemp;
	}

	public static void main(String[] args) {
		System.out.println("Testando a classe Aluno");
		
		Aluno aluno1 = new Aluno("Rafael", 18);
		Aluno aluno2 = new Aluno("Ruan", 22, 9.5);
		
		System.out.println("Nome: " + aluno1.nome);
		System.out.println("Idade: " + aluno1.idade);
		
		System.out.println("Nome: " + aluno2.nome);
		System.out.println("Idade: " + aluno2.idade);
		System.out.println("Media: " + aluno2.media); 
	}

}
