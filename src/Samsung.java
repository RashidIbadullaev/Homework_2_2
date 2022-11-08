public class Samsung extends Phone{

    private String model;

    private String displayType;

    public Samsung(String model, String displayType) {
        this.model = model;
        this.displayType = displayType;
    }

    @Override
    public void print() {
        System.out.println("Model: " + model + "Display: " + displayType);
    }
}
