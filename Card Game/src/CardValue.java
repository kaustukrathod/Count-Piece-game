//class of 13 diffrents type of cards printed on cards for ex:- 2,k,q,j,a,3,10...
public class CardValue {
private String value;		
public CardValue(String a){
	if(a.equals("14"))			
		value="A";
		else if(a.equals("13"))
			value="K";
		else if(a.equals("12"))
			value="Q";
		
		else if(a.equals("11"))
			value="J";
		else
			value=a;
}
String getCardvalue(){
	return value;			//written what is printed for ex;-A,K,Q,J,2...
}
int getCardNumber(){		//return the value corresponding to the value.
	if(value=="A")
		return 14;
	else if(value=="J")
		return 11;
	else if(value=="Q")
		return 12;
	else if(value=="K")
		return 13;
	else
		return (int) Integer.parseInt(value);
}


}
