import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsString {
    class MySlowSolution {
        public List<Integer> findAnagrams(String s, String p) {
            int window = p.length();
            List<Integer> answer = new ArrayList<Integer>();

            // sliding window
            for (int i = 0; i <= s.length() - window; i++) {
                if (isAnagram(s.substring(i, window + i), p)) {
                    answer.add(i);
                }
            }

            return answer;
        }

        private boolean isAnagram(String a, String b) {
            // a and b are equal lengths

            // convert to chars
            char[] aChars = a.toCharArray();
            char[] bChars = b.toCharArray();

            // sort
            Arrays.sort(aChars);
            Arrays.sort(bChars);

            // compare :DDD HAHAHHA SO SIMPLE
            return Arrays.equals(aChars, bChars);
        }

    }


    class FasterSolution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> list = new ArrayList<>();
            if(s.length() < p.length()) {
                return list;
            }


            // we will compare the frequency of the characters in the strings
            int[] freqS = new int[26];
            int[] freqP = new int[26];


            // using a sliding window we begin by populating only the first window
            for(int i=0; i<p.length(); i++) {
                freqS[s.charAt(i)-'a']++;
                freqP[p.charAt(i)-'a']++;
            }

            if(Arrays.equals(freqS, freqP)) {
                list.add(0);
            }

            int start = 0;
            int end = p.length();


            // sliding window :DDDDDDDD yessss
            while(end < s.length()) {

                // this moves the window
                freqS[s.charAt(start)-'a']--;
                freqS[s.charAt(end)-'a']++;


                if(Arrays.equals(freqS, freqP)) {
                    list.add(start+1);
                }
                end++;
                start++;
            }
            return list;
        }
    }
}
