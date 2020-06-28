package br.com.codenation;

import java.util.*;

public class StatisticUtil {

	public static int average(int[] elements) {
		int totalSum = 0;
		int numberOfElements = 0;
		for (int element : elements) {
			totalSum += element;
			numberOfElements++;
		}
		return totalSum/numberOfElements;
	}

	public static int mode(int[] elements) {
		Map<Integer, Integer> repository = new HashMap<Integer, Integer>();
		List<Integer> accountedNumbers = new ArrayList<>();
		Integer modeNumber = 0;
		Integer numberOccurrences = 0;
		for(Integer number : elements){
			if (accountedNumbers.contains(number)){
				repository.put(number, repository.get(number)+1);
			} else {
				repository.put(number, 1);
				accountedNumbers.add(number);
			}
		}
		for (int key : repository.keySet()){
			if (repository.get(key) > numberOccurrences){
				numberOccurrences = repository.get(key);
				modeNumber = key;
			}
		}
		return modeNumber;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);
		int halfSizeVector = elements.length/2;
		if (elements.length % 2 == 0){
			return (elements[halfSizeVector-1]+elements[halfSizeVector])/2;
		} else {
			return elements[halfSizeVector];
		}
	}
}