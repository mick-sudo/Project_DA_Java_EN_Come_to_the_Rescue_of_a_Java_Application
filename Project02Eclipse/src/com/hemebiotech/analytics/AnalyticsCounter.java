package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.countAndSort.ICountAndSort;
import com.hemebiotech.analytics.read.ISymptomReader;
import com.hemebiotech.analytics.write.ISymptomWriter;

public class AnalyticsCounter {
	private ISymptomReader reader;
	private ISymptomWriter writer;
	private ICountAndSort counter;

	public AnalyticsCounter(ISymptomReader reader, ISymptomWriter writer, ICountAndSort counter) {
		super();
		this.reader = reader;
		this.writer = writer;
		this.counter = counter;
	}

	public void execute() throws IOException {
		List<String> allSymptoms = reader.getSymptoms();
		Map<String, Integer> symptoms = counter.countAndSortSymptoms(allSymptoms);
		writer.printSymptomsToFile(symptoms);

	}

}
