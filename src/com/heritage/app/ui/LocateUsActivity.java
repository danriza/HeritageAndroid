package com.heritage.app.ui;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;
import com.heritage.app.R;
import com.heritage.app.map.HeritageMapOverlay;

public class LocateUsActivity extends MapActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.locate_us_screen);
		
		MapView mapView = (MapView) findViewById(R.id.mapview);
		List<Overlay> mapOverlays = mapView.getOverlays();
		Drawable drawable = this.getResources().getDrawable(R.drawable.ic_launcher);
		HeritageMapOverlay itemizedoverlay = new HeritageMapOverlay(drawable, this);
		
		GeoPoint point = new GeoPoint(46779139,23618202);//46.779139,23.618202
		OverlayItem overlayitem = new OverlayItem(point, "Hello, just testing", "DAN");
		
		itemizedoverlay.addOverlay(overlayitem);
		mapOverlays.add(itemizedoverlay);
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	

}
