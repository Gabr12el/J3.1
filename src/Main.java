public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int BonusMilesService = service.calculate(10000);
        System.out.println("Количество бонусных миль:" + BonusMilesService);
    }
}