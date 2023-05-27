package skypro;

public enum Type {
    WORK("Работа"),
    PERSON("Личное");

    private String type;

    Type(String type){
        this.type=type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return  type ;
    }

    public String getValue() {
        return type;
    }

    public static Type valueOf(Integer value) {
        switch (value) {
            case 1:
                return WORK;

            case 2:
                return PERSON;

            default:
                break;
        }
        return null;
    }


}
