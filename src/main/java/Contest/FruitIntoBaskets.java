package Contest;

public class FruitIntoBaskets {

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {

        int count=0;
        for (int i = 0; i < fruits.length; i++) {
            boolean flag=false;
            for (int j = 0; j < baskets.length; j++) {
                if (fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    flag=true;
                    break;
                }
            }
            if (!flag)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] a={4,2,5};
        int[] b={3,5,2};

        System.out.println(numOfUnplacedFruits(a,b));

    }
}
