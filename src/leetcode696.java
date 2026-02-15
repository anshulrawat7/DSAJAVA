public class leetcode696 {

        public int countBinarySubstrings(String s) {
            int prevCount = 0;   // length of previous group
            int currCount = 1;   // length of current group
            int result = 0;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currCount++;
                } else {
                    result += Math.min(prevCount, currCount);
                    prevCount = currCount;
                    currCount = 1;
                }
            }

            // Add the last pair
            result += Math.min(prevCount, currCount);

            return result;
        }
    }


