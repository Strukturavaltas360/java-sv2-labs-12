package statemachine.typewriter;

public enum TypeWriterState {

    UPPERCASE{
        @Override
        TypeWriterState endRow() {
            return TypeWriterState.LOWERCASE;
        }

    }, LOWERCASE{
        @Override
        TypeWriterState endRow() {
            return TypeWriterState.UPPERCASE;
        }
    };

    abstract TypeWriterState endRow();

}
