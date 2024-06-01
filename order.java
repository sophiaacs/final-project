package pkg;
import java.util.Scanner;
import java.util.Random;


public class order {
	String size;
	String flavor;
	String syrup;
	String topping1;
	String topping2;
	String topping3;
	int cherries;
	int buildscore;
	
	public order(String size, String flavor, String syrup, String topping1, String topping2, String topping3, int cherries) {
		this.size = size;
		this.flavor = flavor;
		this.syrup = syrup;
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.topping3 = topping3;
		this.cherries = cherries;
	}
	
	public String getSize() {
		return size;
	}
	
	public int getCherries() {
		return cherries;
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public String getSyrup() {
		return syrup;
	}
	
	public String getTopping1() {
		return topping1;
	}
	
	public String getTopping2() {
		return topping2;
	}
	
	public String getTopping3() {
		return topping3;
	}
	
	public int generateNumber() {
		int number = (int)(Math.random()*20);
		return number;
	}

	public int build(int flavor, int syrup) {
		int f = (int)(Math.random()*10);
		int s = (int)(Math.random()*20);
		int flavors = flavor-f;
		int syrups = syrup -s;
		if (Math.abs(flavors) <= 1 && Math.abs(syrups) <= 1) {
			buildscore = 100;
		}
		else if (Math.abs(flavors) <= 1 || Math.abs(syrups) <= 1) {
			buildscore = 95;
		}
		else if (Math.abs(flavors) >= 1 || Math.abs(syrups) >= 1) {
			buildscore = 65;
		}
		else if (Math.abs(flavors) <= 1 && Math.abs(syrups) <= 1) {
			buildscore = 50;
		}
		else if (Math.abs(flavors) >= 5 || Math.abs(syrups) >= 5) {
			buildscore = 30;
		}
		else if (Math.abs(flavors) <= 5 && Math.abs(syrups) <= 5) {
			buildscore = 1;
		}
		else if (Math.abs(flavors) == 10 && Math.abs(syrups) == 10) {
			buildscore = 0;
		}
		return buildscore;
	}
	
	

	public String getReceipt(){
		String a = "/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/";
		String name = "\n|    PAPA'S FREEZERIA    | \n|   1234 ice cream ave   | \n|    ****************    |\n|        RECEIPT         |\n|    ****************    |";
		String size1 = "\n| size ~ " + size + "               |";
		String flavor1 = "\n| flavor ~ " + flavor + "         |";
		String syrup1 = "\n| syrup ~ " + syrup + "          |";
		String topping = "\n| topping 1 ~ " + topping1 + "     |";
		String toppingg = "\n| topping 2 ~ " + topping2 + "     |";
		String toppinggg = "\n| topping 3 ~ " + topping3 + "     |";
		String space = " \n \n \n ";
		String b = "\n \\/\\/\\ /\\/\\/\\/\\/\\/\\/\\/\\/\\/";
		return a + name + size1 + flavor1 + syrup1 + topping + toppingg + toppinggg + b;
	}


}