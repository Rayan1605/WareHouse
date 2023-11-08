package Controller;

import Entity.Product;
import Entity.Warehouse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

     @GetMapping
      public Warehouse Check(Product product){


     }

}
