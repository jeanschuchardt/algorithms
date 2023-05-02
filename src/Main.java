import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        System.out.println("hi");
//        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        
//        int[] t = {3, 2, 4, 3};
//        int[] ints = missingRolls(t, 2, 4);
//        System.out.println(ints);
//
//        int[] t  = {1,5,6};
//        int[] ints = missingRolls(t, 4, 3);
//        System.out.println(ints);
    
//        int[] t = {1,2,3,4};
//        int[] ints = missingRolls(t, 4, 6);
//        System.out.println(ints);
        FizzBuzz.fizzBuzz(15);
    }
    
    public static int[] missingRolls(int[] A, int F, int M) {
        
        final int targetSum = (A.length + F) * M;
        int[] ans = new int[F];
        
        int missingSum = targetSum - Arrays.stream(A).sum();
        
        if (missingSum > F * 6 || missingSum < F) {
            return new int[]{0};
        }
        
        Arrays.fill(ans, missingSum / F);
        missingSum %= F;
        for (int i = 0; i < missingSum; ++i)
            ++ans[i];
        
        return ans;
    }
    
    public String solution(String s) {
        char c = s.charAt(0);
        if (Character.isUpperCase(c)) {  // please fix condition
            return "upper";
        } else if (Character.isLowerCase(c)) {  // please fix condition
            return "lower";
        } else if (Character.isDigit(c)) {  // please fix condition
            return "digit";
        } else {
            return "other";
        }
    }
    
    
}