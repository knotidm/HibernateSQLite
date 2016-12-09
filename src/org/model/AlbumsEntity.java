package org.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "albums", schema = "", catalog = "")
public class AlbumsEntity {
    @Id
    private int albumId;
    private String title;
    private BigDecimal price;
    private int artistId;

    @Basic
    @Column(name = "AlbumId")
    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    @Basic
    @Column(name = "Title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "Price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "ArtistId")
    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlbumsEntity that = (AlbumsEntity) o;

        if (albumId != that.albumId) return false;
        if (artistId != that.artistId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = albumId;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + artistId;
        return result;
    }
}
