package Model;

import java.sql.Timestamp;

public class Country {
    private static int countryId;
    private String nameOfCountry;
    private Timestamp lastUpdate;

    public Country(String nameOfCountry, Timestamp lastUpdate) {
        this.nameOfCountry = nameOfCountry;
        this.lastUpdate = lastUpdate;
    }

    public static int getCountryId() {
        return countryId;
    }

    public static void setCountryId(int countryId) {
        Country.countryId = countryId;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}