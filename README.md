# LinkAndScrollMovement

LinkAndScrollMovement is an enhanced version of LinkMovementMethod which allows scrolling a TextView inside a scrollable parent view.
While scrolling, the links inside the TextView stay locked until next click event.

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
