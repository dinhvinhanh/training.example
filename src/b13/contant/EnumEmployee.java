package b13.contant;

public enum EnumEmployee {
    EXPERIENCE (0),
    FRESHER (1),
    INTERN (2),
    ;

    private Integer index;

    EnumEmployee(Integer i) {
        this.index = i;
    }

    public Integer getIndex() {
        return index;
    }
}
