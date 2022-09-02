package com.macalsandair;

public class Person {
	private int dna;
	private String ideology;
	
	Person (int dna, String ideology) {
		this.setDna(dna);
		this.setIdeology(ideology);
	}

	public String getIdeology() {
		return ideology;
	}

	public void setIdeology(String ideology) {
		this.ideology = ideology;
	}

	public int getDna() {
		return dna;
	}

	public void setDna(int dna) {
		this.dna = dna;
	}
}
