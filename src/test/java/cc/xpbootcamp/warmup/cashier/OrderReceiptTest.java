package cc.xpbootcamp.warmup.cashier;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class OrderReceiptTest {
    @Test
    void shouldPrintCustomerInformationOnOrder() {
        Order order = new Order("Mr X", "Chicago, 60601", new ArrayList<LineItem>());
        OrderReceipt receipt = new OrderReceipt(order);

        String output = receipt.printReceipt();


        assertThat(output).contains("Mr X");
        assertThat(output).contains("Chicago, 60601");
    }

    @Test
    public void shouldPrintLineItemAndSalesTaxInformation() {
        List<LineItem> lineItems = new ArrayList<LineItem>() {{
            add(new LineItem("milk", 10.0, 2));
            add(new LineItem("biscuits", 5.0, 5));
            add(new LineItem("chocolate", 20.0, 1));
        }};
        OrderReceipt receipt = new OrderReceipt(new Order(null, null, lineItems));

        String output = receipt.printReceipt();
        assertThat(output).contains("milk\t10.0\t2\t20.0\n");
        assertThat(output).contains("biscuits\t5.0\t5\t25.0\n");
        assertThat(output).contains("chocolate\t20.0\t1\t20.0\n");
        assertThat(output).contains("Sales Tax\t6.5");
        assertThat(output).contains("Total Amount\t71.5");
    }

}