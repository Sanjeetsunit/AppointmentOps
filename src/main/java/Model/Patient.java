package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient {
   @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  int id ;
    private String Name ;
    private String email ;

}
