//the class which will produce player object.
import java.util.ArrayList;
import java.util.Random;

public class Players {
String name;
private ArrayList<Card> card=new ArrayList<Card>();
private int winTrick=0;
private int totalCard=0;
public Players(String a){
	name=a;
}
void setCard(Card a){		//it will assign the card to player.
	card.add(a);
	totalCard++;
}
Card getCard(int a){
	return card.get(a);
}
void winTrick(){		//count the number of winning trick
	winTrick++;
}
int getWinTrick(){
	return winTrick;	//return no of winning trick
}
Card findTheCard(String a){
	for(int i=0;i<totalCard;i++){
		if(a.equals(card.get(i).getSuitName())){
			Card temp=card.get(i);
			card.remove(i);
			totalCard--;
			return temp;
		}
	}
	return this.getTheFirstCard();
}
Card getTheFirstCard(){
	Random ra=new Random();
	int b=ra.nextInt(totalCard)+0;
	Card temp=card.get(b);
	card.remove(b);
	totalCard--;
	return temp;
}
}
