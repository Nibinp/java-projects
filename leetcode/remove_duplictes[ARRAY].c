int removeDuplicates(int* nums, int numsSize) {
   int i,index=0;
while(nums[i]!=nums[index])
    i++;
    for(i=i;i<numsSize;i++)

    {

        if(nums[i]==nums[index])

        {

            continue;

        }

        if(nums[i]!=nums[index])

        {

            index++;

            nums[index]=nums[i];

        }

    }
nums[index++]=nums[i-1];
return index;
}
