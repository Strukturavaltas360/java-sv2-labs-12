package typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double number) {
        return (int) number;

//        int nInt = (int) number;
//        double number2 = nInt;
//        return number2;

//        double number2;
//        return number2 = (int) number; // az egyenlőség operátor kihasználása doublera visszakonvertálásnál

    }

    public byte[] convertIntArrayToByteArray(int[] arrayOfInt) {
        byte[] arrayOfBytes = new byte[arrayOfInt.length];

        for (int i=0;i<arrayOfInt.length;i++) {
            if ((arrayOfInt[i] < 0) || (arrayOfInt[i]>127)) {
                arrayOfBytes[i] = -1;
            } else {
                arrayOfBytes[i] = (byte)arrayOfInt[i];
            }
        }
        return arrayOfBytes;
    }

}
