package com.hemebiotech.analytics.write;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;

public class WriteSymptomsDataToFile implements ISymptomWriter {
	private String filepath;

	public WriteSymptomsDataToFile(String filepath) {
		this.filepath = filepath;
	}

	public void PrintSymptomsToFile(Map<String, Integer> symptoms) throws FileNotFoundException {

		PrintWriter writer = new PrintWriter(filepath);

		for (Map.Entry<String, Integer> entry : symptoms.entrySet()) {
			String clé = entry.getKey();
			int valeur = entry.getValue();
			System.out.println(clé + "= " + valeur);
			writer.println(clé + ": " + valeur);
		}
		writer.close();
	}

}
