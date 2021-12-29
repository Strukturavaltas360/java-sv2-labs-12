package statemachine.seatheater;

public enum SeatHeaterState {

    STATE_ONE {
        @Override
        SeatHeaterState next() {
            return STATE_NULL;
        }
    }, STATE_TWO {
        @Override
        SeatHeaterState next() {
            return STATE_ONE;
        }

    }, STATE_THREE {
        @Override
        SeatHeaterState next() {
            return STATE_TWO;
        }

    }, STATE_NULL {
        @Override
        SeatHeaterState next() {
            return STATE_THREE;
        }
    };

    abstract SeatHeaterState next();
}
