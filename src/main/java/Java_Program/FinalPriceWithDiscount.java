package Java_Program;

import java.util.Arrays;

public class FinalPriceWithDiscount {

    public int[] toGetDiscount(int[] price){

        for(int i=0;i<price.length-1;i++){
            for(int j=i+1;j<price.length;j++){
                if(price[j]<=price[i]) {
                    price[i] = price[i] - price[j];
                    break;
                }

            }
        }
        return price;
    }

    public static void main(String[] args) {
        int[] prices={10,1,1,6};
        FinalPriceWithDiscount obj=new FinalPriceWithDiscount();
        int[] price=obj.toGetDiscount(prices);
        System.out.println("Discounted Price :"+ Arrays.toString(price));
    }
}
