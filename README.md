# LinkAndScrollMovement


This Android library unites ScrollingMovementMethod and LinkMovementMethod to make a TextView scrollable and clickable.
While scrolling, the clickable spans inside the TextView stay locked until next tap event.

Project Integration:

[![](https://jitpack.io/v/nuclearfog/LinkAndScrollMovement.svg)](https://jitpack.io/#nuclearfog/LinkAndScrollMovement)



Usage:

```xml
<TextView
    android:id="@+id/text"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:linksClickable="true"
    android:scrollbars="vertical"
    android:fadeScrollbars="false"
    android:maxLines="10" />
```
```java
TextView textview = findViewById(R.id.text);
textview.setMovementMethod(LinkAndScrollMovement.getInstance());
```
