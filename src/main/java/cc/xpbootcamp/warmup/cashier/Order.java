package cc.xpbootcamp.warmup.cashier;

import java.util.List;

public class Order {
    String cName;
    String addr;
    List<LineItem> lineItemList;

   private double totSalesTx = 0d;
   private double tot = 0d;
   private String lineInfos ="";
    public Order(String cName, String addr, List<LineItem> lineItemList) {
        this.cName = cName;
        this.addr = addr;
        this.lineItemList = lineItemList;
    }

    public String getCustomerName() {
        return cName;
    }

    public String getCustomerAddress() {
        return addr;
    }

    public List<LineItem> getLineItems() {
        return lineItemList;
    }

    String getOrderInfo() {
        StringBuilder output = new StringBuilder();

        // print headers
        output.append("======Printing Orders======\n");

        output.append(getCustomerName());
        output.append(getCustomerAddress());


        // prints lineItems

        for (LineItem lineItem : getLineItems()) {
            lineInfos+=lineItem.getLineInfo();
            // calculate sales tax @ rate of 10%
            double salesTax = lineItem.getSalesTax();
            totSalesTx += salesTax;
            // calculate total amount of lineItem = price * quantity + 10 % sales tax
            tot += lineItem.totalAmount() + salesTax;
        }
        output.append(lineInfos);

        // prints the state tax
        output.append("Sales Tax").append('\t').append(totSalesTx);
        // print total amount
        output.append("Total Amount").append('\t').append(tot);
        return output.toString();
    }
}
