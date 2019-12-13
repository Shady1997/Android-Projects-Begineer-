package com.shady191997.townteam;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
NotificationManager nm;
int id=1;
    // This is the Notification Channel ID. More about this in the next section
    public static final String NOTIFICATION_CHANNEL_ID = "channel_id";
    //User visible Channel Name
    public static final String CHANNEL_NAME = "Notification Channel";
    // Importance applicable to all the notifications in this Channel
    int importance = NotificationManager.IMPORTANCE_DEFAULT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);

    }

    public void add(View view){
                Bitmap bmp= BitmapFactory.decodeResource(this.getResources(),R.drawable.download);

        //Notification channel should only be created for devices running Android 26
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, CHANNEL_NAME, importance);
            //Boolean value to set if lights are enabled for Notifications from this Channel
            notificationChannel.enableLights(true);
            //Boolean value to set if vibration are enabled for Notifications from this Channel
            notificationChannel.enableVibration(true);
            //Sets the color of Notification Light
            notificationChannel.setLightColor(Color.GREEN);
            //Set the vibration pattern for notifications. Pattern is in milliseconds with the format {delay,play,sleep,play,sleep...}
            notificationChannel.setVibrationPattern(new long[]{
                    500,
                    500,
                    500,
                    500,
                    500
            });
            //Sets whether notifications from these Channel should be visible on Lockscreen or not
            notificationChannel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
            NotificationCompat.Builder nb=new NotificationCompat.Builder(MainActivity.this,NOTIFICATION_CHANNEL_ID)
                    .setAutoCancel(true)
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setContentTitle("Weather")
                    .setContentText("there is a rain tommory ,take a way")
                    .setSmallIcon(R.drawable.download)
                    .setLargeIcon(bmp)
                    .setTicker("New message drom weather")
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .setContentInfo("this message provide you with indormation about weather tommory")
                    .setVibrate(new long[]{500,1000,500,1000,500} )
                    .setWhen(System.currentTimeMillis())
                    .setNumber(id);

            Intent m2n=new Intent(MainActivity.this,Main2Activity.class);
            TaskStackBuilder tsb=TaskStackBuilder.create(this);

            tsb.addParentStack(Main2Activity.class);
            tsb.addNextIntent(m2n);

            PendingIntent resultpendingintent=tsb.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
            nb.setContentIntent(resultpendingintent);
            nb.addAction(R.drawable.download,"read it",resultpendingintent);

            nm.notify(id,nb.build());
            id++;
        }
        else {
            NotificationCompat.Builder nb = new NotificationCompat.Builder(MainActivity.this, "facebook")
                    .setAutoCancel(true)
                    .setDefaults(Notification.DEFAULT_ALL)
                    .setContentTitle("Weather")
                    .setContentText("there is a rain tommory ,take a way")
                    .setSmallIcon(R.drawable.download)
                    .setLargeIcon(bmp)
                    .setTicker("New message drom weather")
                    .setPriority(NotificationCompat.PRIORITY_HIGH)
                    .setContentInfo("this message provide you with indormation about weather tommory")
                    .setVibrate(new long[]{500, 1000, 500, 1000, 500})
                    .setWhen(System.currentTimeMillis())
                    .setNumber(id);

            Intent m2n = new Intent(MainActivity.this, Main2Activity.class);
            TaskStackBuilder tsb = TaskStackBuilder.create(this);

            tsb.addParentStack(Main2Activity.class);
            tsb.addNextIntent(m2n);

            PendingIntent resultpendingintent = tsb.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
            nb.setContentIntent(resultpendingintent);
            nb.addAction(R.drawable.download, "read it", resultpendingintent);

            nm.notify(id, nb.build());
            id++;
        }

    }

    public void remove(View view) {
        nm.cancelAll();
    }

}
























/*        notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // This is the Notification Channel ID. More about this in the next section
        public static final String NOTIFICATION_CHANNEL_ID = "channel_id";
       //User visible Channel Name
        public static final String CHANNEL_NAME = "Notification Channel";
       // Importance applicable to all the notifications in this Channel
        int importance = NotificationManager.IMPORTANCE_DEFAULT;
        //Notification channel should only be created for devices running Android 26
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, CHANNEL_NAME, importance);
            //Boolean value to set if lights are enabled for Notifications from this Channel
            notificationChannel.enableLights(true);
            //Boolean value to set if vibration are enabled for Notifications from this Channel
            notificationChannel.enableVibration(true);
            //Sets the color of Notification Light
            notificationChannel.setLightColor(Color.GREEN);
            //Set the vibration pattern for notifications. Pattern is in milliseconds with the format {delay,play,sleep,play,sleep...}
            notificationChannel.setVibrationPattern(new long[] {
                    500,
                    500,
                    500,
                    500,
                    500
            });
            //Sets whether notifications from these Channel should be visible on Lockscreen or not
            notificationChannel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
        }
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.createNotificationChannel(notificationChannel);
*/




