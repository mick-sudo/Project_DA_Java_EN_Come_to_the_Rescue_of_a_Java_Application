package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
		String line = reader.readLine();
		Map<String, Integer> symptoms = new TreeMap<>();

		while (line != null) {
			if (symptoms.containsKey(line)) { // si map contient mot
				symptoms.put(line, symptoms.get(line) + 1); // ajouter 1 � la valeur qui �t� associ�e � mot
			} else {
				symptoms.put(line, 1); // associer 1 � mot
			}
			line = reader.readLine(); // get another symptom
		}
		PrintWriter writer = new PrintWriter("result.out");
		for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
			String cl� = entry.getKey();
			int valeur = entry.getValue();
			System.out.println(cl� + "= " + valeur);
			writer.println(cl� + ": " + valeur);
		}
		writer.close();
		reader.close();
	}
}
