public class Main {
    public static void main(String[] args) {

   Phone iPhone = createObject("IPhone");
   iPhone.print();
   Phone Samsung = createObject("Samsung");
   Samsung.print();
   Phone Redmi = createObject("Redmi");
   Redmi.print();

    }

    public static Phone createObject(String className) {

        switch (className) {
            case "IPhone":
                return new IPhone(+ 48,128);
            case "Samsung":
                return new Samsung("J5 ", "AMOLED");
            case "Redmi":
                return new Redmi("Snapdragon 625 ", 5.8);
        }
        return null;
    }
}