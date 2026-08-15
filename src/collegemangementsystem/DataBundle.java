/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package collegemangementsystem;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Pramod Patil
 */
public class DataBundle implements Serializable{
    private HashMap<String, Object> data;

    public DataBundle() {
        data = new HashMap<>();
    }

    // Add data to the bundle
    public void put(String key, Object value) {
        data.put(key, value);
    }

    // Retrieve data from the bundle
    public Object get(String key) {
        return data.get(key);
    }
}
