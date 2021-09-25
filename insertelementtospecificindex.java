import java.util.Random;
import java.util.Arrays; 

class insertelementtospecificindex{

    public static void main(String[] args) {
        
    

    int[] numbers = {20, 30, 25, 35, -16, 60, -100};

    Random rand = new Random();      

    int Index = rand.nextInt(numbers.length); {

    int numbertobeinserted = rand.nextInt(100);

    

    System.out.println("Original Array : "+Arrays.toString(numbers));


    System.out.println("number to be inserted: "+numbertobeinserted+","+" Index the number is to be inserted: "+Index
    );

    for (int i = 0;i<numbers.length;i++){
        if (numbers[Index]==numbers[i]){
          numbers[i] = numbertobeinserted;      
          System.out.println("Original Array : "+Arrays.toString(numbers)); 
          }
        }
      }
    }
}
