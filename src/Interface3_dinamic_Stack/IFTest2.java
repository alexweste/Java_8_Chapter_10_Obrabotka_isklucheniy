package Interface3_dinamic_Stack;
/* Реализующий код
 */



public class IFTest2 {
    public static void main(String[] args){
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        int a = 5;
        int b = 6;
        int x = 30;
        int y = 28;

        //размещаем числа в стеке
        for (int i=0; i<x; i++) mystack1.push(a);
        for (int i=0; i<y; i++) mystack2.push(b);

        //извлекаем эти числа из стека
        System.out.println("Сек в mystack1:");
        for (int i=0; i<x; i++)
            System.out.println(mystack1.pop());

        System.out.println("Сек в mystack2:");
        for (int i=0; i<y; i++)
            System.out.println(mystack2.pop());
    }
}
