# RatingBar
# How to

To get a Git project into your build:

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency
```
dependencies {
    compile 'com.github.yangmbin:RatingBar:-SNAPSHOT'
}
```

## Example
Declare `RatingBar` in your XML with `app` attributes:
```
<com.ymb.ratingbar_lib.RatingBar
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:drawable_empty="@drawable/ic_star_empty"
    app:drawable_filled="@drawable/ic_star_filled"
    app:drawable_half="@drawable/ic_star_half"
    app:drawable_margin="4dp"
    app:drawable_size="24dp"
    app:is_indicator="false"
    app:max_count="5"
    app:rating="3.5" />
```

## Screenshot
