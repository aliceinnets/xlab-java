package aliceinnets.xlab;

import java.util.ArrayList;
import java.util.Random;

public class Randompick {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> unsorted = new ArrayList<Integer>(), sorted = new ArrayList<Integer>();

		int[] keys_Array = new int[100];
		for(int count = 0; count < 1000; count++){
			int rand = random.nextInt(10000)+1;
			System.out.println(rand);
			unsorted.add(rand);
			sorted.add(rand);
		}
		System.out.print("\n\nSize: " + unsorted.size());
		System.out.print("\n");
		System.out.print("Contents:" + unsorted);

		for(int i=0;i<100;i++){
			keys_Array[i] = (Integer) unsorted.remove(random.nextInt(unsorted.size()));
		}
	}
}
