package Location;

import I.Tourist;

public class Pagudpud implements Locations {

    int airFare = 250;

    public int bayadpamasahe() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}