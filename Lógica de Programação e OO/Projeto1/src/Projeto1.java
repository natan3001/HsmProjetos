import java.text.DecimalFormat;
import java.util.Scanner;

public class Projeto1 {

	public static void main(String[] args) {
		
		float prova, projeto, exercicios, softwaresLivres;
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Nota da Prova: ");
		prova = sn.nextFloat();
		
		System.out.print("Nota do Projeto: ");
		projeto = sn.nextFloat();
		
		System.out.print("Nota dos Execícios: ");
		exercicios = sn.nextFloat();
		
		System.out.print("Nota do Projeto de Software Livre: ");
		softwaresLivres = sn.nextFloat();
		
		System.out.print('\n'+retornaMedia(prova, projeto, exercicios, softwaresLivres));
		
		sn.close();
	}
	
	public static String retornaMedia(float prova, float projeto, float exercicios, float softwaresLivres) {
		
		float media = CalculaMedia(prova, projeto, exercicios, softwaresLivres);
		
		DecimalFormat df = new DecimalFormat("#.0");
		
		if(media < 8f) {

			float nFinal = 10 - media;
			
			return "Nota mínima necessária para a prova final: "+ df.format(nFinal) + ". Sua média foi de: " + df.format(media);

		}else {
			
			return "Parabéns você passou! Sua média foi: " + df.format(media);
		}
		
	}
	
	private static float CalculaMedia(float prova, float projeto, float exercicios, float softwaresLivres) {
      return ((prova*3)+(projeto*3)+(exercicios*2)+(softwaresLivres*3))/11;
  }

}
