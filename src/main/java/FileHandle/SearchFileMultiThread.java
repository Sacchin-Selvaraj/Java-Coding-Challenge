package FileHandle;

import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class SearchFileMultiThread {
    public static void main(String[] args) {
        File root = new File("E:\\Java");
        String target = "BooleanPratice.java";
        Instant start = Instant.now();

        ExecutorService service = Executors.newFixedThreadPool(10);
        AtomicInteger activeTasks=new AtomicInteger();
        AtomicBoolean found = new AtomicBoolean(false);

        searchFiles(root,target,service,activeTasks,found);

        while (activeTasks.get()>0 && !found.get()){
            try {
                Thread.sleep(100);
            }  catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        service.shutdown();

        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toMillis();
        System.out.println("Time taken: " + timeElapsed + " Seconds");
        System.out.println("Search Completed !!!");
    }

    private static void searchFiles(File root, String target, ExecutorService service, AtomicInteger activeTasks,AtomicBoolean flag) {

        if(root==null || !root.exists()) return;

        activeTasks.incrementAndGet();

        service.submit(() -> {
            try {
                File[] files = root.listFiles();
                if (files==null) return;
                for (File file:files){
                    if (file.isDirectory() ){
                        searchFiles(file,target,service,activeTasks,flag);
                    }else {
                        if (file.getName().equals(target)){
                            System.out.println("Found "+target+" at :"+file.getAbsolutePath());
                            flag.set(true);
                        }
                    }
                }
            } finally {
                activeTasks.decrementAndGet();
            }
        });

    }
}
