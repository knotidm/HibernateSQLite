package org.model;

import javax.persistence.*;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "playlists", schema = "", catalog = "")
public class PlaylistsEntity {
    @Id
    private int playlistId;
    private String name;

    @Basic
    @Column(name = "PlaylistId")
    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
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

        PlaylistsEntity that = (PlaylistsEntity) o;

        if (playlistId != that.playlistId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = playlistId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
