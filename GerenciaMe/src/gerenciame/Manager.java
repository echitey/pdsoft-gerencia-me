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
public class Manager extends Employee{

    public Manager() {
    }
    
    public Manager(double salary, double workload, String name, String email, String login_id, String password, String cpf) {
        super(salary, workload, name, email, login_id, password, cpf);
    }
    
}
