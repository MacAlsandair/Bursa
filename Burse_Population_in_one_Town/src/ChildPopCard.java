
public class ChildPopCard extends PopCard {
	
	PopCard parent;

	ChildPopCard(int population, SocialClass socialClass) {
		super(population, socialClass);
	}
	ChildPopCard (int population, PopCard popCard) {
		super(population, popCard.socialClass);
		this.parent = popCard;
	}

}
