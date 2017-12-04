import java.util.ArrayList;

class Deck {

	int randum = 0;
	Card k ;
	private ArrayList<Card> cards;
	public int nUsed;
	private ArrayList<Card> usedCard;
	private ArrayList openCard; 

	// TODO: Please implement the constructor (30 points)

	public Deck(int nDeck) {
		usedCard = new ArrayList<Card>();//�ιL���d
		cards = new ArrayList<Card>();
		for (int i = 0; i < nDeck; i++) {
			for (Card.Suit s : Card.Suit.values()) {
				for (int y = 1; y <= 13; y++) { // 13�i�d
					Card card = new Card(s, y);
					cards.add(card);
				}
			}
		}
	}

	public void printDeck() {
		for (int i = 0; i < cards.size(); i++) {
			cards.get(i).printCard();
		}

	}

	public ArrayList<Card> getAllCards() {
		return cards;
	}

	public Card getOneCard(boolean isOpened) {
		shuffle();
		nUsed = nUsed +1;   
		return cards.get(randum);//�ιL���P
	}

	public void shuffle() {
		randum = (int) (Math.random() * cards.size());//�ü�
		usedCard.add(cards.get(randum));              //�ιL���d����üƪ��쪺�d
		cards.remove(randum);                         //�����ιL���d�קK����
		if (cards.size() == 0)                         //���W�S�P�F���]usedCard
			usedCard.removeAll(usedCard);
		cards.get(randum);
	}
	public ArrayList getOpenedCard(){
		openCard.add(usedCard);
		return openCard;
		
	}
}