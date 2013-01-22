package com.sbrian.simplegraphics;

import java.awt.Dimension;
import java.awt.Point;

public class RealPositions {

    public static int DEFAULT_MAX_X = 100;
    public static int DEFAULT_MAX_Y = 100;
    public static int DEFAULT_MIN_X = -100;
    public static int DEFAULT_MIN_Y = -100;
    public static float DEFAULT_PX_PER_UNIT = 3;

    private int maxX;
    private int maxY;
    private int minX;
    private int minY;
    private float pixelsPerUnit;

    public RealPositions() {
	this(DEFAULT_MIN_X, DEFAULT_MAX_X, DEFAULT_MIN_Y, DEFAULT_MAX_Y,
		DEFAULT_PX_PER_UNIT);
    }

    public RealPositions(int minX, int maxX, int minY, int maxY, float pixelsPerUnit) {
	this.minX = minX;
	this.maxX = maxX;
	this.minY = minY;
	this.maxY = maxY;
	this.pixelsPerUnit = pixelsPerUnit;
    }

    public Dimension getDimension() {
	return new Dimension(getRealWidth(), getRealHeight());
    }

    public int getRealWidth() {
	return (int) Math.floor( (maxX - minX + 1) * pixelsPerUnit);
    }

    public int getRealHeight() {
	return (int) Math.floor( (maxY - minY + 1) * pixelsPerUnit);
    }

    public int getRealXAxis() {
	return getRealX(0);
    }
    
    public Point getRealXAxisPoint(int y) {
	return new Point(getRealXAxis(), getRealY(y));
    }
    
    public int getRealYAxis() {
	return getRealY(0);
    }
    
    public Point getRealYAxisPoint(int x) {
	return new Point(getRealX(x), getRealYAxis());
    }
    
    public int getRealX(int x) {
	return (int)( ((int) x - minX) * pixelsPerUnit); 
    }
    
    public int getRealXFromPoint(Point p) {
	return getRealX(p.x);
    }

    public int getRealY(int y) {
	return (int)( (maxY - (int) y) * pixelsPerUnit);
    }
    
    public int getRealYFromPoint(Point p) {
	return getRealY(p.y);
    }

    public float getPixelsPerUnit() {
	return pixelsPerUnit;
    }
    
    public int getMinX() {
	return minX;
    }
    
    public int getMinY() {
	return minY;
    }
    
    public int getMaxX() {
	return maxX;
    }
    
    public int getMaxY() {
	return maxY;
    }
}
