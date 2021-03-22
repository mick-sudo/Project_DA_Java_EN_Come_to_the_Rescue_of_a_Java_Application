package com.hemebiotech.analytics.countAndSort;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountAndSortDataFromFile implements ICountAndSort {
	@Override
	public Map<String, Integer> countAndSortSymptoms(List<String> listSymptoms) {
		
		Map<String, Integer> symptoms = new TreeMap<>();
		
		for (String symptom : listSymptoms) {
			if (symptoms.containsKey(symptom)) { // si map contient mot
				symptoms.put(symptom, symptoms.get(symptom) + 1); // ajouter 1 à la valeur qui été associée à mot
			} else {
				symptoms.put(symptom, 1); // associer 1 à mot
			}
		}
		return symptoms;
	}
}
