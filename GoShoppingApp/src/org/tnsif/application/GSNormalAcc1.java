package org.tnsif.application;

import org.tnsif.framework.NormalAcc;

public class GSNormalAcc1 extends NormalAcc {

	public GSNormalAcc1(int accno, String accnm, float charges, float delieveryCharges) {
		super(accno, accnm, charges, delieveryCharges);
		
	}

	public void GSNormalAcc(int accno, String accnm, float charges, float delieveryCharges) {
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
	
	

}

