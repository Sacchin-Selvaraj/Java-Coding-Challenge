package Arrays;

import java.util.Arrays;

public class StackImplementation {
    int[] nums;
    int i=-1;
    public StackImplementation(int n) {
        nums=new int[n];
    }
    public void push(int num){
        if (i<nums.length-1){
            i++;
            nums[i]=num;
        }else
            System.out.println("Maximum Size Reached");
    }
    public int pop(){
        int temp=0;
        if (i>=0){
            temp = nums[i];
            nums[i]=0;
            i--;
        }else
            System.out.println("There is no element to Pop");

        return temp;
    }
    public int peek(){
        if (i<0) {
            System.out.println("No Elements in the Stack");
            return -1;
        }
        else
            return nums[i];
    }
    public void display(){
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        StackImplementation st=new StackImplementation(4);
        st.peek();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(5);
        st.push(6);


    }
}
