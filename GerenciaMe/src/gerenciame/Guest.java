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
public class Guest extends Client  {
    
    private String SSN;
    private int room;

    public Guest(String SSN, int room, String city, String zip_code, String bill_address, String phone, String card_number, Date card_expiry_date, int card_sec_code) {
        super(city, zip_code, bill_address, phone, card_number, card_expiry_date, card_sec_code);
        this.SSN = SSN;
        this.room = room;
    }

    public Guest(String SSN, int room, String city, String zip_code, String bill_address, String phone, String card_number, Date card_expiry_date, int card_sec_code, String name, String email, String login_id, String password, String cpf) {
        super(city, zip_code, bill_address, phone, card_number, card_expiry_date, card_sec_code, name, email, login_id, password, cpf);
        this.SSN = SSN;
        this.room = room;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
    
    
    
}
