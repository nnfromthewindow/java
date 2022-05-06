
public class Car {

	private String make;
	private String model;
	private int year;
	
	Car(String make,String model,int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		
	}
//Hago una copia a traves de overloaded constructors y el metodo copy ya habia creado mas abajo
	
	Car(Car x){
		this.copy(x);
	}
	
//Declaro fuera de la clase los getters y le pido return del atributo privado en modo public asi puedo tomar los valores en la main class
	
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}

//Los setter los creo en modo public para poder modificar atributos al crear objetos en la main class		
	
	public void setMake(String make) {
		this.make=make;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setYear(int year) {
		this.year=year;
	}
	
	//Creamos el metodo copy que utiliza como argumento un objeto (en este caso Car y le nombramos x)
	//entonces .this llama al objeto car2 del main y setea(setter) la make mediante .setMake tomando el valor de (car2)  .getMake mediante los getters 
	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	
	 }
	


}
