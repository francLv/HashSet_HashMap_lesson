package ru.netology;

import java.time.LocalDateTime;

public class DriverLicense {
    private String serial;
    private String driverName;
    private String categories;
    private LocalDateTime createTime;

    public String getSerial() {
        return serial;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getCategories() {
        return categories;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public DriverLicense(String serial, String driverName, String categories, LocalDateTime createTime) {
        this.serial = serial;
        this.driverName = driverName;
        this.categories = categories;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return driverName + " (" + serial + ")";
    }
}
