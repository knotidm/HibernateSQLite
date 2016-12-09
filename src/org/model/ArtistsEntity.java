package org.model;

import javax.persistence.*;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "artists", schema = "", catalog = "")
public class ArtistsEntity {
    @Id
    private int artistId;
    private String name;

    @Basic
    @Column(name = "ArtistId")
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
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

        ArtistsEntity that = (ArtistsEntity) o;

        if (artistId != that.artistId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = artistId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
