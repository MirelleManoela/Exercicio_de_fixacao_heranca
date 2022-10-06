package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class usedProduct extends Product{

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

    private Date manufactureDate;


    public usedProduct(){
        super();
    }

    public usedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    @Override
    public String  priceTag(){
        return getName()
                +"(used) $"
                + price
                + " Manufacture date: "
                +  sdf.format(manufactureDate)
                + ")";

    }


}
