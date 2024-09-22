import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int p1 = ler.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int p2 = ler.nextInt();

		try {
			contar(p1, p2);
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
	}

	static void contar(int p1, int p2) throws ParametrosInvalidosException {
		if (p2 <= p1) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
		}

		int contagem = p2 - p1;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número: " + i);
		}
	}
}

class ParametrosInvalidosException extends Exception {
	public ParametrosInvalidosException(String mensagem) {
		super(mensagem);
	}
}