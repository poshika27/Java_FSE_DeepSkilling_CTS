package factorymethod;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document");
    }
}
