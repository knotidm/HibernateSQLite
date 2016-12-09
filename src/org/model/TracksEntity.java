package org.model;

import javax.persistence.*;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "tracks", schema = "", catalog = "")
public class TracksEntity {
    @Id
    private int trackId;
    private String name;
    private Integer albumId;
    private int mediaTypeId;
    private Integer genreId;
    private String composer;
    private int milliseconds;
    private Integer bytes;
    private double unitPrice;

    @Basic
    @Column(name = "TrackId")
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "AlbumId")
    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    @Basic
    @Column(name = "MediaTypeId")
    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    @Basic
    @Column(name = "GenreId")
    public Integer getGenreId() {
        return genreId;
    }

    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }

    @Basic
    @Column(name = "Composer")
    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    @Basic
    @Column(name = "Milliseconds")
    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    @Basic
    @Column(name = "Bytes")
    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    @Basic
    @Column(name = "UnitPrice")
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TracksEntity that = (TracksEntity) o;

        if (trackId != that.trackId) return false;
        if (mediaTypeId != that.mediaTypeId) return false;
        if (milliseconds != that.milliseconds) return false;
        if (Double.compare(that.unitPrice, unitPrice) != 0) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (albumId != null ? !albumId.equals(that.albumId) : that.albumId != null) return false;
        if (genreId != null ? !genreId.equals(that.genreId) : that.genreId != null) return false;
        if (composer != null ? !composer.equals(that.composer) : that.composer != null) return false;
        if (bytes != null ? !bytes.equals(that.bytes) : that.bytes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = trackId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (albumId != null ? albumId.hashCode() : 0);
        result = 31 * result + mediaTypeId;
        result = 31 * result + (genreId != null ? genreId.hashCode() : 0);
        result = 31 * result + (composer != null ? composer.hashCode() : 0);
        result = 31 * result + milliseconds;
        result = 31 * result + (bytes != null ? bytes.hashCode() : 0);
        temp = Double.doubleToLongBits(unitPrice);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
