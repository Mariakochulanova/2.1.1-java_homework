public class Miles {
    public static void main(String[] args) {
        BonusMilesService bonusMilesService = new BonusMilesService();

        int ticketprice = 10_000;

        int totalmiles = bonusMilesService.calculate(10_000);

        System.out.println(totalmiles);




    }
}

