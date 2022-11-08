public class IPhone extends Phone{

    private int mpCamera;

    private int memoryPhone;

    public IPhone(int mpCamera, int memoryPhone) {
        this.mpCamera = mpCamera;
        this.memoryPhone = memoryPhone;
    }

    @Override
    public void print() {
        System.out.println("Camera mp: " + mpCamera + " Memory: " + memoryPhone);

    }
}
