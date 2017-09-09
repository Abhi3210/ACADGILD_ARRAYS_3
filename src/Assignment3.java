
public class Assignment3 {
    static int binarySearch(int arr[],int l,int r,int x){
    	if(r>=l){
    		int mid=(l+r)/2;
    		if(arr[mid]==x)
    			return mid;
    		else if(arr[mid]>x)
    			return binarySearch(arr,l,mid-1,x);
    		else
    			return binarySearch(arr,mid+1,r,x);
    					}
    	return -1;
    }
    
    public static void main(String args[]){
    	int arr[]={1,2,3,4,5,6,7,8,9,10};
    	int x=11;
    	int result=binarySearch(arr,0,arr.length-1,x);
    	if(result==-1){
    		System.out.println("Specified element not found !!!");
    	}
    	else
    		System.out.println("Specified elemet is at "+result+"th place in the arrays");
    }
}
