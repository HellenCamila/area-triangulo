import java.util.Scanner;

//instrução1 inserir base 
//instrução2 printar a base 
//instrução3 inserir a altura
//instrução4 printar a altura
//instrução5  multiplicar base e altura 
//intrudução6 printar o valor 
//intrudução7 dividir o valor por 2


class Areatriangulo {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
    
    		Double base;
			
			Double altura;
			
			Double multiplicar;
			
			Double resultado;
			
			
			System.out.printf("qual e o valor da base:");
			base = teclado.nextDouble();
			
			System.out.printf("qual e o valor da altura:");
			altura = teclado.nextDouble();
			
			
			multiplicar = base * altura;
		
		
		
		System.out.printf( "o resultado e:%f\n" ,multiplicar / 2 );
    

    		System.exit(0);
		
	}

}
