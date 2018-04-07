/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciame;

/**
 *
 * @author Yawo
 */
public class User {
    
    private String name;
    private String email;
    private String login_id;
    private String password;
    private String cpf;

    public User() {
    }

    public User(String name, String email, String login_id, String password, String cpf) {
        this.name = name;
        this.email = email;
        this.login_id = login_id;
        this.password = password;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin_id() {
        return login_id;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLogin_id(String login_id) {
        this.login_id = login_id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
