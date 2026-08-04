class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);

        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
        }

        for(int num:nums){
            min=Math.min(min,num);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}