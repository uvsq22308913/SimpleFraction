public class Fraction {

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

	public int getDenomerateur() {
		return this.denominateur;
	}

	public static void main(String[] args) {

		Fraction fraction1 = new Fraction(3, 2);

		assert fraction1.toString().equals("3/2");

		Fraction fraction2 = new Fraction(8);

		assert fraction2.toString().equals("8");

		Fraction fraction3 = new Fraction();

		assert fraction3.toString().equals("0");

		//System.out.println(ZERO.numerateur);

		//System.out.println(ZERO.getNumerateur());

		//System.out.println(.doubleValue());
		

	}

}

