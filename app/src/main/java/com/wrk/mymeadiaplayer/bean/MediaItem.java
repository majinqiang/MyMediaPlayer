package com.wrk.mymeadiaplayer.bean;

import java.io.Serializable;

/**
 * Created by MrbigW on 2016/9/28.
 * weChat:1024057635
 * Github:MrbigW
 * Usage: 一个视频或者一个音频
 * -------------------=.=------------------------
 */

public class MediaItem implements Serializable {

    private String name;
    private long duration;
    private long size;
    private String artist;
    private String data;

    public MediaItem() {
    }

    public MediaItem(long duration, String name, long size, String artist, String data) {
        this.duration = duration;
        this.name = name;
        this.size = size;
        this.artist = artist;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MediaItem{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", size=" + size +
                ", artist='" + artist + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
