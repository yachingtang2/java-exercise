package Jun2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

//import for Scanner and other utility classes
import java.util.*;

class TestClass {
  public static void main(String args[] ) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int arraySize = Integer.parseInt(st.nextToken());
    int testCases = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine(), " ");
    long[] array = new long[arraySize];
    for(int i = 0; i < arraySize; i++) {
      if(i == 0) {
        array[i] = Integer.parseInt(st.nextToken());
      }
      else {
        array[i] = array[i-1] + Integer.parseInt(st.nextToken());
      }
    }
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for(int i = 0; i < testCases; i++) {
      st = new StringTokenizer(br.readLine(), " ");
      int fromIndex = Integer.parseInt(st.nextToken());
      int toIndex = Integer.parseInt(st.nextToken());
      long mean = calculateMean(array, fromIndex, toIndex);
      bw.write(mean + "\n");
    }
    bw.flush();
  }

  public static long calculateMean(long[] array, int fromIndex, int toIndex) {

    long sum = 0;
    if (fromIndex-1 > 0) {
      sum = array[toIndex-1] - array[fromIndex-1-1];
    }
    else {
      sum = array[toIndex-1];
    }

    return (long) Math.floor(sum/(toIndex-fromIndex+1));
  }
}
