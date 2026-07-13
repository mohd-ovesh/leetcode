import java.util.HashMap;
import java.util.Scanner;


public class ContainsDuplicate_P217{

    public static void main(String[] args){
        int[] nums = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i< 5; i++){
            System.out.println("Enter " + i+1 + " th  number");
            nums[i] = scan.nextInt();
        }
       
      System.out.println( containsDuplicate(nums));
    }

   public static  boolean containsDuplicate(int [] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0 ; i< nums.length; i++){
            if(!map.containsKey(Integer.valueOf(nums[i]))){
                map.put(Integer.valueOf(nums[i]) , Integer.valueOf(1));
            }
            else{
                return true;
            };
        }

        return false;
   }

}
