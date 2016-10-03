import java.util.ArrayList;
import java.util.Scanner;

public class Elements {
	public static void main (String[] args) {
	  boolean run = true;
		
		while (run) {
			System.out.println("What element would you like information for? ");
			Scanner in = new Scanner(System.in);
			String inName = in.next();
			
			if (inName.equals("exit")) {
				run = !run;
				break;
			}
	
			ArrayList<String> data = projectMain.getInfo(inName);
			String name = data.get(0);
			String num = data.get(1);
			String sym = data.get(2);
			String mass = data.get(3);
			String melt = data.get(4);
			String boil = data.get(5);
			String density = data.get(6);
			String year = data.get(7);
			String group = data.get(8);
			String config = data.get(9);
			String energy = data.get(10);
			
			System.out.println("Showing information for " + name);
			System.out.println("	Name: 				" + name);
			System.out.println("	Symbol: 			" + sym);
			System.out.println("	Number: 			" + num);
			System.out.println("	Atomic Mass: 			" + mass);
			System.out.println("	Melting Point: 			" + melt);
			System.out.println("	Boiling Point: 			" + boil);
			System.out.println("	Density:			" + density);
			System.out.println("	Discovery Year: 		" + year);
			System.out.println("	Group: 				" + group);
			System.out.println("	Electron Configuration: 	" + config);
			System.out.println("	Ionization Energy: 		" + energy);
			System.out.println("");
			System.out.println("");
		}
		
	}
}
