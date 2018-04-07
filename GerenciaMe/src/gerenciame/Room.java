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
public class Room {
    
    private int id;
    private boolean occupied;
    private Client client;

    public Room(int id, boolean occupied, Client client) {
        this.id = id;
        this.occupied = occupied;
        this.client = client;
    }

    public Room(int id, boolean occupied) {
        this.id = id;
        this.occupied = occupied;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
}
