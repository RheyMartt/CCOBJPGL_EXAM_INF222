package Location;

import I.Tourist;

public class Elnido implements Locations {

    int airFare = 260;

    public int bayadpamasahe() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}