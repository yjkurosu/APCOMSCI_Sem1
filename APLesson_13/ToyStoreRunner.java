public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore t1 = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(t1);
		System.out.println("Most Frequent Toy: " + t1.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + t1.getMostFrequentType());
	}
}