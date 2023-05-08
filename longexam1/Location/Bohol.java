package Location;

import I.Tourist;

public class Bohol implements Locations {

    int airFare = 300;

    public int bayadpamasahe() {
        return airFare;
    }

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}