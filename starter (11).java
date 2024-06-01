import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("size (S, M, L): ");
		String size = sc.nextLine();
		
		while (!size.equalsIgnoreCase("s") && !size.equalsIgnoreCase("m") && !size.equalsIgnoreCase("l")) {
				System.out.println("not a valid flavor!");
				System.out.print("size: ");
				size = sc.nextLine();
				if (size.equalsIgnoreCase("s") && size.equalsIgnoreCase("m") && size.equalsIgnoreCase("l")) {
					System.out.print("");
				}
		}
		
		System.out.println(" ------");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   |🍓| <-- strwb");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   |🍑|");
		System.out.println(" |    |   ----");
		System.out.println(" |    | ");
		System.out.println("--------");
		
		System.out.print("flavor: ");
		String flavor = sc.nextLine();
			while (!flavor.equalsIgnoreCase("strwb") && !flavor.equalsIgnoreCase("peach")) {
				System.out.println("not a valid flavor!");
				System.out.print("flavor: ");
				flavor = sc.nextLine();
				if (flavor.equalsIgnoreCase("strwb") && flavor.equalsIgnoreCase("peach")) {
					System.out.print("");
				}
			}

		System.out.println(" ------");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   |🍫| <-- choco");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   |🍦| <-- vnlla");
		System.out.println(" |    |   ----");
		System.out.println(" |    | ");
		System.out.println("--------");
		
		System.out.print("syrup: ");
		String syrup = sc.nextLine();
		
		while (!syrup.equalsIgnoreCase("choco") && !syrup.equalsIgnoreCase("vnlla")) {
				System.out.println("not a valid flavor!");
				System.out.print("syrup: ");
				syrup = sc.nextLine();
				if (syrup.equalsIgnoreCase("choco") && syrup.equalsIgnoreCase("vnlla")) {
					System.out.print("");
				}
		}
		
		System.out.println("----  ----");
		System.out.println("|🍬|  |🍫| sprnkl/chcodz");
		System.out.println("----  ----");
		System.out.println("----  ----");
		System.out.println("|🍒|  |🍰| cherry/whpdcr");
		System.out.println("----  ----");
		
		System.out.println("write 'notopg' for no topping");
		
		System.out.print("topping 1: ");
		String topping1 = sc.nextLine();
		
		while (!topping1.equalsIgnoreCase("notopg") && !topping1.equalsIgnoreCase("sprnkl") && !topping1.equalsIgnoreCase("chcodz") && !topping1.equalsIgnoreCase("cherry") && !topping1.equalsIgnoreCase("whpdcr")) {
				System.out.println("not a valid topping!");
				System.out.print("topping 1: ");
				topping1 = sc.nextLine();
				if (topping1.equalsIgnoreCase("notopg") && topping1.equalsIgnoreCase("sprnkl") && topping1.equalsIgnoreCase("chcodz") && topping1.equalsIgnoreCase("cherry") && topping1.equalsIgnoreCase("whpdcr")) {
					System.out.print("");
				}
		}
		
		System.out.print("topping 2: ");
		String topping2 = sc.nextLine();
		
		while (!topping2.equalsIgnoreCase("notopg") && !topping2.equalsIgnoreCase("sprnkl") && !topping2.equalsIgnoreCase("chcodz") && !topping2.equalsIgnoreCase("cherry") && !topping2.equalsIgnoreCase("whpdcr")) {
				System.out.println("not a valid topping!");
				System.out.print("topping 2: ");
				topping2 = sc.nextLine();
				if (topping2.equalsIgnoreCase("notopg") && topping2.equalsIgnoreCase("sprnkl") && topping2.equalsIgnoreCase("chcodz") && topping2.equalsIgnoreCase("cherry") && topping2.equalsIgnoreCase("whpdcr")) {
					System.out.print("");
				}
		}
		
		System.out.print("topping 3: ");
		String topping3 = sc.nextLine();
		
		while (!topping3.equalsIgnoreCase("notopg") && !topping3.equalsIgnoreCase("sprnkl") && !topping3.equalsIgnoreCase("chcodz") && !topping3.equalsIgnoreCase("cherry") && !topping3.equalsIgnoreCase("whpdcr")) {
				System.out.println("not a valid topping!");
				System.out.print("topping 3: ");
				topping3 = sc.nextLine();
				if (topping3.equalsIgnoreCase("notopg") && topping3.equalsIgnoreCase("sprnkl") && topping3.equalsIgnoreCase("chcodz") && topping3.equalsIgnoreCase("cherry") && topping3.equalsIgnoreCase("whpdcr")) {
					System.out.print("");
				}
		}
		
		int ch = 0;
		if (topping1.equalsIgnoreCase("cherry") || topping2.equalsIgnoreCase("cherry") || topping3.equalsIgnoreCase("cherry")) {
			System.out.print("number of cherries: ");
			int howmanycherries = sc.nextInt();
			System.out.println("");
			ch = howmanycherries;
		}
		
		order s = new order(size, flavor, syrup, topping1, topping2, topping3, ch);
		System.out.println(s.getReceipt());
		
		System.out.println("----❤️----❤️----❤️----");
		System.out.println("perfect!  now it's time to make the drink!");
		System.out.println("❤️ build station ❤️");
		System.out.println("");
		
		System.out.println(" ------");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   |🍓|");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   ----");
		System.out.println(" |    |   |🍑|");
		System.out.println(" |    |   ----");
		System.out.println(" |    | ");
		System.out.println("--------");
		
		System.out.print("choose the correct flavor (if you don't remember, write 'idk'): ");
		String flavor1 = sc.nextLine();
		//sc.nextLine();
		
		while (!flavor1.equalsIgnoreCase("strwb") && !flavor1.equalsIgnoreCase("peach")) {
			if (flavor1.equalsIgnoreCase("idk")) {
			System.out.println("flavor ~ " + s.getFlavor());
			System.out.print("one more chance!  \nchoose the correct flavor: ");
		}
			else {
				System.out.println("not a valid flavor!");
				System.out.print("flavor: ");
			}
			flavor1 = sc.nextLine();
		}
		
		if (flavor1.equalsIgnoreCase("strwb")) {
			System.out.println(" ------");
			System.out.println(" |    |   ----");
			System.out.println(" |    |   |🍓|");
			System.out.println(" |    |   ----");
			System.out.println(" |    |   ----");
			System.out.println(" | 🍓 |   |🍑|");
			System.out.println(" |    |   ----");
			System.out.println(" |    | ");
			System.out.println("--------");
			System.out.print("guess a number 0-10: ");
			int guess1 = sc.nextInt();
			while (guess1 > 10 || guess1 < 0) {
				System.out.print("guess a number 0-10: ");
				guess1 = sc.nextInt();
				if (guess1 <= 10 && guess1 >= 0) {
					System.out.print("");
				}
			}
			
			System.out.print("guess a number 0-20: ");
			int guess2 = sc.nextInt();
			
			while (guess2 > 20 || guess2 < 0) {
				System.out.print("guess a number 0-20: ");
				guess2 = sc.nextInt();
				if (guess2 <= 20 && guess1 >= 0) {
					System.out.print("");
				}
			}
		
			System.out.print("choose the correct syrup (if you don't remember, write 'idk'): ");
			String syrup1 = sc.nextLine();
		
			
			while (!syrup1.equalsIgnoreCase("vnlla") && !syrup1.equalsIgnoreCase("choco")) {
			if (syrup1.equalsIgnoreCase("idk")) {
			System.out.println("syrup ~ " + s.getSyrup());
			System.out.print("one more chance!  \nchoose the correct syrup: ");
		}
			else {
				System.out.println("not a valid syrup!");
				System.out.print("syrup: ");
			}
			syrup1 = sc.nextLine();
		}
		
			
			System.out.println("score: " + s.build(guess1, guess2) + "%");
			
		}
		else if (flavor1.equalsIgnoreCase("peach")) {
			System.out.println(" ------");
			System.out.println(" |    |   ----");
			System.out.println(" |    |   |🍓|");
			System.out.println(" |    |   ----");
			System.out.println(" |    |   ----");
			System.out.println(" | 🍑 |   |🍑|");
			System.out.println(" |    |   ----");
			System.out.println(" |    | ");
			System.out.println("--------");
			System.out.print("guess a number 0-10: ");
			int guess1 = sc.nextInt();
			
			while (guess1 < 0 || guess1 > 10) {
				System.out.print("guess a number 0-10: ");
				guess1 = sc.nextInt();
				if (guess1 >= 0 && guess1 <= 10) {
					System.out.println ("");
				}
			}
			
			System.out.print("guess a number 0-20: ");
			int guess2 = sc.nextInt();
			
			while (guess2 > 20 || guess2 < 0) {
				System.out.print("guess a number 0-20: ");
				guess2 = sc.nextInt();
				if (guess2 <= 20 && guess2 >= 0) {
					System.out.print("");
				}
			}
			
			System.out.print("choose the correct syrup (if you don't remember, write 'idk'): ");
			String syrup1 = sc.nextLine();
		
			
			while (!syrup1.equalsIgnoreCase("vnlla") && !syrup1.equalsIgnoreCase("choco")) {
			if (syrup1.equalsIgnoreCase("idk")) {
			System.out.println("syrup ~ " + s.getSyrup());
			System.out.print("one more chance!  \nchoose the correct syrup: ");
		}
			else {
				System.out.println("not a valid syrup!");
				System.out.print("syrup: ");
			}
			syrup1 = sc.nextLine();
		}
			
			System.out.println("score: " + s.build(guess1, guess2) + "%");
		}
		else {
			System.out.println ("wrong");
			System.out.println("score: " + s.build(10, 10) + "%");	
		}
		
		
		System.out.println("❤️ mix station ❤️");
		System.out.println("");
		
		int a = s.generateNumber();
		int b = s.generateNumber();
		int c = s.generateNumber();
		
		int answer1 = a+b;
		int answer2 = c*a;
		int answer3 = b/c;
		
		System.out.print(a + "+" + b + "= ");
		int math1 = sc.nextInt();
		
		System.out.print(c + "*" + a + "= ");
		int math2 = sc.nextInt();
		
		System.out.print("round down \n" + b + "/" +  c + "= ");
		int math3 = sc.nextInt();
		
		if (math1 == answer1 && math2 == answer2 && math3 == answer3) {
			System.out.println("score: 100%");
		}
		else if (math1 != answer1 || math2 != answer2 || math3 != answer3) {
			System.out.println("score: 50%");
		}
		else if (math1 != answer1 && math2 != answer2 && math3 != answer3) {
			System.out.println("score: 0%");
		}
		else {
			System.out.println("");
		}
		System.out.println("❤️ topping station ❤️");
		System.out.println("");
		
		System.out.println("choose the correct toppings \nif you don't remember, write 'idk'");
		System.out.print("topping 1: ");
		String toppingone = sc.nextLine();
		sc.nextLine();
		
		if (toppingone.equalsIgnoreCase("idk")) {
			System.out.println("topping 1 ~ " + s.getTopping1());
			System.out.println("one more chance!  choose the correct topping: ");
			toppingone = sc.nextLine();
		}
		
		System.out.print("topping 2: ");
		String toppingtwo = sc.nextLine();
		
		if (toppingtwo.equalsIgnoreCase("idk")) {
			System.out.println("topping 2 ~ " + s.getTopping2());
			System.out.print("one more chance!  choose the correct topping: ");
			toppingtwo = sc.nextLine();
		}
		
		System.out.print("topping 3: ");
		String toppingthree = sc.nextLine();
		
		if (toppingthree.equalsIgnoreCase("idk")) {
			System.out.println("topping 3 ~ " + s.getTopping3());
			System.out.print("one more chance!  choose the correct topping: ");
			toppingthree = sc.nextLine();
		}
		
		int chh = 0;
		if (toppingone.equalsIgnoreCase("cherry") || toppingtwo.equalsIgnoreCase("cherry") || toppingthree.equalsIgnoreCase("cherry")) {
			System.out.print("number of cherries (if you don't remember, write '0'): ");
			int cherries = sc.nextInt();
			if (cherries == 0) {
			System.out.println("number of cherries ~ " + s.getCherries());
			System.out.print("one more chance!  choose the correct number: ");
			cherries = sc.nextInt();
			chh = cherries;
		}
		}
		
		
		
		if (topping1.equalsIgnoreCase(toppingone) && topping2.equalsIgnoreCase(toppingtwo) && topping3.equalsIgnoreCase(toppingthree) && chh == ch) {
			System.out.println("score: 100%");
		}
		else{
			System.out.println("score: 0%");
		}
		
		System.out.println("good job!");
		System.out.println("-- CUSTOMER REVIEW --");
		System.out.print("tip: ");
		int tip = sc.nextInt();
		System.out.println("");
		
		System.out.print("you made $" + tip);
		
		
		
		} 	
		
		

//}
}