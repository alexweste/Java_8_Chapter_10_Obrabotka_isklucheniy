package Interface4;
//реализация "наращиваемого" стека
public class DynStack implements Interface4.IntStack{
    private int stck[]; //массив для хранения стека целочисленных значений
    private int tos;    //индекс вершины стека

    //Выделяем память и инициализируем стек (вершину стека)
    DynStack(int size){
        stck = new int[size];
        tos = -1; // инициализируем переменную tos значением -1, обозначающим, что стек пуст
    }

    //размещаем элементы в стеке
    public void push(int item) {
        //если стек заполнен, то выделить память под стек большего размера
        if(tos==stck.length-1) {
            int temp[] = new int[stck.length * 2]; //создаём для стека новый массив и удваиваем размер памяти для стека
            for (int i=0; i<stck.length; i++) temp[i] = stck[i]; //наполняем массив с удвоенной памятью temp[i] из массива stck[i]
            stck = temp;          //переносим данные из массива temp в массив stck
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    //извлекаем элемент из стека
    public int pop(){
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
