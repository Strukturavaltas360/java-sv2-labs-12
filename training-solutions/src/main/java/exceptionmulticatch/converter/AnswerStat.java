package exceptionmulticatch.converter;

public class AnswerStat {
    BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String string) {
        try {
            return binaryStringConverter.binaryStringToBooleanArray(string);
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new InvalidBinaryStringException("Error while converting string to boolean array", e);
        }
    }

    public int answerTruePercent(String answers) {
        boolean[] booleanArray = binaryStringConverter.binaryStringToBooleanArray(answers);
        int sum = 0;
        for (boolean b : booleanArray) {
            if (b) {
                sum++;
            }
        }
        return sum * 100 / booleanArray.length;
    }
}