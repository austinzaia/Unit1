import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

	public static void main(String[] args) {
		String input = "";
		Scanner scanner = new Scanner(System.in);
		List<Variable> vList = new ArrayList<Variable>();
		
		while (!input.equals("}")) {
			System.out.println("Declare a variable, please make sure to follow the <type> <name> syntax. Enter } to quit.");
			input = scanner.nextLine();
			if (!input.equals("}")) {
				StringTokenizer vars = new StringTokenizer(input);
				String type = vars.nextToken(" ");
				String name = vars.nextToken(" ");
				
				Variable variable = new Variable(name, type);
				vList.add(variable);
			}
		}
		scanner.close();
		System.out.println("Variable names:");
		printVariableNames(vList);
		System.out.println("Total Bits: " + getTotalBits(vList));

	}
	
	public static void printVariableNames(List<Variable> v) {
		for (Variable vars : v) {
			System.out.println(vars.getName());
		}
	}
	
	public static int getTotalBits(List<Variable> v) {
		int totalBits = 0;
		for (Variable vars : v) {
			totalBits += vars.getBits();
		}
		return totalBits;
	}
}
