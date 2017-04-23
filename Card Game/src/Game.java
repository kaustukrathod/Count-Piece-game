import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Game {

	private static Scanner kc;

	public static void main(String[] args) {
		kc = new Scanner(System.in);

Suit[] suit=new Suit[4];
suit[0]=new Suit("spades");
suit[1]=new Suit("hearts");
suit[2]=new Suit("diamonds");
suit[3]=new Suit("clubs");
CardValue[] cardvalue=new CardValue[13];
for(int i=0;i<13;i++){
cardvalue[i]=new CardValue(""+(i+2));	
}
//Card[] card=new Card[52];
ArrayList<Card> card=new ArrayList<Card>();
{
//int count=0;
for(int i=0;i<4;i++){
	for(int j=0;j<13;j++){
		Card a=new Card(suit[i],cardvalue[j]);
		card.add(a);
	}
}
}
Collections.shuffle(card);
Players[] player=new Players[4];
System.out.println("enter player name");
for(int i=0;i<4;i++){
	String saks=kc.nextLine();
	player[i]=new Players(/*kc.nextLine()*/saks);
}
shuffleman shufflemen=new shuffleman();
shufflemen.player=player;
shufflemen.card=card;
shufflemen.giveCardToPlayer();
shufflemen.suit=suit;
shufflemen.gameStart();

for(int i=0;i<4;i++)
	System.out.println(player[i].name+" win : " +player[i].getWinTrick());

shufflemen.winners();


	}
}
