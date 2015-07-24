package com.ticotrack.util;

import java.util.*;

/**
*** A container for pixel width and height
**/

public class PixelDimension
    implements Cloneable
{

    // ------------------------------------------------------------------------

    private int width  = 0;
    private int height = 0;
    
    /**
    *** Constructor
    *** @param w The width of the pixel
    *** @param h The height of the pixel
    **/
    public PixelDimension(int w, int h)
    {
        this.setWidth( w);
        this.setHeight(h);
    }
    
    /**
    *** Copy constructor
    *** @param pd The PixelDimension to copy
    **/
    public PixelDimension(PixelDimension pd)
    {
        this.setWidth( (pd != null)? pd.getWidth()  : 0);
        this.setHeight((pd != null)? pd.getHeight() : 0);
    }

    // ------------------------------------------------------------------------

    /**
    *** Returns a copy of this PixelDimension
    *** @return A copy of this PixelDimension object
    **/
    public Object clone()
    {
        return new PixelDimension(this);
    }

    // ------------------------------------------------------------------------

    /**
    *** Sets the witdh of the pixel
    *** @param w The width of the pixel
    **/
    public void setWidth(int w)
    {
        this.width = w;
    }

    /**
    *** Gets the width of the pixel
    *** @return The width of the pixel
    **/
    public int getWidth()
    {
        return this.width;
    }

    // ------------------------------------------------------------------------

    /**
    *** Sets the height of the pixel
    *** @param h The height of the pixel
    **/
    public void setHeight(int h)
    {
        this.height = h;
    }

    /**
    *** Gets the height of the pixel
    *** @return The height of the pixel
    **/
    public int getHeight()
    {
        return this.height;
    }

    // ------------------------------------------------------------------------

    /**
    *** Returns ture if the pixel dimensions are valid
    *** @return True if the pixel dimensions are valid
    **/
    public boolean isValid()
    {
        return (this.width > 0) && (this.height > 0);
    }

    // ------------------------------------------------------------------------

    /**
    *** Returns a String representation of this instance
    *** @return String representation of this instance
    **/
    public String toString()
    {
        StringBuffer sb= new StringBuffer();
        sb.append("W=").append(this.getWidth());
        sb.append(" ");
        sb.append("H=").append(this.getHeight());
        return sb.toString();
    }

    // ------------------------------------------------------------------------

}
