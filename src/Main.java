
public class Main {

	public static void main(String[] args) {

		Voiture cars = new Voiture("Flash", 2, 2, "BX4000", "rouge");
		System.out.println(cars.getNom());

		cars.avancer();
		cars.freiner();
		cars.marcheAr();

		System.out.println(cars.getCouleur());
		cars.changerCouleur("bleu");
		System.out.println(cars.getCouleur());
		cars.changerCouleur("jaune");
		System.out.println(cars.getCouleur());

		cars.setCouleur("noir");
		System.out.println(cars.getCouleur());
		System.out.println(cars.getNombreDePortes());
		cars.setNombreDePortes(156);
		System.out.println(cars.getNombreDePortes());
	}
}
