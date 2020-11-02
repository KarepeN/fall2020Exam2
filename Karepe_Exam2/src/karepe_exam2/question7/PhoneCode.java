/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karepe_exam2.question7;

/**
 *
 * @author Nithya Karepe
 */
public enum PhoneCode {
    UNITED_STATES("+1"), UNITED_KINGDOM("+44"), INDIA("+91"), AUSTRALIA("+61"), CANADA("+1"), MEXICO("+52"),
	HK("+852");
        public String code;

    private PhoneCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
        
}
