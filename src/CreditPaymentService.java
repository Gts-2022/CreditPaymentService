public class CreditPaymentService {
    public double calculate(double s) {
        int n=12; // Количество месяцев
        double x=9.99; // Годовая ставка
        double r=x / 100 / 12; // Ставка в месяц
        return s * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1)); // Формула расчета

    }
}
