package com.epam.mjc.collections.map;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class WordRepetitionMapCreator {

    private final String PUNCTUATION_MARKS_REGEX = " |\\, |\\.|\\. |\\? |\\?|\\! |\\!";

    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> repetitionMap = new HashMap<>();
        String[] words = sentence.split(PUNCTUATION_MARKS_REGEX);
        List<String> wordsLowerCase = Arrays.stream(words).map(word -> word.toLowerCase()).collect(Collectors.toList());
        Set<String> uniqueWordsLowerCase = new HashSet<>(wordsLowerCase);
        for (String word : uniqueWordsLowerCase) {
            int frequency = Collections.frequency(wordsLowerCase, word);
            repetitionMap.put(word, frequency);
        }
        return repetitionMap;
    }
}
