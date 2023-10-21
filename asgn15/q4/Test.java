package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test {

	public static void main(String[] args) {
		try (FileReader fr = new FileReader("/home/sudhanshu/Documents/Day15/workspace-sts-3.9.18.RELEASE/Assignment15_Day15_Q3/some.txt")) {
			try (BufferedReader br = new BufferedReader(fr)) {
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}
		} catch (Exception e) {

		}

	}

}
