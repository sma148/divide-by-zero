public class Main {

  public static void main(String[] args) {

   int[] array1 = new int[]{23, 5, 4};
   int[] array2 = new int[]{1, 0, 333};

   for (int n1 : array1) {
      for (int n2 : array2) {

try {
      System.out.println(n1 + " divived by " + n2 + " is " + (n1 / n2));
    System.out.println("this will not be printed because an exception is thrown");
} catch(ArithmeticException e){
    System.out.println("error division by zero");
}


        
            }
        }
    }
}