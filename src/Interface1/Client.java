package Interface1;
// создаём интерфейс Callback;
interface Callback {
    void callback(int param);
}

class Client implements Callback{
    //реализуем интерфейс Callback;
    public void callback(int p){
        System.out.println("Метод callback, вызываемый со значением " + p);
    }
    public void iface(){
        System.out.println("Метод не из интерфейса");
    }
}
class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Ещё один вариант метода callback()");
        System.out.println("p в квадрате равно: " + (p*p));
    }
}

class ClientDemo{
    public static void main(String[] args){
        Callback cl = new Client();
        AnotherClient ob = new AnotherClient();
        cl.callback(41);
        //cl.iface();
        cl = ob;
        cl.callback(41);
    }
}