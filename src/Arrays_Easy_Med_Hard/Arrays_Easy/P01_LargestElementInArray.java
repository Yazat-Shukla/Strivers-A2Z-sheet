public class P01_LargestElementInArray {
    public static void main(String[] args){
        int[] arr = {2,5,762,3,4,782,6};
        int c = max(arr);
        System.out.println(c);
    }
    static int max(int[] arr){
        int max =  arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
