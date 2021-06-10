package allg.haw.se1lab.nutzer.datenzugriff.api.entitaeten;
import javax.persistence.Entity;

@Entity
public class Schueler extends Person {

   /* @Id
    @GeneratedValue
    private Long id;*/

    public Schueler(String name, String email) {
        super(name, email);
    }


    public Schueler() {
    }

 /*   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/
}