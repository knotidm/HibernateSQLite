package org.model;

import javax.persistence.*;

/**
 * Created by Wojcimierz on 09.12.2016.
 */
@Entity
@Table(name = "playlist_track", schema = "", catalog = "")
public class PlaylistTrackEntity {
    @Id
    private int playlistId;
    private int trackId;

    @Basic
    @Column(name = "PlaylistId")
    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    @Basic
    @Column(name = "TrackId")
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaylistTrackEntity that = (PlaylistTrackEntity) o;

        if (playlistId != that.playlistId) return false;
        if (trackId != that.trackId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = playlistId;
        result = 31 * result + trackId;
        return result;
    }
}
