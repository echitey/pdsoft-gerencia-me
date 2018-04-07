/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciame;

import java.util.Date;

/**
 *
 * @author Yawo
 */
public class Client extends User{
    
    private String city;
    private String zip_code;
    private String bill_address;
    private String phone;
    private String card_number;
    private Date card_expiry_date; 
    private int card_sec_code;

    public Client(String city, String zip_code, String bill_address, String phone, String card_number, Date card_expiry_date, int card_sec_code) {
        this.city = city;
        this.zip_code = zip_code;
        this.bill_address = bill_address;
        this.phone = phone;
        this.card_number = card_number;
        this.card_expiry_date = card_expiry_date;
        this.card_sec_code = card_sec_code;
    }

    public Client(String city, String zip_code, String bill_address, String phone, String card_number, Date card_expiry_date, int card_sec_code, String name, String email, String login_id, String password, String cpf) {
        super(name, email, login_id, password, cpf);
        this.city = city;
        this.zip_code = zip_code;
        this.bill_address = bill_address;
        this.phone = phone;
        this.card_number = card_number;
        this.card_expiry_date = card_expiry_date;
        this.card_sec_code = card_sec_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getBill_address() {
        return bill_address;
    }

    public void setBill_address(String bill_address) {
        this.bill_address = bill_address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public Date getCard_expiry_date() {
        return card_expiry_date;
    }

    public void setCard_expiry_date(Date card_expiry_date) {
        this.card_expiry_date = card_expiry_date;
    }

    public int getCard_sec_code() {
        return card_sec_code;
    }

    public void setCard_sec_code(int card_sec_code) {
        this.card_sec_code = card_sec_code;
    }
    
    
    
}
