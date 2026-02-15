package Contest;

public class LongestSubStringPalindromic {

    private static int getPalidromeLen(String s, int l, int r, boolean skip) {
        if (l < 0 && r >= s.length()) return 0;
        // previous two characters were match, pointers moved l-1 and r+1, and only one edge went out of bound
        // can skip character at edge too. Truly an "edge" case!
        if (l < 0 || r >= s.length()) return skip ? 1 : 0; // think zabba , abax

        // for case i,i count 1 and for other cases count 2
        if (s.charAt(l) == s.charAt(r)) {
            int matchCount = (l == r) ? 1 : 2;
            return matchCount + getPalidromeLen(s, l - 1, r + 1, skip);
        }

        if (skip) {
            // count 1 skipped character and mark false to prevent future skips
            return 1 + Math.max(
                    getPalidromeLen(s, l - 1, r, false),
                    getPalidromeLen(s, l, r + 1, false)
            );
        }

        return 0;
    }

    public static int almostPalindromic(String s) {
        // instead of shrink think expand
        int res = 2;
        for(int i=0; i<s.length(); i++) {
            res = Math.max(res, getPalidromeLen(s, i, i, true));
            res = Math.max(res, getPalidromeLen(s, i, i+1, true));
        }
        return res;
    }

        public static void main(String[] args) {
            String s = "abca";
            System.out.println(almostPalindromic(s));
        }

}
