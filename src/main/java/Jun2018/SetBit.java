package Jun2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SetBit {
//  public int count(int number) {
//    int numberToTest = number;
//    int count = 0;
//
//    while(numberToTest != 0) {
//      numberToTest = numberToTest & (numberToTest - 1);
//      count++;
//    }
//    return count;
//  }

  public static void main(String args[] ) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String testCasesInString = br.readLine();
    int testCases = Integer.valueOf(testCasesInString);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for(int i = 0; i < testCases; i++)
    {
      String numberInString = br.readLine();
      int number = Integer.valueOf(numberInString);
      int count = 0;

      while(number != 0) {
        number = number & (number - 1);
        count++;
      }

      bw.write(count + "\n");
    }

    bw.flush();
  }
}
