package lab9Sorting;
public class QuickSort {
  public static void main(String[] args) {
    int[] data = {69,200,44,1000,3,256,400,500,24,55,222,8,10,111,123,1,205};
    printAll(data);
    quicksort(data, 0, data.length-1);
    printAll(data);
  }

  public static void quicksort(int[] a, int first, int last){
    if(first >= last){
      return; //anchor(baseCase): no more recursion
    }
    int pivot = first, lower = first+1, upper = last;
    while(lower <= upper){
      while(lower <= last && a[lower] < a[pivot]){
        //search for a big number that is bigger than pivot
        lower++;
      }
      while(upper > first && a[upper] >= a[pivot]){
        upper--;
        //search for a small number that is smaller than or equal pivot
      }
      if(lower < upper){//lower has not passed the upper
        //swap
        swap(a,lower,upper);
        lower++;
        upper--;
      }
    }
     //swap pivot with upper
        // int temp = a[pivot];
        // a[pivot] = a[upper];
        // a[upper] = temp;
        swap(a,pivot,upper);
        quicksort(a, first, upper-1);
        quicksort(a, upper+1, last);

       
  }

   public static void swap(int[] a , int lower ,int upper){
            int temp = a[lower];
            a[lower] = a[upper];
            a[upper] = temp;
        }

   public static void printAll(int[] a){
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]+" ");
    }
    System.out.println("");
  }
}
