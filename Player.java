import java.util.ArrayList;

public class Player {

	private String name;
	private int chips;
	private int bet;
	int total;

	ArrayList<Card> OneRoundCard = new ArrayList<Card>();

	public Player(String n, int c) {
		chips = c;
		name = n;

	}

	public String getName() {

		return name;

	}

	public int makeBet() {
		bet = 1;
		return bet;

	}

	public void setOneRoundCard(ArrayList cards) {
		OneRoundCard = cards;

	}

	public boolean hitMe() {
		int sum = 0;
		int AceRank = 0;
		for (int i = 0; i < OneRoundCard.size(); i++) {
			if (OneRoundCard.get(i).getRank() > 10) {
				sum += 10;
			} else if (OneRoundCard.get(i).getRank() == 1) {
				sum += 11;
				AceRank++;
			} else {
				sum += OneRoundCard.get(i).getRank();
			}

		}
		if (sum > 21 && AceRank != 0) {
			sum -= 10;
			AceRank--;
		}
		if (sum >= 17) {
			total = sum;
			return false;
		} else
			return true;
	}

	public int getTotalValue() {

		return total;// �^�Ǧ��P���ұo���d�I�ƥ[�`

	}

	public int getCurrentChips() {

		return chips;// �^�Ǫ��a�{���w�X

	}

	public void increaseChips(int diff) {// ���a�w�X�ܰʡAsetter
		chips = chips + diff;
	}

	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
		// TODO Auto-generated method stub

	}
}
