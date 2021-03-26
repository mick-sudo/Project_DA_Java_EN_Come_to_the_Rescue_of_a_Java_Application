package com.hemebiotech.analytics;

import java.io.IOException;

import com.hemebiotech.analytics.countAndSort.CountAndSortDataFromFile;
import com.hemebiotech.analytics.countAndSort.ICountAndSort;
import com.hemebiotech.analytics.read.ISymptomReader;
import com.hemebiotech.analytics.read.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.write.ISymptomWriter;
import com.hemebiotech.analytics.write.WriteSymptomsDataToFile;

public class Main {


	public static void main(String[] args) throws IOException {
		
		ISymptomWriter writer = new WriteSymptomsDataToFile("result.out");
		ICountAndSort counter = new CountAndSortDataFromFile();
		ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(reader, writer, counter);
		analyticsCounter.execute();
	}
}
