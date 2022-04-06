class Solution {
    public int threeSumMulti(int[] arr, int target) {
        int MOD = 1_000_000_007;
        long ans =0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int T=target-arr[i];
            int l=i+1;
            int r=arr.length-1;
            while(l<r){
                // Typical two sum.
                if(arr[l]+arr[r]<T)
                    l++;
                else if(arr[l]+arr[r]>T)
                    r--;
                else if(arr[l]!=arr[r]){
                    // We have A[l]+A[r]==T
                    // Let' s count "left": the number of A[j]==A[j+1] == A[j+2] ==.....
                    // And Similarly for "right"
                    int left=1;
                    int right=1;
                    while(l+1<r && arr[l]==arr[l+1])
                    {
                        left++;
                        l++;
                    }
                    while(r-1>l && arr[r]==arr[r-1])
                    {
                        right++;
                        r--;
                    }
                    ans+=left*right;
                    ans%=MOD;
                    l++;
                    r--;
                }
                else{
                    //When Arr[l]==Arr[r]
                    //M= (r-l+1)
                    // we contributed M * (M-1) / 2 pairs
                    int m=(r-l+1);
                    ans+=m*(m-1)/2;
                    ans%=MOD;
                    break;
                }
            }
        }
        return (int) ans;
    }
    //Time Compexity - O(N)
    //Space Compexity - O(1)
}