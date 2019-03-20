package com.zeniel.surl.service;

public interface URLConverterService {
    public String shortenURL(String localURL, String longUrl);
    public String getLongURLFromID(String uniqueID) throws Exception;
    public String formatLocalURLFromShortener(String localURL);
}
