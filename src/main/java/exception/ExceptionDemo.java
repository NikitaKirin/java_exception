package exception;

public class ExceptionDemo {

    public static void main(String[] args) {
        ExceptionDemo.demonstrateException(true);
        ExceptionDemo.demonstrateException(false);
    }

    public static void triggerException(boolean shouldThrow) throws CustomException {
        if (shouldThrow) {
            throw new CustomException("Исключительная ситуация произошла!");
        } else {
            System.out.println("Исключение не брошено.");
        }
    }

    public static void demonstrateException(boolean shouldThrow) {
        try {
            triggerException(shouldThrow);
        } catch (CustomException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}
