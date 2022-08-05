package com.alsandair.mac;
import java.util.ArrayList;

public class Town implements Locality {
	private ArrayList <PopCard> pullOfPopCards;
	private static ArrayList <Town> pullOfTowns = new ArrayList<> ();
	
	
	public Town () {
		this.setPullOfPopCards(new ArrayList <PopCard> ());
		Town.getPullOfTowns().add(this);
		
	}
	
	


	public ArrayList <PopCard> getPullOfPopCards() {
		return pullOfPopCards;
	}


	public void setPullOfPopCards(ArrayList <PopCard> pullOfTown) {
		this.pullOfPopCards = pullOfTown;
	}


	public static ArrayList <Town> getPullOfTowns() {
		return pullOfTowns;
	}


	public static void setPullOfTowns(ArrayList <Town> pullOfTowns) {
		Town.pullOfTowns = pullOfTowns;
	}




	@Override
	public String toString() {
		return "Town [pullOfPopCards=" + pullOfPopCards + "]";
	}

	
	
}
