package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

//		BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
//		String line = reader.readLine();
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> allSymptoms = new ArrayList<>();
		allSymptoms = reader.GetSymptoms();

		Map<String, Integer> symptoms = new TreeMap<>();

//		while (line != null) {
//			if (symptoms.containsKey(line)) { // si map contient mot
//				symptoms.put(line, symptoms.get(line) + 1); // ajouter 1 � la valeur qui �t� associ�e � mot
//			} else {
//				symptoms.put(line, 1); // associer 1 � mot
//			}
//			line = reader.readLine(); // get another symptom
//		}

		// on parcour le fichier en comp et tri symptoms

		for (String symptom : allSymptoms) {
			if (symptoms.containsKey(symptom)) { // si map contient mot
				symptoms.put(symptom, symptoms.get(symptom) + 1); // ajouter 1 � la valeur qui �t� associ�e � mot
			} else {
				symptoms.put(symptom, 1); // associer 1 � mot
			}
		}

		PrintWriter writer = new PrintWriter("result.out");
		for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
			String cl� = entry.getKey();
			int valeur = entry.getValue();
			System.out.println(cl� + "= " + valeur);
			writer.println(cl� + ": " + valeur);
		}
		writer.close();
	}
}
