class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        
        backtrack(candidates,target,new ArrayList<>(),0,result);
        return result;
    }
    public void backtrack(int []candidates,int target,List<Integer> current,int index,List<List<Integer>> result
    ){
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0 || index>=candidates.length){
            return;
        }

        current.add(candidates[index]);
        backtrack(candidates,target - candidates[index],current,index,result);
        current.remove(current.size()-1);
        
        backtrack(candidates,target,current,index+1,result);
    }
}