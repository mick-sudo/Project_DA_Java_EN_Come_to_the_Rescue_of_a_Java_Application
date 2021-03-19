package com.hemebiotech.analytics.write;

import java.io.FileNotFoundException;
import java.util.Map;

public interface ISymptomWriter {

	void PrintSymptomsToFile(Map<String, Integer> symptoms) throws FileNotFoundException;	
}
