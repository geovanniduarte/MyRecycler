package com.geo.myrecicler.repository.material;

import com.geo.myrecicler.model.Material;
import com.geo.myreciclerlib.repository.EntityDAOImpl;
import android.content.Context;



public class MaterialDAO extends EntityDAOImpl<Material> {
	
	private static MaterialDAO myInstance;
	
	public static MaterialDAO getInstance(Context ctx) {
		if (myInstance == null) {
			myInstance = new MaterialDAO(ctx);
		}
		return myInstance;
	}
	
	public MaterialDAO(Context ctx) {
		super();
		super.mContext = ctx;
	}
}
