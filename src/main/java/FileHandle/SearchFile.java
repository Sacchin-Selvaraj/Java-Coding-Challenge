package FileHandle;

import java.io.File;

public class SearchFile {

    public static void main(String[] args) {
        File root = new File("E:\\Java");
        searchFile(root,"BooleanPratice.java");
    }

    private static void searchFile(File root, String target) {

        if(root==null || !root.exists()) return;

        File[] files = root.listFiles();

        if (files==null) return;

        for (File file:files){
            if (file.isDirectory()){
                searchFile(file,target);
            }else {
                if (file.getName().equals(target)){
                    System.out.println("Found "+target+" at :"+file.getAbsolutePath());
                }
            }
        }
    }
}
