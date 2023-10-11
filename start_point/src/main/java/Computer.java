public class Computer {
    private int storage;
    private String printerModel;

    public Computer(int inputStorage, String printerModel){
        this.storage = inputStorage;
        this.printerModel = printerModel;
    }

    public int getStorage(){
        return this.storage;
    }

    public void addStorage(int extraStorage){
        this.storage += extraStorage;
    }

    public void setPrinterModel(String newPrinterModel){
        this.printerModel = newPrinterModel;
    }
    
    public String getPrinterModel(){
        return this.printerModel;
    }

}
