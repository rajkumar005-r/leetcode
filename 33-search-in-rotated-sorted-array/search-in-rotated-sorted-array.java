class Solution {
     int search(int[] nums, int target) {
        int pivot=findpivot(nums);
        if(pivot==-1)
        {
          return binary(nums,target,0,nums.length-1);
        }
        if(nums[pivot]==target)
        {
            return pivot;
        }
        if(target>=nums[0])
        {
            return binary(nums,target,0,pivot-1);
        }
        return binary(nums,target,pivot+1,nums.length-1);
     }
            int binary(int arr[],int target,int st,int end)
            {
                while(st<=end)
                {
                    int mid=st+(end-st)/2;
                    if(target<arr[mid])
                    {
                        end=mid-1;
                    }
                    else if(target>arr[mid])
                    {
                        st=mid+1;
                    }
                    else
                    {
                        return mid;
                    }
                }
                return -1;
    }
    int findpivot(int nums[])
    {
        int st=0;
        int end=nums.length-1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(mid <end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid > st && nums[mid]<nums[mid-1])
            {
                 return mid-1;
            }
            if(nums[mid]<=nums[st])
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        return -1;
    }
}