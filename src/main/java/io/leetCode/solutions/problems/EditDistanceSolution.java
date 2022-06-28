package io.leetCode.solutions.problems;

import lombok.extern.slf4j.Slf4j;

/**
 * Given two strings word1 and word2, return the minimum number of
 * operations required to convert word1 to word2.
 * You have the following three operations permitted on a word:
 * Insert a character
 * Delete a character
 * Replace a character
 */
@Slf4j
public class EditDistanceSolution {
    public int minDistance(String word1, String word2) {
        int result = 0;
        StringBuilder resultString = new StringBuilder();
        int length = word2.length();
        log.info("Word2 length {}", length);
        for (int i = 0; i < length; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                log.info("{}", word2.charAt(i));
                resultString.append(word2.charAt(i));
                result++;
            }else if(word1.charAt(i) == word2.charAt(i)){
                resultString.append(word2.charAt(i));
                result++;
            }
            log.info("Result {}", resultString.length());
        }
        log.info("Resultant string {}", resultString);
        log.info("Resultant moves {}", result);
        return resultString.length();
    }
//    public insertACharacter()
}
