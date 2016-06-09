package com.geo.myrecicler.model;

import com.geo.myreciclerlib.repository.Identificable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable
public class Material implements Identificable<Integer> {
	
    public static final String ID = "_id";
    public static final String NOMBRE = "nombre";
    public static final String CANTIDAD = "cantidad";
    public static final String UNIDAD = "unidad";
	
    @DatabaseField(generatedId = true, columnName = ID)
	private int id;   
    @DatabaseField(columnName = NOMBRE)
	private String nombre;
    @DatabaseField(columnName = CANTIDAD)
	private int cantidad;
    @DatabaseField(columnName = UNIDAD)
	private String unidad;
	
	
	
	/**
	 * 
	 */
	public Material() {
		super();
	}



	/**
	 * @param nombre
	 * @param cantidad
	 * @param unidad
	 */
	public Material(String nombre, int cantidad, String unidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.unidad = unidad;
	}


	@Override
	public Integer getIdentifier() {
		return Integer.valueOf(id);
	}



	@Override
	public String toString() {
		return "Material [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad + ", unidad=" + unidad + "]";
	}
	
	
}
