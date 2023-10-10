package comunicacion;
import java.util.ArrayList;
public class Alfabeto extends Pictograma{
	ArrayList<String >letras = new ArrayList<>();
	public String interpretacion;
	
	public Alfabeto(String[] letras , String interpretacion){
		super("");
		for(int i=0; i<letras.length;i++) {
			this.letras.add(letras[i]);
		}
		this.interpretacion=interpretacion;
	}
	
	public int cantidadLetras() {	
		return letras.size(); 
	}
	public String interpretacion() {
		return this.interpretacion;

		
	}
	public  String toString() {
		return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
				
	}
	

	    
	    public String getInterpretacion() {
	        return interpretacion;
	    }

	    public void setInterpretacion(String interpretacion) {
	        this.interpretacion = interpretacion;
	    }

}
