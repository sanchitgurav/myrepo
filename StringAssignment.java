package StringHandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		program1();
		System.out.println();
		program2();
		System.out.println();
		program3();
		System.out.println();
		program4();
		System.out.println();
		program5();
		System.out.println();
		program6_way1();
		System.out.println();
		program6_way2();
		System.out.println();
		program7();
		System.out.println();
		program8();
	}

	// 1. WAP to take string and display the following result.
	static void program1() {
		String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
		String st="";
		for(int i = 0;i < str.length()-1; i++){
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(i+1);
			if(ch1==ch2){
				st=st+str.charAt(i);
			}else{				
				st=st+str.charAt(i);
				if(st.length()>1)
					System.out.println("\""+st+"\" occured: "+st.length()+" times in given string");
				st = "";
			}
		}
	}

	/*
	 * 2. WAP take any String and display number of occurrences of each character
	 * which is occurring more than 1 times.
	 */
	static void program2() {
		String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
		// step1
		ArrayList<Character> list = new ArrayList<>(); // first convert array into list
		for (char ch : str.toCharArray()) { // adding in list
			list.add(ch);
		}
		System.out.println(list);
		// step2
		LinkedHashSet<Character> set = new LinkedHashSet<>(list); // pass the list into set to remove duplicacy
		System.out.println(set);
		// step3
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (Character uniqueValue : set) {
			map.put(uniqueValue, Collections.frequency(list, uniqueValue));
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) { // for values which are repeating more than 1
				System.out.println(entry.getKey() + " occures " + entry.getValue() + " times");
			}
		}
	}

	//3. WAP take any string and display words in reverse order
	static void program3() {
		String str = "Java Concept Of The Day";
		String[] words = str.split(" ");
		String rev = "";
//		for (int i = 0; i < words.length; i++) {
//			rev = words[i] + " " + rev;
//		}
		for (int i = words.length - 1; i >= 0; i--) {
			rev = rev + words[i] + " ";
		}
		System.out.println(rev);
	}

	// 4. WAP to take any string and display length of each reverse words.
	static void program4() {
		String str = "India is great country";
		StringBuilder sb = new StringBuilder("");
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			sb.append(ch);
		}
		System.out.println(sb);
		String rev = sb.toString();
		String[] words = rev.split(" ");
		for (String word : words) {
			System.out.println(word + " length = " + word.length());
		}
	}

	// 5. WAP to take any string and print largest word present in the string.
	static void program5() {
		String str = "India iss my beautiful country aaa";
		String[] words = str.split(" ");
		String largestWord = "";
		for (String word : words) {
			if (word.length() > largestWord.length()) {
				largestWord = word;
			}
		}
		System.out.println(largestWord);
	}

	// 6. WAP to an integer array and display number of occurences of each number.
	static void program6_way1() {
		int[] arr = { 7, 5, 9, 8, 5, 6, 7, 5, 4, 8 };
		// step1
		ArrayList<Integer> list = new ArrayList<>(); // first convert array into list
		for (int num : arr) { // adding in list
			list.add(num);
		}
		System.out.println(list);
		// step2
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list); // pass the list into set to remove duplicacy
		System.out.println(set);
		// step3
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for (Integer uniqueValue : set) {
			map.put(uniqueValue, Collections.frequency(list, uniqueValue));
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			// if (entry.getValue() > 1) { // for values which are repeating more than 1
			System.out.println(entry.getKey() + " occures " + entry.getValue() + " times");
			// }
		}

		sortingBasedOnValues(map);
	}

	private static void sortingBasedOnValues(LinkedHashMap<Integer, Integer> map) {
		// TODO Auto-generated method stub
		// step4
		ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet()); // converting map into list
		System.out.println(list);
		// step5
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue();
			}
		});
		System.out.println("after sorting");
		for (Map.Entry<Integer, Integer> entry : list) {
			if (entry.getValue() > 1) { // for values which are repeating more than 1
				System.out.println(entry.getKey() + " occures " + entry.getValue() + " times");
			}
		}

	}

	// 6. WAP to an integer array and display number of occurences of each number.
	static void program6_way2() {
		int[] arr = { 7, 5, 9, 8, 5, 6, 7, 5, 4, 8 };
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		System.out.println(map);
		for (Integer key : arr) {
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		System.out.println(map);
		System.out.println("before sorting");
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			// if (entry.getValue() > 1) { // for values which are repeating more than 1
			System.out.println(entry.getKey() + " occures " + entry.getValue() + " times");
			// }
		}
		sortingBasedOnValues(map);
	}

	// 7. WAP to take string and display the following result.
	static void program7() {
		String str = "aa bb cc aa bb cc bb aa bb";
		String[] words = str.split(" ");
		// step1
		ArrayList<String> list = new ArrayList<>(); // first convert array into list
		for (String word : words) { // adding in list
			list.add(word);
		}
		System.out.println(list);
		// step2
		LinkedHashSet<String> set = new LinkedHashSet<>(list); // pass the list into set to remove duplicacy
		System.out.println(set);
		// step3
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String uniqueValue : set) {
			map.put(uniqueValue, Collections.frequency(list, uniqueValue));
		}
		System.out.println(map);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " occures " + entry.getValue() + " times");
		}
	}

	// 8. WAP to take string and make it palindrome.
	static void program8() {
		String str = "raj";
		StringBuilder sb = new StringBuilder("");
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			sb.append(ch);
		}
		System.out.println(str + sb);
	}

}

