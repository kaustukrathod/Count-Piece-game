import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class shuffleman {
Players[] player;
ArrayList<Card> card=new ArrayList<Card> ();
Suit[] suit; 
public shuffleman(){
	
}
void giveCardToPlayer(){			//distibute the card among the players
	Collections.shuffle(card);
	for(int i=0;i<52;i++){
		player[i%4].setCard(card.get(i));
	}
	
}


void gameStart(){					//game start.
	Random ra=new Random();
	int b=ra.nextInt(4)+0;
	String hakkum=suit[b].getSuitName();
	System.out.println("trump : "+hakkum);
	
	for(int i=0;i<13;i++){
		Players best=player[b];
		int d=-1;
		
		Card besst=best.getTheFirstCard();
		Card firstcard=besst;
		System.out.println("first card : "+firstcard.getSuitName());
		System.out.println(besst.getSuitName()+" "+besst.getCardValue()+" "+player[b%4].name);
		for(int j=b+1;j<b+4;j++){
			Card temp=player[j%4].findTheCard(firstcard.getSuitName());
			System.out.println(temp.getSuitName()+" "+temp.getCardValue()+" "+player[j%4].name);
			if(besst.getSuitName().equals(temp.getSuitName()) && besst.getCardNumber()<temp.getCardNumber()){
				besst=temp;
				best=player[j%4];
				d=j%4;
			}
			else if(temp.getSuitName().equals(hakkum) && besst.getSuitName().equals(hakkum) && temp.getCardNumber()>besst.getCardNumber()){
				besst=temp;
				best=player[j%4];
				d=j%4;
			}
			else if(temp.getSuitName().equals(hakkum) && !(besst.getSuitName().equals(hakkum)))
			{
				besst=temp;
				best=player[j%4];
				d=j%4;
			}
		}
		System.out.println("winner of the trick :  "+best.name);
		best.winTrick();
		if(d!=-1)
		b=d;
	}
}




void winners(){						//decided which team is winner.
	if(player[0].getWinTrick()+player[2].getWinTrick() < player[1].getWinTrick()+player[3].getWinTrick()){
		System.out.println("team 2 is winner !!!");
	}
	else
		System.out.println("team 1 is winner !!!");
}
}
