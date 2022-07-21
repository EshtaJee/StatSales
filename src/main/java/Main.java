import ru.eshtajee.statist.services.StatsService;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        int[] allSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sumSales = service.getSumSales(allSales);
        int middleSales = service.getMiddleSales(allSales);
        int picSalesMonth = service.getPicSalesMonth(allSales);
        int minSalesMonth = service.getMinSalesMonth(allSales);
        int monthDown = service.getMonthDown(allSales);
        int monthHigh = service.getMonthHigh(allSales);

        System.out.println();
        System.out.println("Сумма продаж за период = "+ sumSales);

        System.out.println("Средняя сумма продаж в месяц = "+ middleSales);

        System.out.println("Номер месяца, в котором был пик продаж - "+ (picSalesMonth + 1));

        System.out.println("Номер месяца, в котором был минимум продаж - "+ (minSalesMonth + 1));

        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего = "+ monthDown);

        System.out.println("Кол-во месяцев, в которых продажи были выше среднего = "+ monthHigh);

    }
}
