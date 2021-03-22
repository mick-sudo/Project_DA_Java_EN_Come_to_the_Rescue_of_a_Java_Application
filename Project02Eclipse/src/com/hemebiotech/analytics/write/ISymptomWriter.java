package com.hemebiotech.analytics.write;

import java.io.FileNotFoundException;
import java.util.Map;

public interface ISymptomWriter {
	/**
	 * Write in result.out the list of symptoms obtain with a Map
	 */
	void printSymptomsToFile(Map<String, Integer> symptoms) throws FileNotFoundException;	
}
