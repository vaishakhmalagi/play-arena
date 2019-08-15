package com.oaknorth;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
/*Find max soldiers you can save
 *   Input 2 12 4 5
      Result 19*/
public class Program2 {

	public static void main(String[] args) throws IOException {

		String input;
		/*		InputStreamReader  isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		input = br.readLine();
		System.out.println(input);*/
		Scanner s = new Scanner(System.in);
		input = s.nextLine();
		System.out.println(input);

		List<Integer> result = Arrays.stream(input.split(" "))
				.map(Integer::valueOf).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(result);
		Integer f = Integer.valueOf(0);
		Integer m = Integer.valueOf(0);

		for(Integer i:result)
		{   
			if(!i.equals(m)) {
				f = f + i;
				m=i-1;
			}
		}
		System.out.println(f);
	}
}