//Programs based on String Handling:
//=======================================================
//
//1. WAP to take string and display the following result.
//
//Ex: 
//
//String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
//
//O/P:
//----
//
//"aaa" occured: 3 times in given string
//"ddddd" occured: 5 times in given string
//"gggggg" occured: 6 times in given string
//"jjjjjjj" occured: 7 times in given string
//"kk" occured: 2 times in given string
//"nnnn" occured: 4 times in given string
//{aa=3, bb=2, ccc=1, dddd=3}
//
//=============================================================================================================
//
//2. WAP take any String and display number of occurences of each character which is occring more than 1 times.
//
//Ex: 
//
//String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
//
//O/P:
//----
//
//g occured: 7 Times.
//a occured: 3 Times.
//d occured: 5 Times.
//j occured: 7 Times.
//k occured: 2 Times.
//n occured: 4 Times.
//
//==========================================================
//
//3. WAP take any string and display words in reverse order
//
//Ex:
//
//String string = "Java Concept Of The Day";
//
//O/P:
//----
//Day The Of Concept Java 
//
//===================================================================
//
//4. WAP to take any string and display length of each reverse words.
//
//Ex:
//String str = "India is great country";
//
//O/P
//---
//
//aidnI length = 5
//si length = 2
//taerg length = 5
//yrtnuoc length = 7
//
//=======================================================================
//
//5. WAP to take any string and print largest word present in the string.
//
//Ex:
//String str = "India iss my beautiful country aaa";
//
//O/P:
//beautiful
//
//===========================================================================
//
//6. WAP to an integer array and display number of occurences of each number.
//
//Ex: 
//
//int[] arr = {7,5,9,8,5,6,7,5,4,8};
//
//O/P:
//----
//
//7=2
//5=3
//9=1
//8=2
//6=1
//4=1
//
//or
//
//7 occured 2 times
//5 occured 3 times
//9 occured 1 times
//8 occured 2 times
//6 occured 1 times
//4 occured 1 times
//
//=======================================================
//
//7. WAP to take string and display the following result.
//
//Ex: 
//
//String str = "aa bb cc aa bb cc bb aa bb ";
//
//O/P:
//
//"aa" occurred: 3 times in given string
//
//"bb" occurred: 4 times in given string
//
//"cc" occurred: 2 times in given string
//
//=============================================
//
//8. WAP to take string and make it palindrome.
//
//Ex:  
//
//String str = raj
//
//O/P
//
//---
//
//rajjar
//
