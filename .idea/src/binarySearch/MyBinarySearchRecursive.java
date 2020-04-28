/*
* Created by Intellij IDEA
* User: Tavishi123-singh
 */
package binarySearch;

public class MyBinarySearchRecursive {
    private int[] arr;

    public MyBinarySearchRecursive(int[] arr) {
        this.arr = arr;
    }
    public boolean binarySearch(int searchElement, int low, int high){
        if(low>high){
            System.out.println("null");
            return false;
        }
        int mid=(low+high)/2;
        if(searchElement==arr[mid]){
            System.out.println("element found at index:"+" "+mid);
            return true;
        }
        else if(searchElement<arr[mid]){
            return binarySearch(searchElement,low,mid-1);
        }
        else{
            return binarySearch(searchElement,mid+1,high);
        }
    }
    public static void main(String[] args) {
        int[] sortedArray={10,20,30,40,50,60,60,70};
        int searchElement=20;
        int low=0;
        int high=sortedArray.length -1;
        MyBinarySearchRecursive obj=new MyBinarySearchRecursive(sortedArray);
        obj.binarySearch(searchElement,low,high);
    }
}
