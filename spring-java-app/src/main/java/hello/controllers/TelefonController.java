package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.ArrayList;


@RestController
public class TelefonController {
  private List<Telefon> telefoane = new ArrayList<Persoana>();

  TelefonController() {
    Telefon t1 = new Telefon(1,"Apple", "256Gb, 2G","4s",123456222);
    Telefon t2 = new Telefon(2,"Apple", "64Gb, 1G","5s",234234324);
    Telefon t3 = new Telefon(3,"Apple", "112Gb,4G","6s",325435534);

    telefoane.add(t1);
    telefoane.add(t2);
    telefoane.add(t3);
  }

  @RequestMapping(value="/telefon", method = RequestMethod.GET)
  public List<Persoana> index() {
    return this.persoane;
  }

  @RequestMapping(value = "/telefon/{id}", method = RequestMethod.GET)
    public ResponseEntity show(@PathVariable("id") int id) {
        for (Telefon t : this.telefoane) {
            if (t.getId() == id) {
                return new ResponseEntity<Persoana>(p, new HttpHeaders(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/telefon/{id}", method = RequestMethod.DELETE, consumes="text/plain")
    public ResponseEntity remove(@PathVariable("id") int id) {
        for (Telefon t : this.telefoane) {
            if (t.getId() == id) {
                this.telefoane.remove(p);
                return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
            }
        }
        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }


    @RequestMapping(value="/telefon", method = RequestMethod.POST)
    public ResponseEntity create(@RequestBody Telefon t) {

//        Persoana newPerson = new Persoana(id,name);
        telefoane.add(p);
        String nume = t.getName();
        for(Telefon t_tmp : this.telefoane) {
            if(t_tmp.getMarcaTelefon().equals(MarcaTelefonTelefon)) {
                return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value="/telefon", method = RequestMethod.PUT)
    public ResponseEntity update(@RequestBody Persoana p) {


        int idTelefon = t.getID();
        for(Telefon t_tmp : this.telefoane) {
            if(t_tmp.getID()==(idTelefon)) {
                t_tmp.setID(t.getID());
                t_tmp.setMarcaTelefon(t.getMarcaTelefon());
                return new ResponseEntity<ArrayList<Telefon>>((ArrayList<Telefon>) telefoane, new HttpHeaders(), HttpStatus.OK);
            }
        }
        return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
    }



}

