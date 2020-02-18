package cc.xpbootcamp.warmup.cashier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.Data;

@Data

public class Order {

  String cName;
  String addr;
  LocalDate date;
  List<LineItem> lineItemList;

  private double totSalesTx = 0d;
  private double tot = 0d;

  public Order(String cName, String addr, LocalDate date, List<LineItem> lineItemList) {
    this.cName = cName;
    this.addr = addr;
    this.lineItemList = lineItemList;
    this.date = date;
  }

  String getOrderInfo() {
    settlement();
    return buildOrderHeader()
        + "\n"
        + buildLineItemInfo()
        + "\n"
        + buildOrderFooter();
  }

  private String buildOrderHeader() {
    return "====老王超市，值得信赖====\n"+formatDate();
  }

  private String buildOrderFooter() {
    // prints the state tax
    return "Sales Tax" + '\t' + totSalesTx
        + "Total Amount" + '\t' + tot;
  }

  private String buildLineItemInfo() {

    return lineItemList.stream().map(LineItem::getLineInfo)
        .collect(Collectors.joining("\n"));
  }

  private void settlement() {
    lineItemList.forEach(this::countLineStatus);
  }

  private void countLineStatus(LineItem lineItem) {
    totSalesTx += lineItem.getSalesTax();
    tot += lineItem.totalAmount() + lineItem.getSalesTax();
  }

  private String formatDate() {
    return date.format(DateTimeFormatter.ofPattern("yyyy年M月dd日")) + "，星期"+ getWeekOfDay();
  }

  private String getWeekOfDay() {
    String[][] strArray = {{"MONDAY", "一"}, {"TUESDAY", "二"}, {"WEDNESDAY", "三"}, {"THURSDAY", "四"},
        {"FRIDAY", "五"}, {"SATURDAY", "六"}, {"SUNDAY", "日"}};
    final Optional<String[]> matchDay = Arrays.stream(strArray)
        .filter(string -> String.valueOf(date.getDayOfWeek()).equals(string[0])).findAny();
    return matchDay.map(strings -> strings[1]).orElseThrow(RuntimeException::new);
  }


}
