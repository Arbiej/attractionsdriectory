package pl.br.attractiondirectory.location;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Country extends Location {
    @Id
    private Long id;
    private String name;

}
