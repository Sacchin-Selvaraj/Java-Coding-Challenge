package Contest;

public class VowelConsonantScore {
    public static int vowelConsonantScore(String s) {
        int vowel=0;
        int consonant=0;
        for (char ch: s.toCharArray()){
            if (Character.isAlphabetic(ch)){
                if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }else {
                    consonant++;
                }
            }
        }
        if (consonant>0){
            return Math.floorDiv(vowel,consonant);
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "cooear";
        System.out.println("Score : "+vowelConsonantScore(s));
    }
}
