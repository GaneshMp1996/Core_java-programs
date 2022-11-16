package com.project.interfaceandabstract;

abstract class University {
	public void result() {
		System.out.println("University.result()");
	}

	public void courseAnnouncement() {
		System.out.println("University.courseAnnouncement()");
	}

	abstract void fee();

	abstract void generatingUSN();

}
