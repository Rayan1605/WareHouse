package Sevice;

import Entity.Product;
import Entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@org.springframework.stereotype.Service
@Data
@AllArgsConstructor
public class Service {
    Map<Integer,Warehouse> a = new HashMap<>();
    public Warehouse Check(int id){

        if (check(id)){

            return new Warehouse(id, a.get(id).getLocation(),a.get(id).getCapacity());
        }
        else {
            return new Warehouse(id, "Not Valid",0);
        }

    }

    private boolean check(int id) {

        return a.containsKey(id);
    }
        public void Add (Warehouse warehouse,int warehouseid){
        a.put(warehouseid,warehouse);
        }

}
