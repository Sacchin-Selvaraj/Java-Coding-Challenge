package Contest;

public class GenerateTagForVideo {

    public static String generateTag(String caption) {
        StringBuilder st=new StringBuilder();
        st.append("#");
        caption=caption.trim();
        char[] ch=caption.toCharArray();
        int i=0;
       while (st.length()<100 && i<caption.length()){
            if (i==0){
                if (ch[i]<97){
                    st.append(Character.toLowerCase(ch[i]));
                }else {
                    st.append(ch[i]);
                }
            } else if (Character.isAlphabetic(ch[i])) {
                st.append(Character.toLowerCase(ch[i]));
            } else if (ch[i]==' ') {
                while (ch[i]==' '){
                    i++;
                }
                st.append(Character.toUpperCase(ch[i]));
            }else {
                continue;
            }
            i++;
        }
        return st.toString();
    }

    public static void main(String[] args) {
        String caption="Rise over mind grows forest path open brightly future softly high whispers ignites friend surface fast things bright plays music truth bird sun ";
        System.out.println(generateTag(caption));
    }
}
