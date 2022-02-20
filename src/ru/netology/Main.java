package ru.netology;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    private static final Random RAND = new Random();

    public static void main(String[] args) {
        Map<String, DriverLicense> storage = new HashMap<>();

        fill(storage);

        System.out.println(storage.get("123"));

        System.out.println("Все ключи");
        for (String key : storage.keySet()) {
            System.out.println(key);
        }

        System.out.println("Все значения");
        for (DriverLicense dl : storage.values()) {
            System.out.println(dl);
        }

        System.out.println("Все значения");
        for (Map.Entry<String, DriverLicense> entry : storage.entrySet()) {
            System.out.println(entry.getKey()+" => " + entry.getValue()) ;
        }
    }

    private static void fill(Map<String, DriverLicense> storage) {
        addLicense(storage, "Вова", "ABC");
        addLicense(storage, "Петя", "AB");
        addLicense(storage, "Сережа", "AC");
        storage.put("123",
                new DriverLicense(
                        "123",
                        "Андрей",
                        "ABCDE",
                        LocalDateTime.of(1999, 10, 20, 12, 20)));
    }

    private static void addLicense(Map<String, DriverLicense> storage, String driverName, String categories) {
        String serial = String.valueOf(RAND.nextInt());
        storage.put(serial,
                new DriverLicense(
                        serial,
                        driverName,
                        categories,
                        LocalDateTime.of(1999, 10, 20, 12, 20)));
    }
}
