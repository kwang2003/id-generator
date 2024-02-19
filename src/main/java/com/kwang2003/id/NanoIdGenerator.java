package com.kwang2003.id;

import io.viascom.nanoid.NanoId;

/**
 * @author kevin
 */
public class NanoIdGenerator implements IdGenerator {
    @Override
    public String generate() {
        String nanoId = NanoId.generate();
        return nanoId;
    }
}
