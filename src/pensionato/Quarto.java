package pensionato;

public class Quarto {
	
	private String nome;
	private String email;
	private int N;
	
	public Quarto(String nome, String email, int N) {
		this.nome = nome;
		this.email = email;
		this.N = N;
	}

	public int getN() {
		return N;
	}
	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Quarto: "
				+ N
				+ ", Aluno: "
				+ nome
				+", Email: "
				+ email;
		
	}
	
}
