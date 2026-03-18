import java.util.Arrays;
class MergeSort{
    public static int []sort(int []arr){
        if(arr.length <= 1) return arr;

        int mid = arr.length/2;

        int []left = Arrays.copyOfRange(arr, 0,mid);
        int []right = Arrays.copyOfRange(arr,mid, arr.length);

        return merge(sort(left),sort(right));
    }

    public static int[] merge(int left[] ,int right[]){
        int [] result = new int[left.length + right.length];
        int i = 0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                result[k]= left[i++];
            }else{
                result[k] = right[j++];
            }
            k++;
        }

        while(i<left.length) result[k++] = left[i++];
        while(j<right.length) result[k++] = right[j++];

        return result;


    }
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,8,-4,4,1};

        int[] result = sort(arr);

        for(int num: result){
            System.out.print(num +" ");
        }


    }
}
