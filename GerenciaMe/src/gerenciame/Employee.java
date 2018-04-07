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
public class Employee extends User {
    
    private double salary;
    private double workload;

    public Employee() {
    }    

    public Employee(double salary, double workload, String name, String email, String login_id, String password, String cpf) {
        super(name, email, login_id, password, cpf);
        this.salary = salary;
        this.workload = workload;
    }

    public double getSalary() {
        return salary;
    }

    public double getWorkload() {
        return workload;
    }    
    
}
