package camt.se331.shoppingcart.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by พีรพัฒน์ on 29/3/2559.
 */
@Entity
public class Image {
    @Id
    @GeneratedValue
    private Long id;

    public Image(String fileName) {
        this.fileName = fileName;
    }

    String fileName;
    @Lob
    byte[] content;
    String contentType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Temporal(TemporalType.TIME)
    Date created;
}
