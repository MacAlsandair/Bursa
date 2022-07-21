import java.util.HashSet;

public class PopCard {
	int population;
	SocialClass socialClass;
	static PullOfTown burseTown;
	ChildPopCard child;
	
	PopCard(int population, SocialClass socialClass) {
		this.population = population;
		this.socialClass = socialClass;
		burseTown.PopCardPull.add(this);
	}
	
	public boolean hasChild () {
		if (child != null) {
			return true;
		}
		else return false;
	}
	
	
	
	public static void setBurseTown(PullOfTown BurseTown) {
		burseTown = BurseTown;
	}





	@Override
	public String toString() {
		return "PopCard [population=" + population + ", socialClass=" + socialClass + "]";
	}
	
	
	
}
