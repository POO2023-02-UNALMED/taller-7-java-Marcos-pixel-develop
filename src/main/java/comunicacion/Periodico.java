package comunicacion;

public class Periodico extends Escrito{
	public String fecha,primicia,interpretacion;
	public String[] values = new String[5];
	public Periodico(String origen, String titulo, String autor,int paginas, String fecha,String primicia,String interpretacion){
		super(origen,titulo,autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
		values[0] = this.fecha;
		values[1] = this.primicia;
		values[2] = this.getTitulo();
		values[3] = this.getAutor();
		values[4] = Integer.toString(this.getPaginas());
		
	}
	
	public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
	public int palabrasTotales(int value) {
		int valor = this.getPaginas()*value*10;
		return valor;

	}
	public String interpretacion() {
		return this.interpretacion;

	}
	public String toString() {
		String cadena ="";
		for(int j=0; j<5;j++) {
			cadena = cadena + values[j] + "\n"; 
		}
		return cadena;
	
	}
}

