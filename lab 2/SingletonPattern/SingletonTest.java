package SingletonPattern;
public class SingletonTest {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();

        if (obj1 == obj2) {
            System.out.println("Same instances");
        } else {
            System.out.println("Different instancess");
        }
    }
}
