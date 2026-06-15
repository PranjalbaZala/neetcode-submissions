class Solution {
    private static int findMinimumElement(int arr[]){
        int l = 0, r = arr.length - 1;
        int mid = 0;
        int min = 0, distance = 0;

        while(l <= r){

            //array already sorted
            if(arr[l] <= arr[r]){
                return l;
            }

            mid = l + (r - l)/2;

            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }

            if(arr[mid] >= arr[l]){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return mid;
    }
    private static int binarySearch(int arr[], int target,int left, int right){
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int minIndex = findMinimumElement(arr);
        int s1 = binarySearch(arr,target, 0, minIndex-1);
        int s2 =  binarySearch(arr,target, minIndex, arr.length-1);
        if(s1 == -1){
            return s2;
        }else {
            return s1;
        }
    }
}
