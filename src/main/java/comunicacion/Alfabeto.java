package comunicacion;

public class Alfabeto extends Pictograma{
	String[] letras = new String[10];
	String interpretacion;
	
	Alfabeto(String interpretacion){
		super("");
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {	
		return letras.length; 
	}
	public String interpretacion() {
		return this.interpretacion;

		
	}
	public  String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, Ñ, O, P, Q, R, S, T, U, V, W, X, Y, Z";
				
	}
	

	    // Setter para el atributo 'letras'
	    
	    // Getter para el atributo 'interpretacion'
	    public String getInterpretacion() {
	        return interpretacion;
	    }

	    // Setter para el atributo 'interpretacion'
	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }

}
