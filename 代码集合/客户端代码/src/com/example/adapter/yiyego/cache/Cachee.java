package com.example.adapter.yiyego.cache;

import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 

import android.graphics.Bitmap;
 
public  class Cachee {
    private Map<String, SoftReference<Bitmap>> cache = new HashMap<String, SoftReference<Bitmap>>();
    
   public Bitmap get(String id) {
        if (!cache.containsKey(id)) {
            return null;
        }
 
        SoftReference<Bitmap> ref = cache.get(id);
 
        return ref.get();
    }
 
    public void put(String id, Bitmap bitmap) {
        cache.put(id, new SoftReference<Bitmap>(bitmap));
    }
 
    public void clear() {
        cache.clear();
    }
}