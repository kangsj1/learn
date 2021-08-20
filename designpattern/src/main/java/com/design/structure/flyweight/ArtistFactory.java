package com.design.structure.flyweight;

import java.util.Hashtable;

public class ArtistFactory {
    Hashtable pool = new Hashtable();

    Artist getArtist(String key){
        Artist result;
        result = (Artist)pool.get(key);
        ////产生新的 Artist
        if(result == null) {
            result = new Artist(key);
            pool.put(key,result);
        }
        return result;
    }

}
