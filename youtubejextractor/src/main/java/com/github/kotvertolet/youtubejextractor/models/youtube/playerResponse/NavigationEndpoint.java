package com.github.kotvertolet.youtubejextractor.models.youtube.playerResponse;

public class NavigationEndpoint {

    private String clickTrackingParams;
    private UrlEndpoint urlEndpoint;

    public String getClickTrackingParams() {
        return clickTrackingParams;
    }

    public void setClickTrackingParams(String clickTrackingParams) {
        this.clickTrackingParams = clickTrackingParams;
    }

    public UrlEndpoint getUrlEndpoint() {
        return urlEndpoint;
    }

    public void setUrlEndpoint(UrlEndpoint urlEndpoint) {
        this.urlEndpoint = urlEndpoint;
    }

    @Override
    public String toString() {
        return
                "NavigationEndpoint{" +
                        "clickTrackingParams = '" + clickTrackingParams + '\'' +
                        ",urlEndpoint = '" + urlEndpoint + '\'' +
                        "}";
    }
}
