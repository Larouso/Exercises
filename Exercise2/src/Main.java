public class Main {

	public static void main(String[] args) {
		
		Lesson l1 = new Lesson("Java Programming","First Semester","Thanos Petalotis",30.0);
		Lesson l2 = new Lesson("UML", "First Semester", "Thanos Petalotis", 20.0);
		Lesson l3 = new Lesson("Docker", "First Semester", "Thanos Petalotis", 50.0);
		l1.printAll();
		System.out.println("---------------------------------------");
		l2.printAll();
		System.out.println("---------------------------------------");
		l3.printAll();
		System.out.println("---------------------------------------");
		
		double sum = l1.getCredits() + l2.getCredits() + l3.getCredits();
		if(sum >= 100) {
			System.out.println("Total score: " + sum);
			System.out.println("Student has passed");
		}
		else {
			System.out.println("Total score: " + sum);
			System.out.println("Student has not passed");
		}
	}

}
