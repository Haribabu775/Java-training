import java.util.HashSet;

public class Problem {

	public static void main(String[] args) {
		
		int[] nums = {1};
		
		int n = nums.length;
		
		boolean isthere = false;

		for(int i=1;i<=Integer.MAX_VALUE;i++) {
			
			for(int j=0;j<nums.length;j++) {
				
			
				if(nums[j] == i) {
					isthere = true;
					break;
				}
				else {
					isthere = false;
				}
			}
			if(isthere == false) {
				System.out.println(i);
				break;
			}

		}}
		
}