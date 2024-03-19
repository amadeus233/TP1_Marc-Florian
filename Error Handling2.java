//throw 用于实际抛出一个特定的异常。
//throws 用于在方法声明中指示该方法可能抛出的异常类型，告知方法的调用者需要处理这些异常。
//throw is used to explicitly throw an exception.
//throws is used in a method signature to declare that a method may throw certain exceptions.
// 位于 catchingExceptionHierarchy 包中
package catchingExceptionHierarchy;

class MyParentException extends Exception { }

class MyChildException extends MyParentException { }

class MyGrandChildException extends MyChildException { }

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyGrandChildException();
        } catch (MyChildException e) {
            System.err.println("Caught MyChildException");
        } catch (MyParentException e) {
            System.err.println("Caught MyParentException");
        }
        // 尝试更改 catch 块的顺序，将导致编译错误，因为更具体的异常应该先被捕获。
    }
}

/*The second version
/*package dividebyzero;
public class Main {

    /**
     * @param args the command line arguments
     */
/*  public static void main(String[] args) {
        try {
            System.out.println(3/0);
        } catch (ArithmeticException e) {
            System.out.printf("Caught runtime exception: %s\n", e.getMessage());
        }
    }

}

/*!!!!!   The original version of the code !!!!!!!!!
/*package dividebyzero;
public class Main {
 
 /**
 * @param args the command line arguments
 */
/* public static void main(String[] args) {
 System.out.println(3/0);
/*}
 
}
