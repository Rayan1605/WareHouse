package Controller;

import Entity.Product;
import Entity.Warehouse;
import Sevice.Service;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class controller {

    private final Service service;
     @GetMapping("/check")
      public Warehouse Check(Product product){

        return service.Check(product);

     }

}
