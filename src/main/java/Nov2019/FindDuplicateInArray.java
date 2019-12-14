package Nov2019;

import java.util.*;

class FindDuplicateInArray {
  Set<Integer> find(int[] array) {
    Map<Integer, Integer> integerMap = new LinkedHashMap<>();
    Set<Integer> duplicates = new LinkedHashSet<>();

    for(int number : array) {
      int count = integerMap.get(number) == null ? 0 : integerMap.get(number);
      if(count == 0 ) {
        integerMap.put(number, ++count);
      } else {
        duplicates.add(number);
      }
    }

    return duplicates;


















//    var duplicates = new ArrayList<Integer>();
//    var integerMap = new HashMap<Integer, Integer>();
//
//    System.out.println("YCT - set 1 = " + integerMap);
//
//    for (int number : array) {
//      var occurrence = integerMap.get(number);
//      if(occurrence == null) {
//        integerMap.put(number, 1);
//      } else {
//        integerMap.put(number, ++occurrence);
//      }
//    }
//
//    for(int key : integerMap.keySet()) {
//      if(integerMap.get(key) > 1) {
//        duplicates.add(key);
//      }
//    }
//    System.out.println("YCT - set 2 = " + integerMap);
//    System.out.println("YCT - value = " + integerMap.entrySet());
//
//    return duplicates;











//    var numbers = Arrays.stream(array)
//        .boxed().sorted().collect(Collectors.toList());
//    var duplicates = new ArrayList<Integer>();
//
//    System.out.println("YCT - numbers = " + numbers);
//
//    for (int i = 1; i < numbers.size(); i++) {
//      if (numbers.get(i - 1).intValue() == numbers.get(i).intValue()) {
//        int currentNumber = numbers.get(i);
//
//        boolean match = duplicates.stream()
//            .anyMatch(number -> number == currentNumber);
//
//        if (!match) {
//          duplicates.add(numbers.get(i));
//        }
//        i++;
//      }
//    }
//
//    System.out.println("YCT - duplicates = " + duplicates);
//
//    return duplicates;
  }
}
