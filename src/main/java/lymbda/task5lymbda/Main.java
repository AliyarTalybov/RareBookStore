package lymbda.task5lymbda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Email> emails = Arrays.asList(
                new Email("Письмо 1", "Текст письма 1", false),
                new Email("Письмо 2", "Текст письма 2", true),
                new Email("Спам", "Текст спама", false)
        );
        EmailProcessor emailProcessor = new EmailProcessor();
        Predicate<Email> importantFilter = email -> email.isImportant();
        Function<Email, String> transformer = email -> email.getBody().toUpperCase();
        Consumer<Email> printEmail = email -> System.out.println("Обработано письмо: " + email.getSubject() + ": " + email.getBody());
        emailProcessor.processEmails(emails, importantFilter, printEmail, transformer);

    }
}