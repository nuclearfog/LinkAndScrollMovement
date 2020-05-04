# LinkAndScrollMovement


This Android library unites ScrollingMovementMethod and LinkMovementMethod to make a TextView scrollable and clickable.
While scrolling, the clickable spans inside the TextView stay locked until next tap event.

Project Integration:

[![](https://jitpack.io/v/nuclearfog/LinkAndScrollMovement.svg)](https://jitpack.io/#nuclearfog/LinkAndScrollMovement)



Usage:
```java
TextView textview = findViewById(R.id.text);
textview.setMovementMethod(LinkAndScrollMovement.getInstance());
```
