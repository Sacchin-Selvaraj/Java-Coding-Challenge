import java.util.Arrays;

public class ReverseStringByWords {
    public static void main(String[] args) {
        String str="Hello  World By Sacchin ";

        char[] ch=str.toCharArray();
        boolean flag=false;
        int left=0;
        int right=0;
        while(right<str.length()){
            if(ch[right]==' '){
                flag=true;
                int tempright=right;
                right--;
                while(left<right){
                    char temp=ch[left];
                    ch[left]=ch[right];
                    ch[right]=temp;
                    left++;
                    right--;
                }
                left=tempright;
                while(left<str.length() && ch[left]==' '){
                    left++;
                }
            }
            if(!flag){
                right++;
            }else{
                flag=false;
                right=left;
            }
        }

        System.out.println(new String(ch));

        String[] splitWords = str.split(" ");
        System.out.println(Arrays.toString(splitWords));

        StringBuilder stringBuilder = new StringBuilder();
        for (String word:splitWords){
            int start=0;
            int end=word.length()-1;
            char[] charArray = word.toCharArray();
            while (start<end){
                char temp=charArray[start];
                charArray[start]=charArray[end];
                charArray[end]=temp;
                start++;
                end--;
            }
            stringBuilder.append(charArray);
            stringBuilder.append(' ');

        }

        System.out.println(stringBuilder.toString());
    }
}
