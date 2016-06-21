package com.geo.myrecicler.model;

import com.geo.myreciclerlib.repository.Identificable;
import com.j256.ormlite.field.DatabaseField;



public class Usuario implements Identificable<Integer> {
	
	public static final String ID = "_id";
	
	@DatabaseField(generatedId = true, columnName = ID)
	private int id;

	@Override
	public Integer getIdentifier() {
		return Integer.valueOf(id);
	}
	
}
