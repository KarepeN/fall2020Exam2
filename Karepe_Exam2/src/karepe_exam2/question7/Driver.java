package karepe_exam2.question7;
/**
 *
 * @author Nithya Karepe
 */
public class Driver {

    public static void main(String[] args) {

        // Printing Country codes and corresponding values
        CountryCode[] codes = CountryCode.values();
        PhoneCode[] phonecodes = PhoneCode.values();

        for (CountryCode code : codes) {
            System.out.println("Country code : " + code.name() + " Country Name: " + code.getValue());
        }

        System.out.printf("I am Nithya Karepe. Currently living in %s. My home country is %s\n",
                CountryCode.US.getValue(), CountryCode.IN.getValue());
        for (PhoneCode phoneCode : phonecodes) {
            System.out.println("Phone : " + phoneCode.name() + " " + phoneCode.getCode());
        }
    }

}
