package co.edu.unillanos.msg.infrastructure.ui;

import java.util.Locale;

public final class MoneyFormat {

    private MoneyFormat() { }

    public static String format(double amount) {
        return String.format(Locale.ROOT, "$ %.2f", amount);
    }
}