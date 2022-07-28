
public class PopCardBuilder {

	public static PopCard createPopCard (int ammount, SocialClass socialClass) {
		return new PopCard(ammount, socialClass);
	}
	public static ChildPopCard createChildPopCard (int ammount, PopCard popCard) {
		return new ChildPopCard(ammount, popCard);
	}
}
