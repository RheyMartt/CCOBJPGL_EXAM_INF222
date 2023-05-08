package I;

import Location.*;

public interface Tourist {

    int budget = 0;

    void visit(Bohol bohol);

    void visit(Boracay boracay);

    void visit(Elnido elnido);

    void visit(Pagudpud pagudpud);

    void visit(Pgalera pgalera);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
