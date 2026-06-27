-keep class com.ffxit.** { *; }
-keep class com.ffxit.cheat.** { *; }
-keepclassmembers class com.ffxit.** { *; }

-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver

-dontwarn kotlin.**
-dontwarn org.jetbrains.**
-dontwarn androidx.**

-verbose