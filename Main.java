package module3;

import java.util.ArrayList;
import java.util.List;

	class Cake {

		String name;
		float price;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getPrice() {
			return price;
		}

		public void setPrice(float price) {
			this.price = price;
		}

		public void display() {
			System.out.println("  " + name + " : " + '\u20B9' + " " + price + " per pound");
		}
	}


	class Pastry extends Cake {

		@Override
		public void display() {
			System.out.println("  " + name + " : " + '\u20B9' + " " + price + " per piece");
		}
	}



	public class Main {
		public static void main(String[] args) {

			Cake brownieCake = new Cake();
			brownieCake.setName("Chocolate Brownie");
			brownieCake.setPrice(250);

			Cake mapleCake = new Cake();
			mapleCake.setName("Chocolate Maple");
			mapleCake.setPrice(300);

			List<Cake> cakeList = new ArrayList<>();
			cakeList.add(brownieCake);
			cakeList.add(mapleCake);
			
			Pastry blackForestPastry = new Pastry();
			blackForestPastry.setName("Black Forest");
			blackForestPastry.setPrice(35);

			Pastry chocoTrufflePastry = new Pastry();
			chocoTrufflePastry.setName("Choco Truffle");
			chocoTrufflePastry.setPrice(40);

			List<Pastry> pastryList = new ArrayList<>();
			pastryList.add(blackForestPastry);
			pastryList.add(chocoTrufflePastry);

			System.out.println("         Today's Special Menu");
			System.out.println("-----------------------------------------");

			System.out.println();
			System.out.println("  Special Cakes");
			System.out.println("  -------------------------------");

			for (Cake cake: cakeList) {
				cake.display();
			}

			System.out.println();
			System.out.println("  Special Pastries");
			System.out.println("  -------------------------------");

			for (Pastry pastry: pastryList) {
				pastry.display();
			}
		}
	}

