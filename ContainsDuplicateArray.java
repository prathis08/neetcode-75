import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ContainsDuplicateArray {
    static boolean containsDuplicate(List<Integer> nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer num : nums){
            if (set.contains(num)) {
                return true;
            } else set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(List.of(1,3,3,4)));
    }
}