
public class Projeto3 {

	public static void main(String[] args) {
		
		float mediaMes, soma = 0, contador = 0, maior = 0, menor = 0;
		float[] mediaSemana = {0,0,0,0};
		float[][] bolsaMes  = { 
				{215, 217, 208, 205, 207, 220, 203}, 
				{200, 221, 233, 241, 240, 200, 244}, 
				{258, 269, 291, 301, 298, 291, 280}, 
				{293, 260, 241, 248, 255, 260, 240}};
		
		for(int i = 0; i < bolsaMes.length; i++) {
			
			for(int x = 0; x < bolsaMes[i].length; x++) {

				soma += bolsaMes[i][x];
				contador++;
				
				mediaSemana[i] += bolsaMes[i][x];
			}
			
			mediaSemana[i] = mediaSemana[i] / bolsaMes.length;
			
		}
		
		mediaMes = soma / contador;
		
		System.out.println("Média do mês: "+mediaMes+"\n");
		
		for(int i = 0; i < mediaSemana.length; i++) {
			
			  if(maior==0) {
				  maior=mediaSemana[i];
				  menor=mediaSemana[i];
			  }
			  
			  if(mediaSemana[i] > maior){
				  
			    maior = mediaSemana[i];
			    
			  }else if(mediaSemana[i] < menor){
				  
			        menor=mediaSemana[i];
			        
			  }
			
			  System.out.println("Média da semana "+ (i+1) +": " + mediaSemana[i]);
		}
		
		System.out.println("\nMaior média: "+ maior);
		System.out.println("Menor média: "+ menor);
	}

}
