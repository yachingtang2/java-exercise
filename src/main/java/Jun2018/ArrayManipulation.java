package Jun2018;

public class ArrayManipulation {

//  public long manipulate(int n, int[][] queries) {
//    int[] array = new int[n];
//    long max = 0;
//
//    for(int i = 0; i < queries.length; i++) {
//      for(int j = queries[i][0]-1; j < queries[i][1]; j++) {
//        array[j] += queries[i][queries[i].length-1];
//
//        if(array[j] > max) {
//          max = array[j];
//        }
//      }
//    }
//
//    return max;
//  }

  public long manipulate(int n, int[][] queries) {
    long[] arr = new long[n];

    for(int i=0;i<queries.length;i++){
//      System.out.print("i = " + i + ", " + queries[i][0] + ", ");
      arr[queries[i][0] - 1] += queries[i][2];

      if (queries[i][1] < n) {
        arr[queries[i][1]] -= queries[i][2];
      }
//      System.out.println(queries.length + ", " + i + ", " + arr[queries[i][0] - 1] + ", " + arr[queries[i][1]]);
    }

    long max=0;
    long temp=0;

    for(int i=0;i<n;i++) {
      System.out.print(arr[i] + ", ");
      temp += arr[i];
      if(temp > max) {
        max = temp;
      }
    }

    return max;
  }
}
