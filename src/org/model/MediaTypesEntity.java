package org.model;

import javax.persistence.*;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "media_types", schema = "", catalog = "")
public class MediaTypesEntity {
    @Id
    private int mediaTypeId;
    private String name;

    @Basic
    @Column(name = "MediaTypeId")
    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediaTypesEntity that = (MediaTypesEntity) o;

        if (mediaTypeId != that.mediaTypeId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mediaTypeId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
