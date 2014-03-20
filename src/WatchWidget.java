import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import android.R;
import android.annotation.SuppressLint;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.webkit.WebView.FindListener;
import android.widget.RemoteViews;
import java.text.DateFormat;

@SuppressLint("NewApi")
public class WatchWidget extends AppWidgetProvider {
	

    @Override
    public void onUpdate( Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds )
    {
        RemoteViews remoteViews;
        ComponentName watchWidget;
        DateFormat format = SimpleDateFormat.getTimeInstance( SimpleDateFormat.MEDIUM, Locale.getDefault() );
        remoteViews = new RemoteViews( context.getPackageName(), R.layout.list_content );
        watchWidget = new ComponentName( context, WatchWidget.class );
        remoteViews.setTextViewText( R.id.content, "Time = " + format.format( new Date()));
        appWidgetManager.updateAppWidget( watchWidget, remoteViews );
    }
}