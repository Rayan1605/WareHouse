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
    public Warehouse Check(Product product){

        if (check(product.getWarehouseId())){

            Warehouse spare = a.get(product.getWarehouseId());

            if (product.getQuantity() > spare.getCapacity()){
                return new Warehouse(product.getWarehouseId(), spare.getLocation(),0);
            }
            else {
                return new Warehouse(product.getWarehouseId(), spare.getLocation(),1);
            }
        }
        else {
            return new Warehouse(product.getWarehouseId(), "Not Valid",0);
        }

    }

    private boolean check(int id) {

        return a.containsKey(id);
    }
        public void Add (Warehouse warehouse,int warehouseid){
        a.put(warehouseid,warehouse);
        }

}
