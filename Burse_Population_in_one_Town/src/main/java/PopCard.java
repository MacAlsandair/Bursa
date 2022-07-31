public class PopCard {
	private int population;
	private SocialClass socialClass;
	private static PullOfTown pullOfTown;
	private ChildPopCard child;

	PopCard(int population, SocialClass socialClass) {
		this.population = population;
		this.socialClass = socialClass;
		pullOfTown.PopCardPull.add(this);
	}

	public boolean hasChild () {
		if (child != null) {
			return true;
		}
		else return false;
	}



	public static void setBurseTown(PullOfTown pullOfTown1) {
		pullOfTown = pullOfTown1;
	}





	@Override
	public String toString() {
		return "PopCard [population=" + population + ", socialClass=" + socialClass + "]";
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public SocialClass getSocialClass() {
		return socialClass;
	}

	public void setSocialClass(SocialClass socialClass) {
		this.socialClass = socialClass;
	}

	public ChildPopCard getChild() {
		return child;
	}

	public void setChild(ChildPopCard child) {
		this.child = child;
	}



}
