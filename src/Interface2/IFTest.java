package Interface2;
/* Реализующий код
 */

public class IFTest {
    public static void main(String[] args){
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);
        int a = 5;
        int b = 8;

        //размещаем числа в стеке
        for (int i=0; i<5; i++) mystack1.push(a);
        for (int i=0; i<8; i++) mystack2.push(b);

        //извлекаем эти числа из стека
        System.out.println("Сек в mystack1:");
        for (int i=0; i<a; i++)
            System.out.println(mystack1.pop());

        System.out.println("Сек в mystack2:");
        for (int i=0; i<b; i++)
            System.out.println(mystack2.pop());
    }
}
