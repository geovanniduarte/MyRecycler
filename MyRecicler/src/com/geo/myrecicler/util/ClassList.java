package com.geo.myrecicler.util;

import java.util.ArrayList;
import java.util.List;

import com.geo.myrecicler.model.Material;
import com.geo.myrecicler.model.Usuario;

public class ClassList {

	public static List<Class<?>> getModelClasses() {
		List<Class<?>> classes = new ArrayList<Class<?>>();
		classes.add(Material.class);
		classes.add(Usuario.class);
		return classes;
	} 
}
