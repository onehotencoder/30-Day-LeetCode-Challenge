import java.util.HashSet;
import java.util.Set;

class Day2HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        while(n!=1){
            int sum = 0;
            while(n>0){
                int rem = n%10;
                sum = sum + rem*rem;
                n = n/10;
            }
            if(set.contains(sum))
                return false;
            else{
                n = sum;
                set.add(n);
            }
        }
        return true;
 
    }
}