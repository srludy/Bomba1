package popo;

public class popo {

	public static void main(String[] args) {
		
		palabra();
		
	}

	
	
	public static void palabra (){
	
		String mensajeCodificado = "listo";
		String mensaje = "";
	
		
		
			
			for (int i = 0; i != 5 ; i++){
				
			char letraChar = mensajeCodificado.charAt(i);
			
			String letra = "" + letraChar;
			
			String sacarLetra;
			
			sacarLetra = conversor(letra);
			mensaje += sacarLetra;
			
			
			
		}
			System.out.println(mensaje);
		}
	
	
	
	public static String conversor (String letra){
		
		
		if (letra.equalsIgnoreCase("l")){
			letra = "T";
		}
		if (letra.equalsIgnoreCase("i")){
			letra = "o";
		}
		if (letra.equalsIgnoreCase("s")){
			letra = "n";
		}
		
		
	return letra;
	}
}
