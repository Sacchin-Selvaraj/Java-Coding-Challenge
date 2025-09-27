package Contest;

import java.util.HashSet;
import java.util.Set;

public class DistinctPointsReachable {

    public static int distinctPoints(String s, int k) {
//        if (s.length()==k)
//            return 1;
//        s=s.substring(k);
//        HashSet<int[]> set=new HashSet<>();
//        int[] point={0,0};
//        for (Character c:s.toCharArray()){
//            if (c=='U'){
//                point=new int[]{point[0],point[1]+1};
//                set.add(point);
//            } else if (c=='D') {
//                point=new int[]{point[0],point[1]-1};
//                set.add(point);
//            }else if (c=='L') {
//                point=new int[]{point[0]-1,point[1]};
//                set.add(point);
//            }else if (c=='R') {
//                point=new int[]{point[0]+1,point[1]+1};
//                set.add(point);
//            }
//        }
//        return set.size();

        int n = s.length();

        // Prefix displacements: prefix[i] = position after first i moves
        int[][] prefix = new int[n + 1][2];
        prefix[0] = new int[]{0, 0};

        // Compute prefix displacements
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i].clone();
            switch (s.charAt(i)) {
                case 'U': prefix[i + 1][1]++; break;
                case 'D': prefix[i + 1][1]--; break;
                case 'R': prefix[i + 1][0]++; break;
                case 'L': prefix[i + 1][0]--; break;
            }
        }

        // Total displacement of entire string
        int[] total = prefix[n];

        // Store distinct final coordinates
        Set<String> finalCoords = new HashSet<>();

        // Try removing each contiguous substring of length k
        for (int i = 0; i <= n - k; i++) {
            // Effect of removed substring = prefix[i+k] - prefix[i]
            int[] removedEffect = new int[]{
                    prefix[i + k][0] - prefix[i][0],
                    prefix[i + k][1] - prefix[i][1]
            };

            // Final position = total - removedEffect
            int finalX = total[0] - removedEffect[0];
            int finalY = total[1] - removedEffect[1];

            finalCoords.add(finalX + "," + finalY);
        }

        return finalCoords.size();
    }

    public static void main(String[] args) {
        String s="UD";
        int k=1;
        System.out.println(distinctPoints(s,k));
    }
}
