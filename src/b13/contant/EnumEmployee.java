package b13.contant;

public enum EnumEmployee {
    EXPERIENCE (0),
    FRESHER (1),
    INTERN (2),
    ;

    private int index;

    EnumEmployee(int i) {
        this.index = i;
    }

    public int getIndex() {
        return index;
    }
}
