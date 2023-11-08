package Sevice;

import Entity.Warehouse;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Data
@AllArgsConstructor
public class service {
    Map<Integer,Warehouse> a = new HashMap<>();
    public Warehouse Check(int id){

        if (check(id)){

            return a.get(id);
        }
        else {
            return new Warehouse(id,"Not Valid",0);
        }

    }

    private boolean check(int id) {

        return a.containsKey(id);
    }
        public void Add (Warehouse warehouse,int warehouseid){
        a.put(warehouseid,warehouse);
        }

}
