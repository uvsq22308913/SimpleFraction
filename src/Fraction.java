public class Fraction extends java.lang.Number implements Comparable<Fraction>{

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

	public int compareTo(Fraction f){
		if(this.doubleValue()<f.doubleValue())
			return -1;
		else if(this.doubleValue()==f.doubleValue())
			return 0;
		else
		    return 1;
	}

	@Override
    public float floatValue() {
        return (float) numerateur / denominateur;
    }

    @Override
    public long longValue() {
        return (long) numerateur / denominateur;
    }

    @Override
    public int intValue() {
        return numerateur / denominateur;
    }



	public static void main(String[] args) {

		Fraction fraction1 = new Fraction(3, 2);

		assert fraction1.toString().equals("3/2");

		Fraction fraction2 = new Fraction(8);

		assert fraction2.toString().equals("8");

		Fraction fraction3 = new Fraction();

		assert fraction3.toString().equals("0");

		Fraction fraction4 = new Fraction(24,3);

		assert fraction2.toString().equals("8");

		//assertion pour tester la conversion

		assert fraction1.doubleValue()==1.5: "La conversion de la fraction a échoué.";

		System.out.println("La conversion de la fraction a réussi.");

		Fraction SommeFraction=fraction1.add(fraction2);

		assert SommeFraction.getNumerateur()==19;
		assert SommeFraction.getDenomirateur()==2;

		System.out.println("L'addition de fractions a réussi.");

	    assert fraction2.equals(fraction4):"les fractions ne sont pas égaaux !!";

		System.out.println("fraction2 et fraction4 sont égaux");

		assert fraction1.compareTo(fraction2)==-1:"fraction1 n'est pas inférieur à fraction2";

		System.out.println("fraction1 est inférieur à fraction2");

		assert fraction2.compareTo(fraction1)==1:"fraction2 n'est pas supérieur à fraction1";

		System.out.println("fraction2 est supérieur à fraction1");

		 Number aNumber = java.math.BigDecimal.ONE;
		 Number anotherNumber = new Fraction(1, 2);
 		 assert java.lang.Math.abs(aNumber.doubleValue() + anotherNumber.doubleValue() - 1.5) < 1E-8;
	}

}
