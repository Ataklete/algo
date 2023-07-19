import java.util.*;
import java.util.stream.Collectors;

public class NthLargestSalary {

  public static void nthLargest(Map<String, Integer> map, int sum){
      //logic
      System.out.println(map.entrySet().stream()
              .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
              .entrySet()
              .stream()
              .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
              .collect(Collectors.toList()).get(sum-1));
  }


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ati", 1200);
        map.put("haile", 1300);
        map.put("teffer", 1400);
        map.put("ati", 1200);
        map.put("haile", 1300);
        map.put("teffera", 1500);
        map.put("tom", 1000);
        map.put("king", 1500);
        map.put("eleni", 900);

        nthLargest(map, 2);
    }
}
