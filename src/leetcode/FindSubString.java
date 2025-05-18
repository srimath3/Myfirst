package leetcode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindSubString {

	public static void main(String[] args) {
		String[] wr = { "bar", "foo" };
		System.out.println(findSub("foobarthebarfoo", wr));

	}

	public static Set<Integer> findSub(String s, String[] words) {
		Set<Integer> indicesOfMatchedString = new HashSet<>();
		Map<String, Integer> wordAndCount = new HashMap<>();
		for (String word : words) {
			wordAndCount.merge(word, 1, Integer::sum);
		}

		int strLength = s.length();
		int numOfWords = words.length;
		int wordLength = words[0].length();

		for (int i = 0; i < wordLength; ++i) {
			Map<String, Integer> currentWordAndCount = new HashMap<>();
			int r = i, l = i;
			int totalCount = 0;

			while (r + wordLength <= strLength) {
				String wordFromString = s.substring(r, r + wordLength);
				System.out.println(wordFromString);
				System.out.println("---");
				r  +=wordLength;

				if (!wordAndCount.containsKey(wordFromString)) {
					currentWordAndCount.clear();
					l = r;
					totalCount = 0;
					continue;
				}
				currentWordAndCount.merge(wordFromString, 1, Integer::sum);
				++totalCount;
				
				while (currentWordAndCount.get(wordFromString) > wordAndCount.get(wordFromString)) {
                    String removed = s.substring(l, l + wordLength);
                    l += wordLength;
                    currentWordAndCount.merge(removed, -1, Integer::sum);
                    --totalCount;
                }
				if (totalCount == numOfWords) {
					System.out.println(l);
					indicesOfMatchedString.add(l);
				}
			}

			
		}

		// // If a word count exceeds its count in wordCount, reduce from left side
		// while (currentCount.get(sub) > wordCount.get(sub)) {
		// System.out.println("I am here");
		// String removed = s.substring(left, left + wordLength);
		// System.out.println(removed);
		// System.out.println("-**---");
		// left += wordLength;
		// currentCount.merge(removed, -1, Integer::sum);
		// --totalWords;
		// }

		return indicesOfMatchedString;

	}

}
