package b13.view;
public enum MenuValue {
    DISPLAY_ALL(0),
    DISPLAY_TYPE(1),
    ADD(2),
    DELETE(3),
    UPDATE(4),
    EXIT(5)
    ;

    private int value;

    MenuValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

