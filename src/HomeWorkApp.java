// Задание 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
// Задание 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
// Задание 3
        public static void checkSumSign () {
            int a = 15, b = 30;
            a = a + b;
            if (a >= 0) {
                System.out.println("Sum is positive");

            }
        }
// Задание 4
    public static void printColor () {
           int value = 101;
                 if (value < 0 ){
                     System.out.println("Red");
                         }
                      if(value >= 0 && value <= 100 ) {
                              System.out.println("Yellow");
                              }
                          if (value >= 100 ){
                              System.out.println("Green");
                               }
                          }
// Задание 5
    public static void compareNumbers(){
        int a = 6, b = 5;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b){
            System.out.println("a < b");
        }


    }
    }




