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
    public Image(){}


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

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
