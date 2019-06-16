package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		if(eggs.contains("cracked")) {
			return eggs.indexOf("cracked");
		}
		else {
			return -1;
		}
	}
	
	public static int countPearls(List<Boolean> oysters) {
		return -1;
	}
}
