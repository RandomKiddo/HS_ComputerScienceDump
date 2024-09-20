public class Sandwich{
  private String meat;
  private String cheese;
  private String bread;
  private double price;
  private int calories;
  public Sandwich(){
    bread = selectBread();
    cheese = selectCheese();
    meat = selectMeat();
    price += 2.50;
  }
  public String selectBread(){
    String[] breadtypes = {"White Bread","Wheat Bread","Whole Grain Bread","Rye Bread","Flat Bread"};
    int[] bcal = {132,132,138,166,165};
    int rand = (int)(Math.random() * 5);
    calories += bcal[rand];
    if (breadtypes[rand].equalsIgnoreCase("Flat Bread")){
      price += 0.75;
    }
    return breadtypes[rand];
  }
  public String selectCheese(){
    String[] cheesetypes = {"Swiss Cheese","American Cheese","Colby Cheese","Cheddar Cheese","Provolone Cheese"};
    int[] ccal = {106,94,110,113,98};
    int rand = (int)(Math.random() * 5);
    calories += ccal[rand];
    return cheesetypes[rand];
  }
  public String selectMeat(){
    String[] meattypes = {"Ham","Roast Beef","Chicken","Turkey","Tuna Salad"};
    int[] mcal = {91,66,44,42,105};
    int rand = (int)(Math.random() * 5);
    calories += mcal[rand];
    if (meattypes[rand].equalsIgnoreCase("Roast Beef")){
      price += 1.00;
    }
    return meattypes[rand];
  }
  public String getBread(){
    return bread;
  }
  public String getCheese(){
    return cheese;
  }
  public String getMeat(){
    return meat;
  }
  public double getPrice(){
    return price;
  }
  public int getCalories(){
    return calories;
  }
}