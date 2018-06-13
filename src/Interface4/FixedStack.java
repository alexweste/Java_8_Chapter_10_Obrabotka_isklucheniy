package Interface4;

/* В приведённый ниже программе создаём класс FixedStack,
реализующий версию целочисленного стека фиксированной длинны.
 */
public class FixedStack implements Interface4.IntStack {
    private int stck[];
    private int tos;

    //выделяем память и инициализируем стек
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }

    //размещаем элемент в стеке
    public void push(int item){
        if(tos==stck.length-1) //используем поле длины стека
            System.out.println("Стек заполенен.");
        else
            stck[++tos] = item;
    }

    //извлекаем элемент из стека
    public int pop(){
        if(tos < 0){
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
