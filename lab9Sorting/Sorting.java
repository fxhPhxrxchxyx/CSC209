package lab9Sorting;

import java.util.LinkedList;
import java.util.Queue;

public class Sorting {
  public static void main(String[] args) {
    int[] data = {400,20,50,33,100,94,5,30,56,22};
    int[] data2 = {499,20,80411,74531,503,81503,8433,100,1294,5,430,256,222};
    printAll(data);
    mergeSort(data,0,data.length-1);
    printAll(data);
    printAll(data2);
    radixSort(data2);
    printAll(data2);
  }

  public static void mergeSort(int[] arr, int first , int last){
    if(first < last){
      int mid = (first+last)/2;
      mergeSort(arr, first, mid);
      mergeSort(arr, mid+1, last);
      merge(arr, first, last);
    }
  }
  public static void merge(int[] arr ,int first, int last ){
    int[] result = new int[(last-first)+1];
    int iResult = 0;
    int mid = (first+last)/2;
    int left = first;
    int right = mid+1;
    while(left <= mid && right <= last){
      if(arr[left] < arr[right]){
        result[iResult++] = arr[left++];
        // iResult++;
        // left++;
      }else{
        result[iResult++] = arr[right++];
      }
    }
    while(left <= mid){//if some member of left subarray have not been copied to the result
      result[iResult++] = arr[left++];
     }
     while(right <= last){ //if some member of right subarray have not been copied to the result
       result[iResult++] = arr[right++];
     }
     //copy all members in the result into the original data arry
     for (int i = 0; i < last-first+1; i++) {
       arr[first+i] = result[i];
       //last-first+1 is same result.length
     }
  }


  public static void radixSort(int[] arr){
    //big digit is 5 -> go to 5 pass
    int radix = 10;
    int digits = 5;
    Queue<Integer>[] pile = new Queue[10];
    for (int i = 0; i < pile.length; i++) {
      pile[i] = new LinkedList<>();
    }
    int factor=1; //pass
    for (int i = 0; i < digits; i++) {
      for (int j = 0; j < arr.length; j++) {
        int pileNumber = (arr[j]/factor)%10; //หารตามหลักเอาแต่เศษmod10
        pile[pileNumber].add(arr[j]); //enqueue into the pile quque
      }
      //dequeue from each pile and put them into the original arr data
      for (int k = 0,x=0; k < 10; k++) {
        while(!pile[k].isEmpty()){
          arr[x++] = pile[k].remove(); //dequeue
        }
      }
      factor *= radix; //เลื่อนหลักแตต่ละรอบของpassตามdigit
    }
  }

  public static void printAll(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] +" ");
    }
    System.out.println("");
  }
}
