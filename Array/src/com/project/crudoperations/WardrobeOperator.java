package com.project.crudoperations;

import java.util.Arrays;

public class WardrobeOperator {

	String[] store = new String[6];
	int count;

	@Override
	public String toString() {
		return "WardrobeOperator [store=" + Arrays.toString(store) + ", count=" + count + "]";
	}

	public boolean add(String thing) {
		if (thing != null && this.count < store.length) {
			System.out.println("Involked add()");
			this.store[count] = thing;
			System.out.println("Thing is Added: " + thing);
			count++;
			return true;

		} else {
			System.err.println("Thing is not added,,count is empty");
		}

		return false;

	}

	public boolean update(int index, String newThing) {
		if (newThing != null && index < store.length) {
			System.out.println("Involked Update()");
			this.store[index] = newThing;
			String whichDress = store[index];
			System.out.println("Thing is updated: " + whichDress);
			return true;
		} else {
			System.err.println("Thing is not updated");
		}
		return false;

	}

	public boolean match(String thing) {
		for (int dress = 0; dress < this.store.length; dress++) {
			String tempThing = this.store[dress];
			if (tempThing != null) {
				if (tempThing.equals(thing)) {
					System.out.println("Thing is mateched: " + thing);
					return true;
				}

			}

		}
		System.out.println("Thing is not matched");
		return false;
	}

	public boolean delete(int index) {
		if(index<this.store.length) {
			this.store[index]=null;
			System.out.println("Thing is pionting to null i.e this is deleted");
			return true;
			
		}
		else {
			System.err.println("Thing is not pointing to null");
		}
		return false;

	}

}
