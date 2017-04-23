//sfsd//class of 52 diffrent cards. 
public class Card {
private Suit suit;					//Suit type.
private CardValue  value;		 	//cardvalue to assigns
public Card (Suit a,CardValue c){
	suit=a;
	value=c;
}
String getSuitName(){
	return suit.getSuitName();   	//return type of suit name.
}
String getCardValue(){
	return value.getCardvalue();	//return the value printed on cards
}
int getCardNumber(){
	return value.getCardNumber();	//return the int value corresponding cardvalue
}


}
