subarray or substring se related hoga
* brut fore n^2
1] group of sub array eqaul to X value


Q] maximumSumSubarray
static int maximumSumSubarray(int k, ArrayList<Integer> arr,int N)
    {       
        int i=0,j=0;
        int sum=0;
        int max=-1;
        
  /*
  i=start,j=start; [imp]
  [10][20][30][40][50][60][70]
  i        j
  
  */
        while(j<N)// loop ki condition end  
        {
            sum+=arr.get(j);
            
            if(j-i+1<k)//window size
            {
                j++;
            }
            else if(j-i+1==k)
            {   
                max=Math.max(max,sum);
                sum-=arr.get(i);
                i++;
                j++;
            }
        }
        
        return max;
    }


public static void firstNegative(int arr[], int K, ArrayList<Integer> list){
		int i=0, j=0;
		while(j<arr.length){
			if(arr[j]<0){
				list.add(arr[j]);
			}
			
			if(j-i+1<K)
				j++;
			
			else{
				if(list.size()==0)
					System.out.print(0+" ");
				else{
				System.out.print(list.get(0)+" ");
				if(arr[i]==list.get(0)){
					list.remove(0);
				}
				}
				i++;
				j++;
			}
			
		}
	}
