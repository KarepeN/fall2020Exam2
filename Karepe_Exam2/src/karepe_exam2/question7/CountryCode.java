package karepe_exam2.question7;

/**
 *
 * @author Nithya Karepe
 */
public enum CountryCode {

    US("United States"), UK("United Kingdom"), IN("India"), AU("Australia"), CA("Canada"), MX("Mexico"),
    HK("Hong Kong");

    private String value;

    /**
     * @param value
     */
    private CountryCode(String value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

}
