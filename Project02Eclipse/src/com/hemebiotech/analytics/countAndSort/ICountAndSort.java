package com.hemebiotech.analytics.countAndSort;

import java.util.List;
import java.util.Map;

public interface ICountAndSort {
	/**
	 * @return a Map listing of all Symptoms with count.
	 */
	Map<String, Integer> countAndSortSymptoms(List<String> listSymptoms);

}