package Practice;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] array ){
        int l = array.length;
        for (int i=0; i<array.length; i++){
            int j = ++i;
            if(array[i]==array[j]){
                array [j]=array[array.length-1];
                l--;
            }
        }
        return l;
    }
}

