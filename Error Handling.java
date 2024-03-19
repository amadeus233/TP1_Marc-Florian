//throw 用于实际抛出一个特定的异常。
//throws 用于在方法声明中指示该方法可能抛出的异常类型，告知方法的调用者需要处理这些异常。
//throw is used to explicitly throw an exception.
//throws is used in a method signature to declare that a method may throw certain exceptions.
package yourOwnException;
public class Main {

    public static void f() throws MyException {
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }

    public static void g() throws MyException {
        System.out.println("Throwing MyException from g()");
        throw new MyException("Originated in g()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }
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