//        Intent intent=new Intent(this,Main2Activity.class);
//        TaskStackBuilder stackBuilder=TaskStackBuilder.create(this);
//        PendingIntent resultpendinginintented1=stackBuilder.getPendingIntent(1,PendingIntent.FLAG_UPDATE_CURRENT);
//        PendingIntent resultpendinginintented2=stackBuilder.getPendingIntent(0,PendingIntent.FLAG_CANCEL_CURRENT);
//        Intent intent = new Intent(this, Main2Activity.class);
//        PendingIntent pendingIntent1 = PendingIntent.getBroadcast(this, 1001, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//        PendingIntent pendingIntent2 = PendingIntent.getBroadcast(this, 1002, intent, PendingIntent.FLAG_CANCEL_CURRENT);
//        Bitmap bmp= BitmapFactory.decodeResource(this.getResources(),R.drawable.download);
//        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(MainActivity.this, "chating_CH_ID");
//         notificationBuilder.setAutoCancel(true)
//                            .setDefaults(Notification.DEFAULT_ALL)
//                            .setWhen(System.currentTimeMillis())
//                            .setSmallIcon(R.drawable.download)
//                            .setTicker("new message to show")
//                            .setPriority(NotificationCompat.PRIORITY_MAX) //or priority Default
//                            .setContentTitle("Default notification")
//                            .setContentText("Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
//                            .setContentInfo("Info")
//                            .setLargeIcon(bmp)
//                            .setVibrate(new long[]{500,5000,500,1000,500})
//                            .setNumber(id)
//                            .setContentIntent(pendingIntent1)
//                            .setContentIntent(pendingIntent2)
//                            .addAction(R.drawable.download,"reade",pendingIntent1)
//                            .addAction(R.drawable.download,"cancel",pendingIntent2);
//        notificationManager.notify(id, notificationBuilder.build());
//        id++;







//    int id=1;
//    NotificationManager notificationManager;
//    NewMessageNotification nmn=new NewMessageNotification();

//        nmn.notify(this,"hello",id);
//        id++;
//        nmn.cancel(this);




//reading notification
    //NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    //    //You just need the Channel ID to get reference of the Notification Channel
    //    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(NOTIFICATION_CHANNEL_ID);
    //    //Fetching the user visible name of the Channel
    //    CharSequence name = notificationChannel.getName();
    //    //Fetching the lockscreen visibilty of the notifications in this Channel
    //    int lockscreenVisibility = notificationChannel.getLockscreenVisibility();
    //    //Fetching the light color set for this Channel
    //    int color = notificationChannel.getLightColor();
    //    // Fetching vibration pattern for this channel
    //    long[] pattern = notificationChannel.getVibrationPattern();
    //




//delete notification
//NotificationManager notificationManager = getSystemService(NOTIFICATION_SERVICE);
//notificationManager.deleteNotificationChannel(NOTIFICATION_CHANNEL_ID);



//redirect user to notification channel settings
//Intent intent = new Intent(Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS);
////Unique Channel ID of the the particular Notification Channel
//intent.putExtra(Settings.EXTRA_CHANNEL_ID, NOTIFICATION_CHANNEL_ID);
////Package Name
//        intent.putExtra(Settings.EXTRA_APP_PACKAGE, getPackageName());
//        startActivity(intent);


//update notification by leave the same id

//cancel notification by
//1-.cancelAll();
//2-.cancel(notification_id);


//notificationcompat with big picture style
//Notification notification = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
//        .setContentTitle("This is the Title")
//        .setContentText("This is the sub text")
//        .setSmallIcon(R.drawable.icon)
//        .setStyle(new NotificationCompat.BigPictureStyle()
//                .bigPicture(BitmapFactory.decodeResource(getResources(), R.drawable.icon)))
//        .build();



//notifivationcompat inboxstyle
//Notification notification = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
//        .setContentTitle("This is the title")
//        .setContentText("This is the subtext")
//        .setSmallIcon(R.drawable.icon)
//        .setStyle(new NotificationCompat.InboxStyle()
//                .addLine("This is the first line")
//                .addLine("This is the second line")
//                .addLine("This is the third line"))
//        .build();


//notificationcompat in bigtextstyle
//Notification notification = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID)
//        .setContentTitle("This is the title")
//        .setContentText("This is the subtext")
//        .setSmallIcon(R.drawable.icon)
//        .setStyle(new NotificationCompat.BigTextStyle()
//                .bigText("This is the expandable content text"))
//        .build()


//action button for notification

//    Intent intent = new Intent(this, MyReceiver.class);
//    PendingIntent pendingIntent = PendingIntent.getBroadcast(this, 1002, intent, PendingIntent.FLAG_UPDATE_CURRENT);
//builder.addAction(R.drawable.icon, getResources().getString(R.string.app_name), pendingIntent);
/*
addAction taken in three parameters
1st Param Icon
2nd Param Title for the Action Button
3rd Param Pending Intent
*/

//setting content intent
//
///This intent will be fired when the notification is tapped
//        Intent intent = new Intent(this, MainActivity.class);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1001, intent, 0);
////Following will set the tap action
//        notificationBuilder.setContentIntent(pendingIntent);

//sound

//
//    setSound() takes in a Uri as the paramater. In this example I am using predefined Alarm Uri from Ringtone.
//        You can set any custom sound by just providing the Uri
//        */
//        notificationBuilder.setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM));