public class Fraction{

	private int numerateur;
	private int denominateur;

	private static final Fraction ZERO = new Fraction(0, 1);
	private static final Fraction UN = new Fraction(1, 1);

	public String toString() {
		return numerateur + "/" + denominateur;
	}

	// constructeur avec numerateur et denomerateur
	public Fraction(int numerateur, int denominateur) {
		this.numerateur = numerateur;
		this.denominateur = denominateur;
	}

	// constructeur avec juste un numerateur
	public Fraction(int numerateur) {
		this.numerateur = numerateur;
		this.denominateur = 1;
	}

	// constructeur sans argument
	public Fraction() {
		this.numerateur = 0;
		this.denominateur = 1;
	}

	// la fonction getNumerateur
	public int getNumerateur() {
		return this.numerateur;
	}

	public int getDenomirateur() {
		return this.denominateur;
	}

	public double doubleValue(){
		return (double) numerateur / denominateur;
	}

	public Fraction add(Fraction f){
		int Num=this.numerateur*f.denominateur+this.denominateur*f.numerateur;
		int den=this.denominateur*f.denominateur;

		return new Fraction(Num,den);
	}

	/*public boolean egal(Fraction f){
		boolean result=false;
		if(this.doubleValue()==f.doubleValue()){
			result=true;
		}
		return result;
	}*/

	public boolean equals(Object obj){
		if(this==obj) return true;
		if (obj==null) return false;
		if (this.getClass() != obj.getClass())  return false;
			Fraction f=(Fraction)obj;

		if (this.denominateur == 0 || f.denominateur == 0) return false;	
		if (this.doubleValue()==f.doubleValue()){return true;}
		else { return false;}
	}


	public static void main(String[] args) {

		Fraction fraction1 = new Fraction(3, 2);

		assert fraction1.toString().equals("3/2");

		Fraction fraction2 = new Fraction(8);

		assert fraction2.toString().equals("8");

		Fraction fraction3 = new Fraction();

		assert fraction3.toString().equals("0");

		//assertion pour tester la conversion

		assert fraction1.doubleValue()==1.5: "La conversion de la fraction a échoué.";

		System.out.println("La conversion de la fraction a réussi.");

		Fraction SommeFraction=fraction1.add(fraction2);

		assert SommeFraction.getNumerateur()==19;
		assert SommeFraction.getDenomirateur()==2;

		System.out.println("L'addition de fractions a réussi.");

	    assert fraction1.egal(fraction2):"les fractions ne sont pas égales !!";

		System.out.println("fraction et fraction sont égaux"); 
	}

}
