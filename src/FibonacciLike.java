public class FibonacciLike implements FibonacciFace {
       int NumbersInSequence;
       int number1;
       int number2;


       public FibonacciLike(int numbersInSequence, int number1, int number2) {
              NumbersInSequence = numbersInSequence;
              this.number1 = number1;
              this.number2 = number2;
       }



       public void run() {
              // (5, 3, 7)
              // 3, 7, 10, 17, 27
              System.out.println(number1);
              System.out.println(number2);
              int nextNumber = number1 + number2;
              System.out.println(number1 + number2);
              for (int i = 3 ; i < NumbersInSequence; i = i + 1) {

                     nextNumber = number2 + nextNumber;
                     number1 = number2;
                     number2 = nextNumber ;
                     System.out.println(nextNumber);
              }
       }
}
