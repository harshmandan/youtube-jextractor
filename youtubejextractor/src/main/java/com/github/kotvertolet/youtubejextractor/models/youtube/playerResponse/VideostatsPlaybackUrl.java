package com.github.kotvertolet.youtubejextractor.models.youtube.playerResponse;

public class VideostatsPlaybackUrl {
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Override
    public String toString() {
        return
                "VideostatsPlaybackUrl{" +
                        "baseUrl = '" + baseUrl + '\'' +
                        "}";
    }
}
