public class task10 {
  
  public static void main(String args[]) {String[] numbers = {"one", "two"};       
    String[] numeric = {"three", "two"};
    String[] digits = {"one", "two"};
    
    result = Arrays.equals(numbers, numeric);
    System.out.printf("Comparing two String arrays %s and %s, are they Equal? %s %n ",
                      Arrays.toString(numbers), Arrays.toString(numeric), result);
    
    result = Arrays.equals(numbers, digits);
    System.out.printf("Comparing two unequal String arrays %s and %s, are they same? %s %n",
                  Arrays.toString(numbers), Arrays.toString(digits), result);
    
  }
}
    
    
    // to be honest, bujhi nai, sorry :( I still dont understand how this works. 