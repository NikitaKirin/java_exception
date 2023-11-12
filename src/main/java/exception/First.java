package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            playWithNullPointer();
        } catch (NullPointerException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Ура! Меня снова печают");
    }


    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
