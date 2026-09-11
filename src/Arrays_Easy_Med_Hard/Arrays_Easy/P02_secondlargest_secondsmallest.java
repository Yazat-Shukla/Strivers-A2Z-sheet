import java.util.*;
public class P02_secondlargest_secondsmallest {
    public static void main(String[] args){
        int[] arr = {5, 5, 7};
        int[] result = solut(arr);
        int res1 = result[0];
        int res2 = result[1];
        System.out.println(res1 + " the second maximum");
        System.out.println(res2 + " the second minimum");

    }
    static int[] solut(int[] arr){
        int max = arr[0];
        int min = arr[0];
        if (arr.length==1){
            return new int[] {-1,-1};
        }
        for (int i =1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            } else if (arr[i]<min){
                min = arr[i];
            }
        }
        int sec_max = arr[0];
        int sec_min = arr[0];
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>sec_max && arr[i]<max){
                sec_max=arr[i];
            } else if (arr[i]<sec_min && arr[i]>min){
                sec_min=arr[i];
            }
        }
        return new int[] {sec_max,sec_min};
    }
}
