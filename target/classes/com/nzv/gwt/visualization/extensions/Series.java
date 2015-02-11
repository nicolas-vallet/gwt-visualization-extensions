package com.nzv.gwt.visualization.extensions;

import com.google.gwt.core.client.JavaScriptObject;

public class Series extends com.google.gwt.visualization.client.visualizations.corechart.Series {

protected Series() {}
	
	public static Series create() {
	    return JavaScriptObject.createObject().cast();
	  } 
	
	public final native void setPointShape(Shape pointShape) /*-{
		this.pointShape = pointShape;
    }-*/;
	
	public final native void setVisibleInLegend(boolean v) /*-{
		this.visibleInLegend = v;
	}-*/;
	
	public final native void setLineDashStyle(int[] s) /*-{
		this.lineDashStyle = s;
	}-*/;
}
