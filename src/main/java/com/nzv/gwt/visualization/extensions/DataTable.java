package com.nzv.gwt.visualization.extensions;

import com.google.gwt.core.client.JavaScriptObject;

public class DataTable extends com.google.gwt.visualization.client.DataTable {

	public static native DataTable create() /*-{
		return new $wnd.google.visualization.DataTable();
	}-*/;
	
	public static native DataTable create(JavaScriptObject jso, double version) /*-{
	    return new $wnd.google.visualization.DataTable(jso, version);
	}-*/;
	
	public static native DataTable create(JavaScriptObject jso) /*-{
		return new $wnd.google.visualization.DataTable(jso);
	}-*/;
	
	protected DataTable() {}
	
	public final native int addTooltipColumn(DataTable data) /*-{
		return data.addColumn({type:'string', role:'tooltip'});
	}-*/;
	
	public final native int addAnnotationColumn(DataTable data) /*-{
		return data.addColumn({type:'string', role:'annotation'});
	}-*/;
	
	public final native int addAnnotationTextColumn(DataTable data) /*-{
		return data.addColumn({type:'string', role:'annotationText'});
	}-*/;
	
	public final native int addStyleColumn(DataTable data) /*-{
		return data.addColumn({type: 'string', role: 'style'});
	}-*/;

}
