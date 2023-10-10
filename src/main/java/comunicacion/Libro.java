package comunicacion;

public class Libro extends Escrito{
	public String co_autor,editorial,edicion,interpretacion;
	public String[] values = new String[7];
	public Libro(String origen, String titulo, String autor,int paginas,String co_autor,String editorial,String edicion,String interpretacion){
		super(origen,titulo,autor,paginas);
		this.co_autor=co_autor;
		this.editorial = editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;
		values[0] = origen;
		values[1]= titulo;
		values[2] = autor;
		values[3]= Integer.toString(paginas);
		values[4] = co_autor;
		int valor = this.getPaginas(); 
		values[5] = editorial;
		values[6] = edicion;
	}

	public String interpretacion() {
		return this.interpretacion;

	}
	public String toString() {
		String cadena ="";
		for(int j=0; j<values.length;j++) {
			cadena = cadena + values[j] + "\n"; 
		}
		return cadena;
	}
	public int palabrasTotales(int value) {
		int valor = this.getPaginas()*value*2;
		return valor;
	}
	
	public String getCo_autor() {
        return co_autor;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
