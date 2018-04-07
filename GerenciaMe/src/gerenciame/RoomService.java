/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciame;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yawo
 */
public class RoomService {
    
    private List<EmployeerService> services;
    private Room room;

    public RoomService(Room room) {
        this.room = room;
        this.services = new ArrayList<EmployeerService>();
    }
    
    public void createService(EmployeerService service){
        this.services.add(service);
    };
    
    public void alterService(EmployeerService service, int position){
        this.services.set(position, service);
    }
    
    public void listAllService(){
        //Iterate
    }
    
    public void deleteAll(){
        this.services.removeAll(services);
    }
    
    
}
