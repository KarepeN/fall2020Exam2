package karepe_exam2.question3;

/**
 *
 * @author Nithya Karepe
 */
public class Loan {

    double principal;
    int time;
    double rate;

    /**
     * @param principal
     * @param time
     * @param rate
     */
    public Loan(double principal, int time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
    }

    /**
     * @return the principal
     */
    public double getPrincipal() {
        return principal;
    }

    /**
     * @param principal the principal to set
     */
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    /**
     * @return the time
     */
    public double getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the interest
     */
    public double calcInterest() {
        return principal * time * rate / 100;
    }

    @Override
    public String toString() {
        return "Loan :\n" + "        Amount = $" + principal + "\n          Time = " + time
                + "months\n          Rate = " + rate + "%\n      Interest = $" + calcInterest();
    }

}
