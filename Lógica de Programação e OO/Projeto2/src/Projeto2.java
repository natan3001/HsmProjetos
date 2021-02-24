import java.util.Scanner;

public class Projeto2 {

	public static void main(String[] args) {

		char sair;
		int aprovados = 0, reprovados = 0, exame = 0, contador = 0;
		float prova, projeto, exercicios, soma = 0, media, maior = 0, menor = 10;
		
		Scanner sn = new Scanner(System.in);
		
		do{
			System.out.println("\nAlunos Verificados: " + contador);
			System.out.print("Nota da Prova: ");
			prova = sn.nextFloat();
			
			System.out.print("Nota do Projeto: ");
			projeto = sn.nextFloat();
			
			System.out.print("Nota dos Execícios: ");
			exercicios = sn.nextFloat();
			
			media = calculaMedia(prova, projeto, exercicios);
			
			soma += media;
			contador++;
			
			if(media >= 8) {
				aprovados++;
			}else if(media < 8 && media >= 5) {
				exame++;
			}else {
				reprovados++;
			}
			
			if(media > maior) {
				maior = media;
			}
			
			if(media < menor) {
				menor = media;
			}
			
			System.out.print("Finalizar? S/N : ");
			
			sair = sn.next().charAt(0);
			
		}while(sair != 'S' && sair != 's');
		
		System.out.println("\nAlunos aprovados: " + aprovados);
		System.out.println("Alunos em exame: " + exame);
		System.out.println("Alunos reprovados: " + reprovados);
		System.out.println("\nMédia Geral: " + soma/contador);
		System.out.println("Menor média: " + menor);
		System.out.println("Maior média: " + maior);
		
		sn.close();
	}
	
	private static float calculaMedia(float prova, float projeto, float exercicios)
    {
        return ((prova*5)+(projeto*3)+(exercicios*2))/10;
    }

}
