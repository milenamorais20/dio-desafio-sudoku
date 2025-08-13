package sudoku.model;

public enum GamesStatusEnum {
    NON_STARTED("não iniciado"),
    COMPLETE("completo"),
    INCOMPLETE("incompleto");

    private String label;

    GamesStatusEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
