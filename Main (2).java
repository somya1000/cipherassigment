
import java.util.*;
class Product {
  // properties
  private String pname;
  private String qty;
  private double price;
  private double totalPrice;

  // constructor
  Product(String pname, String qty, 
              double price, double totalPrice) {
    this.pname = pname;
    this.qty = qty;
    this.price = price;
    this.totalPrice = totalPrice;
  }
  public String getPname() {
    return pname;
  }
  public double getPrice() {
    return price;
  }
  public double getTotalPrice() {
    return totalPrice;
  }
  public static void displayFormat() {
    System.out.print("\nName      Quantity    Price\n");
  }
  public void display() {
    System.out.println(pname+"    "+qty+"   "+price);
  }
}

public class Main{
  public static void main(String[] args) {
    
    // variables
    String productName = null;
    String quantity =null;
    double price = 0.0;

    // create Scanner class object
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Budget");
    double amt=Double.parseDouble(scan.nextLine());
    List<Product> product = new ArrayList<Product>();
    int n=1;
    //int i=0;
    while(n==1)
  { 
      System.out.println("1.Add and item\n2.exit");
       n=Integer.parseInt(scan.nextLine());
      switch(n)
      {case 1:
          if(amt>0)
     { 
         System.out.print("Product Name: ");
       productName = scan.nextLine();
     System.out.print("Enter Quantity: ");
      quantity = scan.nextLine();
      System.out.print("Enter Price  ");
       price = Double.parseDouble(scan.nextLine()); 
        
       int z=0;
        double pp=0.0;
        int f=0;
      for(Product p : product)
      {    z++;
          if(p.getPname().equals(productName))
          {
            pp=p.getPrice();
            f=1;
              break;
          }
      }
      if(f==1)
      {amt=amt+pp;
      product.remove(z-1);
      }
    if(price>amt)
      {
          System.out.println("over priced");
          break;
      }
       amt=amt-price;
      product.add(new Product(productName,quantity,price,amt));
         System.out.println("Amount Left "+amt);
     }
      else{
          System.out.println("Exhausted the amt");
      }
          break;
        case 2:
          continue;
     }
  }
  TreeMap<Double, String> tree_map=new TreeMap<Double, String>(); 
   if(amt!=0)
   {
      
     for(Product p:product)
     {
          tree_map.put(amt-p.getPrice(),p.getPname());
     }
   
    for (Map.Entry<Double, String> e : tree_map.entrySet()) 
     {      if(e.getKey()>=0)
             {
                 System.out.println("you have amount left hence can buy"+e.getValue());
                 break;
             }
                               
     }}
    Product.displayFormat();
    for (Product p : product) {
      p.display();
    }
    scan.close();
  }
}




