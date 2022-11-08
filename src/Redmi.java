public class Redmi extends Phone{

    private String processor;

    private double diagonal;

    public Redmi(String processor, double diagonal) {
        this.processor = processor;
        this.diagonal = diagonal;
    }

    @Override
    public void print() {
        System.out.println("Processor: " + processor + "Diagonal: " + diagonal);
    }
}
