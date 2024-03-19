
package dividebyzero;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.printf("Caught runtime exception: %s\n", e.getMessage());
        }

        // 进一步的异常处理演示
        handleCustomException();
    }

    private static void handleCustomException() {
        try {
            // 显式地抛出一个异常
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            // 显示错误信息
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            // 显示错误的堆栈跟踪
            e.printStackTrace();
        }
    }
}
