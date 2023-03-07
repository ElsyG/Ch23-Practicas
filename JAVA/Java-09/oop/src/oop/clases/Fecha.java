package oop.clases;

public class Fecha {
    @Override // se refiere a que el metodo se va a sobreescribir
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	private int dia;
    private int mes; 
    private int anio;
    
    
    //Metodo sobrecargado
    public Fecha() {
        super();
    }
//Metodo constructor
    public Fecha(int dia, int mes, int anio) {
        super();
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
public String diaMesAnio() {
    return "La fecha es: --> " + this.dia + " " + this.mes + " " + this.anio;
}
//Metodos get y set
public int getDia() {
    return dia;
}
public void setDia(int dia) {
    this.dia = dia;
}
public int getMes() {
    return mes;
}
public void setMes(int mes) {
    this.mes = mes;
}
public int getAño() {
    return anio;
}
public void setAnio(int anio) {
    this.anio = anio;
}
}

//Pilares de la orientacion a objetos: abstracción, encapsulamiento