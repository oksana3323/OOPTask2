public class Main {
    public static void main(String[] args) {
        //TODOMyClass деген класс тузунуз
        //
        //Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
        //
        //Параметри эки башка болгон эки конструктор тузунуз
        //
        //MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
        //(
        //Эки объектке эки башка конструктор иштесин.
        //
        //Объекттердин маанилерин консольго чыгарыныз.
        Peaksoft peaksoft1=new Peaksoft("English","Pasta");
                Peaksoft [] peaksofts1={peaksoft1} ;
        MyClass myClass=new MyClass();
        myClass.firstName="Oksana";
        myClass.LastName="Saidilkanova";
        myClass.age=18;
        myClass.peaksofts=peaksofts1;
        System.out.println(myClass);


        Peaksoft peaksoft=new Peaksoft("English","Pasta");
        Peaksoft [] peaksofts={peaksoft};
        MyClass myClass1=new MyClass("Oksana","Saidilkanova",18,peaksofts);
        System.out.println(myClass1);

    }
}