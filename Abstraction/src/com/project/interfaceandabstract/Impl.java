package com.project.interfaceandabstract;

public class Impl extends University implements UniversityDao {

	@Override
	public void be() {
		System.out.println("Impl.be()");
		
	}

	@Override
	public void mTech() {
		System.out.println("Impl.mTech()");
		
	}

	@Override
	public void phd() {
		System.out.println("Impl.phd()");
		
	}

	@Override
	void fee() {
		System.out.println("Impl.fee()");
		
	}

	@Override
	void generatingUSN() {
		System.out.println("Impl.generatingUSN()");
		
	}

}
