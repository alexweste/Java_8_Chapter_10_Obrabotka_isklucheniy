package p2;

class Protection2 extends p1.Protection {
    Protection2(){
        System.out.println("конструктор, унаследованный из другого проекта");
        // доступно только для данного класса или пакета
        //System.out.println("n = " + n);

        // доступно только для данного класса
        //System.out.println("n_pri = " + n.pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
