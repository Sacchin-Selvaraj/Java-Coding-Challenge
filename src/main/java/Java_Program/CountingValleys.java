package Java_Program;

public class CountingValleys {

    public static void main(String[] args) {
        String str="UDDDUDUU";
        int res=0,count=0;
        for (int i = 0; i < str.length(); i++) {
            if(i!=0&&(res==0&&str.charAt(i-1)=='U')){
                count++;
            }else if(str.charAt(i)=='D'){
                res--;
            }else {
                res++;
            }
        }
        System.out.println(count);
    }
}
