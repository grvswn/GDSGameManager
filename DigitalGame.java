import java.util.Scanner;

public class DigitalGame extends Game {
  String Format;
  String Store;
  double Size;

  public DigitalGame() {
    super();
    this.Format = "Digital Game";
    this.Store = "N/A";
    this.Size = 0;
  }

  public DigitalGame(String name, String platform, String dateOfPurchase, String store, double size) {
    super(name, platform, dateOfPurchase);
    this.Format = "Digital Game";
    this.Store = store;
    this.Size = size;
  }

  public String getFormat() {
    return Format;
  }

  public String getStore() {
    return Store;
  }

  public void setStore(String setStore) throws IllegalArgumentException {
    if (setStore != null && !setStore.isEmpty()) {
      this.Store = setStore;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  public double getSize(){
    return Size;
  }

  public void setSize(double setSize) throws IllegalArgumentException {
    if (setSize > 0) {
      this.Size = setSize;
    } 
    else {
      throw new IllegalArgumentException("Invalid entry, check and try again");
    }
  }

  @Override
  public void displayDetails(){
    super.displayDetails();
    System.out.println("Format: " + getFormat());
    System.out.println("Store: " + getStore());
    System.out.println("Size (in GB): " + getSize());
  }

  @Override
  public void editGame() {
    super.editGame();
    Scanner userInput = new Scanner(System.in);

    System.out.println("Enter new store/download link: ");
    String newStore = userInput.nextLine();
    this.setStore(newStore);
    System.out.println("Enter new size (in GB): ");
    double newSize = userInput.nextDouble();
    this.setSize(newSize);
  }
}

