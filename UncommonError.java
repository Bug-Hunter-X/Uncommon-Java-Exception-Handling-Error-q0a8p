public class UncommonError {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This line will cause an ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            //In this catch block, if we don't handle the exception properly it may cause unexpected issues in other parts of the code
            throw new RuntimeException("A more serious error occurred!", e); // Re-throwing with more context
        } finally {
            System.out.println("Finally block executed");
            //In finally block, we may try to access resources that have been closed or released in the catch block
            //This may lead to unpredictable behavior
        }
    }
}