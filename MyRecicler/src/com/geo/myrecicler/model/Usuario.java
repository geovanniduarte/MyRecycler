package com.geo.myrecicler.model;

import com.geo.myreciclerlib.repository.Identificable;



public class Usuario implements Identificable<Integer> {
	
	private int id;

	@Override
	public Integer getIdentifier() {
		return Integer.valueOf(id);
	}
	
}
