package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.countAndSort.CountAndSortDataFromFile;
import com.hemebiotech.analytics.countAndSort.ICountAndSort;
import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.write.WriteSymptomsDataToFile;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> allSymptoms = reader.GetSymptoms();

		ICountAndSort counter = new CountAndSortDataFromFile();
		Map<String, Integer> symptoms = counter.CountAndSortSymptoms(allSymptoms);

		WriteSymptomsDataToFile printer = new WriteSymptomsDataToFile("result.out");
		printer.PrintSymptomsToFile(symptoms);

	}
}
