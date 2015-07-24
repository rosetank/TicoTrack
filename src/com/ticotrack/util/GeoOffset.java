package com.ticotrack.util;

import java.util.*;

/**
*** A container for a single latitude/longitude offset value pair
**/

public class GeoOffset
    implements Cloneable
{

    // ------------------------------------------------------------------------

    private double offsetLatitude  = 0.0;
    private double offsetLongitude = 0.0;

    /** 
    *** Constructor
    *** @param ofsLat The latitude offset
    *** @param ofsLon The longitude offset
    **/
    public GeoOffset(double ofsLat, double ofsLon)
    {
        this.setOffsetLatitude(ofsLat);
        this.setOffsetLongitude(ofsLon);
    }

    /** 
    *** Copy Constructor
    *** @param gb The other GeoOffset
    **/
    public GeoOffset(GeoOffset gb)
    {
        if (gb != null) {
            this.setOffsetLatitude( gb.getOffsetLatitude() );
            this.setOffsetLongitude(gb.getOffsetLongitude());
        }
    }

    // ------------------------------------------------------------------------

    /**
    *** Returns a clone of this GeoOffset
    *** @return A clone of this GeoOffset
    **/
    public Object clone()
    {
        return new GeoOffset(this);
    }

    // ------------------------------------------------------------------------

    /**
    *** Sets the Latitude offset
    *** @param dLat The latitude offset
    **/
    public void setOffsetLatitude(double dLat)
    {
        this.offsetLatitude = dLat;
    }

    /**
    *** Gets the Latitude offset
    *** @return The latitude offset
    **/
    public double getOffsetLatitude()
    {
        return this.offsetLatitude;
    }

    // ------------------------------------------------------------------------

    /**
    *** Sets the Longitude offset
    *** @param dLon The longitude offset
    **/
    public void setOffsetLongitude(double dLon)
    {
        this.offsetLongitude = dLon;
    }

    /**
    *** Gets the Longitude offset
    *** @return The longitude offset
    **/
    public double getOffsetLongitude()
    {
        return this.offsetLongitude;
    }

    // ------------------------------------------------------------------------

}
