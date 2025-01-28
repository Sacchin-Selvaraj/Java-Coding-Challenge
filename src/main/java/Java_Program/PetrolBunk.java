package Java_Program;

public class PetrolBunk {


    public static void main(String[] args) {
        int petrol=2;
        String[] petrolBunk={"A","B","C"};
        int[] distance={1,5,3};
        int[] eachPetrolBunk={6,4,2};
        for (int i = 0; i < petrolBunk.length; i++) {
            petrol=eachPetrolBunk[i]+(petrol-distance[i]);

        }
        System.out.println(petrol);
    }
}
