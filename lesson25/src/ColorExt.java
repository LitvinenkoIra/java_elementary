public enum ColorExt {
    BLACK("Black Cat"),
    WHITE("White Cat"),
    RED("Red Cat");

    private String color;

    ColorExt(String color) {
        this.color = color;
    }

    public String getColorValue() {
        return this.color;
    }
}
