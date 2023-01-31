public class Main {
    public static void main(String[] args) {
        CreditPaymentService service=new CreditPaymentService();
        int amount=1_000_000; // Сумма кредита
        int payment=(int) service.calculate(amount);
        System.out.println("Ежемесячный платёж по кредиту: " + payment + " рублей");
    }
}