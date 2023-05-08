import Location.*;
import I.*;

public class App {
    public static void main(String[] args) {

        Locations bohol = new Bohol();
        Locations boracay = new Boracay();
        Locations elnido = new Elnido();
        Locations pagudpud= new Pagudpud();
        Locations pgalera  = new Pgalera();

        Tourist mark = new Me();

        bohol.accept(mark);
        boracay.accept(mark);
        elnido.accept(mark);
        pagudpud.accept(mark);
        pgalera.accept(mark);
    }
}
