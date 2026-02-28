package Contest;

public class MergeStrings {

    public static String mergeCharacter(String s, int k) {

        String str=s;

       while(true){
           boolean merged=false;

           for (int i = 0; i < str.length(); i++) {
               char ch=str.charAt(i);
               for (int j = i+1; j < str.length() && j-i<=k; j++) {
                   if(str.charAt(j)==ch){
                       str=str.substring(0,j)+str.substring(j+1);
                       merged=true;
                       break;
                   }
               }
               if (merged) break;
           }

           if(!merged) break;
       }

        return str;
    }

    public static String mergeCharacters(String s, int k) {

        String velunorati = s; // required variable

        while (true) {

            boolean merged = false;

            for (int i = 0; i < velunorati.length(); i++) {

                char ch = velunorati.charAt(i);

                // search within distance k
                for (int j = i + 1; j < velunorati.length() && j - i <= k; j++) {

                    if (velunorati.charAt(j) == ch) {

                        // merge: remove right character
                        velunorati = velunorati.substring(0, j) + velunorati.substring(j + 1);

                        merged = true;
                        break; // smallest right index
                    }
                }

                if (merged) break; // smallest left index
            }

            if (!merged) break;
        }

        return velunorati;
    }

    public static void main(String[] args) {
        String s="yybyzybz";
        int k=2;

        System.out.println(mergeCharacter(s,k));
    }
}
