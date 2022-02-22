package Yalla_solutionAssignment2;

import java.util.*;

public class AssignmentTwo {

	public static void main(String[] args) {	
		
		Scanner scan_assgn02 = new Scanner(System.in);
		AssignmentTwo Assign_02= new AssignmentTwo();
		String quit ="";
		
		do {
			System.out.println("Enter Question Number 1-6: \n1. Question 1\n2. Question 2\n3. Question 3\n4. Question 4\n5. Question 5\n6. Question 6");
			String c = scan_assgn02.nextLine();
			switch(c) {
			case "1": {
				
				System.out.println("Question 01");
				System.out.println("Enter the empty string and click enter to exit");
				ArrayList<String> Arrlist01 = new ArrayList<>();
				String s_StrSol1 = scan_assgn02.nextLine();
				while (!s_StrSol1.equals("")) {
					Arrlist01.add(s_StrSol1);
					s_StrSol1 = scan_assgn02.nextLine();
				}
				Assign_02.Sol1(Arrlist01);
				break;
			}
			case "2": {

				System.out.println("Question 02");
				System.out.println("Enter the empty string and click enter to exit");
				ArrayList<String> Arrlist02 = new ArrayList<>();
				String s_StrSol2  = scan_assgn02.nextLine();
				while (!s_StrSol2.equals("")) {
					Arrlist02.add(s_StrSol2);
					s_StrSol2 = scan_assgn02.nextLine();
				}
				System.out.println(Assign_02.Sol2(Arrlist02));
				break;
			}
			case "3": {
				System.out.println("Question 03");
				ArrayList<Integer> Arrlist03 = new ArrayList<>();
				System.out.println("Enter any negative value to exit from the list");
				int next = scan_assgn02.nextInt();
				while (next > 0) {
					Arrlist03.add(next);
					next = scan_assgn02.nextInt();
				}
				Assign_02.Sol3(Arrlist03);
				break;
			}
			case "4": {
				System.out.println("Question 04");
				System.out.println("Enter the empty string and click enter to exit");
				ArrayList<String> Arrlist04 = new ArrayList<>();
				String s_StrSol4=scan_assgn02.nextLine();
				while (!s_StrSol4.equals("")) {
					Arrlist04.add(s_StrSol4);
					s_StrSol4 = scan_assgn02.nextLine();
				}
				System.out.println(Assign_02.Sol4(Arrlist04));
				break;
			}
			
			case "5": {
				System.out.println("Question 05");
				ArrayList<String> Arrlist05 = new ArrayList<>();
				System.out.println("Enter the empty string and click enter to exit");
				String s_StrSol5 = scan_assgn02.nextLine();
				while (!s_StrSol5.equals("")) {
					Arrlist05.add(s_StrSol5);
					s_StrSol5 = scan_assgn02.nextLine();
				}
				System.out.println(Assign_02.Sol5(Arrlist05));
				break;
			}
			case "6":{
				System.out.println("Question 06");
				System.out.println("Enter the empty string and click enter to exit");
				ArrayList<String> Arrlist06 = new ArrayList<>();
				String s_StrSol6 = scan_assgn02.nextLine();
				while (!s_StrSol6.equals("")) {
					Arrlist06.add(s_StrSol6);
					s_StrSol6 = scan_assgn02.nextLine();
				}
				System.out.println(Assign_02.Sol6(Arrlist06));
				break;
			}
			default : {
				System.out.println("Enter Correct Choice between 1-6: ");
			}
			
			}
			
			System.out.println("to exit from the program, Enter Q or q:");
			quit=scan_assgn02.nextLine();
			
			
		}while(!quit.equalsIgnoreCase("q"));	
		
		scan_assgn02.close();
		
	}
	
	public void Sol1(ArrayList<String> S1) {

		Map<String, Integer> mapObj = new HashMap<>();
		for (int i = 0; i < S1.size(); i++) {
			if (mapObj.containsKey(S1.get(i))) {
				mapObj.computeIfPresent(S1.get(i), (K1, V1) -> V1 = V1 + 1);
			} else {
				mapObj.put(S1.get(i), 1);
			}
		}
		System.out.println(mapObj);

	}
	
	public Map<Character, String> Sol2(ArrayList<String> S1) {
		Map<Character, String> mapObj = new HashMap<>();
		
		for (int i = 0; i < S1.size(); i++) {
			String value_Sol2 = S1.get(i);
			if (mapObj.containsKey(S1.get(i).charAt(0))) {
				mapObj.computeIfPresent(value_Sol2.charAt(0), (K1, V1) -> V1 = V1 + value_Sol2);
			} else {
				mapObj.put(S1.get(i).charAt(0), S1.get(i));
			}
		}
		return mapObj;

	}
	
	public Set<Integer> Sol3(ArrayList<Integer> A1) {

		Set<Integer> setObj = new HashSet<>();
		System.out.print("[");
		for (int i = 0; i < A1.size(); i++) {
			int val_Sol3 = A1.get(i);
			if (setObj.contains(val_Sol3)) {
				while (setObj.contains(val_Sol3)) {
					val_Sol3++;
				}
				setObj.add(val_Sol3);
			} else {
				setObj.add(val_Sol3);
			}
			System.out.print(val_Sol3);
			if (i != A1.size() - 1) {
				System.out.print(",");
			}
		}
		System.out.println("]");

		return setObj;
	}
	
	public ArrayList<String> Sol4(ArrayList<String> A1) {
		// TODO Auto-generated method stub
		ArrayList<String> A2 = new ArrayList<>();
		for (int i = 0; i < A1.size(); i++) {
			char ch[] = A1.get(i).toCharArray();
			Map<Character, Integer> mapObj = new HashMap<>();

			String strAssign02_sol4 = "";
			for (int l = 0; l < ch.length; l++) {
				if (!mapObj.containsKey(ch[l])) {
					strAssign02_sol4 += ch[l];
					mapObj.put(ch[l], 1);
				}
			}
			A2.add(strAssign02_sol4);
		}
		return A2;

	}
	
	public Map<String, String> Sol5(ArrayList<String> A) {
		// TODO Auto-generated method stub
		Map<String, String> mapObj = new HashMap<>();
		for (int i = 0; i < A.size(); i++) {
			String char_assgn02 = Character.toString(A.get(i).charAt(0));
			String char2_assgn02 = Character.toString(A.get(i).charAt(A.get(i).length() - 1));
			if (mapObj.containsKey(char_assgn02)) {
				mapObj.computeIfPresent(char_assgn02, (K1, V1) -> V1 = char2_assgn02);
			} else {
				mapObj.put(char_assgn02, char2_assgn02);
			}
		}
		return mapObj;

	}

	public Map<String, Boolean> Sol6(ArrayList<String> S1) {

		Map<String, Boolean> mapObj = new HashMap<>();
		for (int i = 0; i < S1.size(); i++) {
			if (mapObj.containsKey(S1.get(i))) {
				mapObj.computeIfPresent(S1.get(i), (K1, V1) -> V1 = true);
			} else {
				mapObj.put(S1.get(i), false);
			}
		}
		return mapObj;

	}

}
