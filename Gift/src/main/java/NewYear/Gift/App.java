package NewYear.Gift;


import java.util.ArrayList;
class App 
{
	public static void main(String s[]) {
        Cadbury cadbury = new Cadbury();
        Pulse pulse = new Pulse();
        Dairy_Milk dairy_Milk = new Dairy_Milk();
        Kitkat kitkat = new Kitkat();
        Snickers snickers = new Snickers();
        ArrayList<chocolates> listOfChocolates = new ArrayList<chocolates>();
        listOfChocolates.add(cadbury);
        listOfChocolates.add(pulse);
        listOfChocolates.add(dairy_Milk);
        listOfChocolates.add(kitkat);
        listOfChocolates.add(snickers);
        for(chocolates list:listOfChocolates)
        {
        	System.out.print(list);
        	list.sweetness();
        	list.description();
        	System.out.println();
        }
	}
}
interface sweets
{       
    void sweetness();
}
interface chocolates extends sweets
{
    void description();
}
class Cadbury implements chocolates
{
    public void sweetness() {
        System.out.print("  Fantastic!!");
    }
    public void description() {
        System.out.print("  Hajmola Family");
    }
    public String toString()
    {
        return "Cadbury";
    }
}
class Pulse implements chocolates
{
    public void sweetness()
    {
        System.out.print("  Too bold to be expressed in words!");
    }
    public void description() {
        System.out.print("  Pass-Pass!");
    }
    public String toString()
    {
        return "Pulse";
    }
}
class Dairy_Milk implements chocolates
{
	public void sweetness()
    {
        System.out.print(" deleicious!");
    }
    public void description() {
        System.out.print("  Pass-Pass");
    }
    public String toString()
    {
        return "Dairy_Milk";
    }
}
class Kitkat implements chocolates
{
	public void sweetness()
    {
        System.out.print("  Crispy!!");
    }
    public void description() {
        System.out.print("  Nestle");
    }
    public String toString()
    {
        return "Kitkat";
    }
}
class Snickers implements chocolates
{
	public void sweetness()
    {
        System.out.print("  Crunchy");
    }
    public void description() {
        System.out.print("  Nestle");
    }
    public String toString()
    {
        return "Snickers";
    }
}



