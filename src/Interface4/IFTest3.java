package Interface4;
/* Реализующий код
Создаём переменную интерфейса и обращаемся к стекам через неё
 */

public class IFTest3 {
    public static void main(String[] args){
        // создаём переменную ссылки на интерфейс
        IntStack mystack1;
        IntStack mystack2;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);


        //загружаем динамический стек
        mystack1 = ds;
        //размещаем числа в стеке
        for (int i=0; i<12; i++) mystack1.push(i);

        //загружаем фиксированный стек
        mystack2 = fs;
        for (int i=0; i<8; i++) mystack2.push(i);

        //извлекаем эти числа из стека
        System.out.println("Значение в динамическом стеке:");
        for (int i=0; i<12; i++)
            System.out.println(mystack1.pop());

        System.out.println("Значение в фиксированном стеке:");
        for (int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}
