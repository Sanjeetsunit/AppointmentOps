package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
