public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54,"White"); //-Setting default value to all this field's of parent class for all object's of this class.
        super.addHamburgerAddition1("Chips", 2.75); //rem(aisee bhe kar sakte hai)
        super.addHamburgerAddition2("Drink", 1.81); //rem(aisee bhe kar sakte hai)
    }

    @Override
    public void addHamburgerAddition1(String name, double price){
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price){
            System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price){
            System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
