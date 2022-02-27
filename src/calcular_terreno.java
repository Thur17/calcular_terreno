import java.util.Locale;
import java.util.Scanner;

public class calcular_terreno {

	public static void main(String[] args) {
        // Medida de terreno largura VS comprimento  valor do metro quadrado 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double Largura;
		System.out.println("largura:");
		Largura = sc.nextDouble();
		
		double Comprimento;
		System.out.println("Comprimento:");
		Comprimento = sc.nextDouble();
		
		double resultado;
		
		double Preço;
		System.out.println("Valor");
		
		double metroQuadrado;
		
		metroQuadrado = sc.nextDouble();

		resultado = (double) Largura * Comprimento;
		Preço = (double) resultado * metroQuadrado;

		System.out.printf("Area do terreno é de: %.2f%n Preço: %.2f", resultado, Preço);

		sc.close();

	}

}

