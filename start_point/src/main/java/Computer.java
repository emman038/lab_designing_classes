public class Computer {
    private int storage;
    private String printerModel;

    private int addStorageSpace;

    public Computer(int inputStorage, String printerModel){
        this.storage = inputStorage;
        this.printerModel = printerModel;
    }

    public int getStorage(){
        return this.storage;
    }

    public void addStorage(int inputStorage){
        this.addStorageSpace = inputStorage;
        this.storage += this.addStorageSpace;
    }

    public void setPrinterModel(String newPrinterModel){
        this.printerModel = newPrinterModel;
    }
    
    public String getPrinterModel(){
        return this.printerModel;
    }

}
