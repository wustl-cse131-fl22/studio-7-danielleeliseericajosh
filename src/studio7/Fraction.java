package studio7;

public class Fraction {

	private int top;
	private int bot;

public Fraction (int a, int b) {
	this.top = a;
	this.bot = b;
}

public void setTop(int a) {
	this.top=a;
}

public void setBot(int b) {
	this.bot=b;
}
public int getTop() {
	return this.top;
}
public int getBot() {
	return this.bot;
}
public Fraction sum(Fraction other) {
	int numerator = (this.getTop()*other.getBot())+(other.getTop()*this.getBot());
	int denominator = this.getBot()*other.getBot();
	
	return new Fraction(numerator, denominator); //replacing top & bot in the top as num & denom
	
}
public Fraction reciprocal() {
	
	return new Fraction(this.bot, this.top); //could also do getTop and getBot instead of this.
	
}
public Fraction multiplication(Fraction other) {
	return new Fraction((this.getTop()*other.getTop()), (this.getBot()*other.getBot()));
	
}


	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub

	}

}
