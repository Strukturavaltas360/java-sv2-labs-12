package enumabstract;

public enum Discount {

    SPECIAL_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            return price * (1 - 0.2) * pieces;
        }
    },
    BLACK_FRIDAY_OFFER {
        @Override
        public double getAmountToPay(int price, int pieces) {
            if (pieces <= 2 && pieces >= 0) {
                return (1 - 0.25) * price * pieces;
            } else {
                return (0.5 * price) + (1 - 0.25) * price * (pieces - 1);
            }
        }
    };

    public abstract double getAmountToPay(int price, int pieces);
}
