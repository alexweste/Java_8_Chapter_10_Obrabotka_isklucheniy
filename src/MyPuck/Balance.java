package MyPuck;

/*Класс Balance и его конструктор и метод show() в данном примере
являются открытыми. Это означает, что за пределами своего пакета
они доступны из кода классов, не производных от классов их пакета.
*/
public class Balance {
    String name;
    double bal;

    public Balance(String n, double b){
        name = n;
        bal = b;
    }

    public void show(){
        if(bal<0)
            System.out.println("--> ");
        System.out.println(name + ": $" + bal);
    }
}
