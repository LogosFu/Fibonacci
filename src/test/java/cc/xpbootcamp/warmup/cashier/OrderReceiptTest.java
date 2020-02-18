package cc.xpbootcamp.warmup.cashier;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class OrderReceiptTest {
    @Test
    void should_print_customer_information_on_order() {
        Order order = new Order("Mr X", "Chicago, 60601", LocalDate.now(), new ArrayList<LineItem>());
        OrderReceipt receipt = new OrderReceipt(order);
        String output = receipt.printReceipt();
        assertThat(output).contains("====老王超市，值得信赖====\n");
        assertThat(output).contains("Sales Tax\t0");
        assertThat(output).contains("Total Amount\t0");
    }

    @Test
    void shouldPrintDateOnOrder() {
        Order order = new Order("Mr X", "Chicago, 60601", LocalDate.parse("2020-02-17"), new ArrayList<LineItem>());
        OrderReceipt receipt = new OrderReceipt(order);
        String output = receipt.printReceipt();
        assertThat(output).contains("====老王超市，值得信赖====\n");
        assertThat(output).contains("2020年2月17日，星期一\n");
    }

    @Test
    public void should_print_line_item_and_sales_tax_information() {
        List<LineItem> lineItems = new ArrayList<LineItem>() {{
            add(new LineItem("milk", 10.0, 2));
            add(new LineItem("biscuits", 5.0, 5));
            add(new LineItem("chocolate", 20.0, 1));
        }};
        OrderReceipt receipt = new OrderReceipt(new Order(null, null, LocalDate.now(), lineItems));

        String output = receipt.printReceipt();
        assertThat(output).contains("milk\t10.0\t2\t20.0\n");
        assertThat(output).contains("biscuits\t5.0\t5\t25.0\n");
        assertThat(output).contains("chocolate\t20.0\t1\t20.0\n");
        assertThat(output).contains("Sales Tax\t6.5");
        assertThat(output).contains("Total Amount\t71.5");
    }

}