package Jun2018;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.  */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
// */

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

public class Sample {
  public static void main(String args[] ) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCases = Integer.parseInt(br.readLine());

    BufferedOutputStream out = new BufferedOutputStream(System.out);

    for(int i = 0; i < testCases; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      int arraySize = Integer.parseInt(st.nextToken());
      int rotations = Integer.parseInt(st.nextToken());
      int[] array = new int[arraySize];
      StringTokenizer st2 = new StringTokenizer(br.readLine());
      for(int j = 0; j < arraySize; j++) {
        array[j] = Integer.parseInt(st2.nextToken());
        // System.out.println("array[" + j + "] = " + array[j]);
      }
      int[] rotatedArray = rotate(array, rotations);


      for(int j = 0; j < arraySize; j++) {
        // System.out.print(rotatedArray[j] + " ");

        out.write((rotatedArray[j] + " ").getBytes());
      }
      // System.out.println();
//      out.write("\n".getBytes());
      out.write(String.valueOf(123).getBytes());
      out.flush();

    }
    out.close();
  }

  public static int[] rotate(int[] array, int rotations) {
    int[] rotatedArray = new int[array.length];

    for(int i = 0; i < array.length; i++) {
      rotatedArray[(rotations+i) % array.length] = array[i];
    }
    return rotatedArray;
  }
}
