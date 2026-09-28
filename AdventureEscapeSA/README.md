# Adventure Escape SA - Mobile App

A simple Android app built in **Kotlin**, with the informational screens
written in plain **HTML** (no CSS, no JavaScript). It has 12 screens:

1. **Home** - welcome page with your logo and the main menu
2. **About Us** - company info, founder, discount rules
3. **Adventure Packages** (menu) - links to the 4 packages below
4. **Ultimate Adventure Day**
5. **Family Explorer Package**
6. **Mountain Adventure Package**
7. **Corporate Team Challenge**
8. **Individual Activities** (menu) - links to the 3 activities below
9. **Ziplining Adventure**
10. **Kayaking Experience**
11. **Rock Climbing Session**
12. **Get a Quote** - a working discount calculator written in Kotlin

## How the discount calculator works
You pick an activity/package and type in how many bookings you're making.
The app then applies the discount rules automatically:
- 1 booking = no discount
- 2 bookings = 5% off
- 3 bookings = 10% off
- more than 3 bookings = 15% off

## Project structure
```
AdventureEscapeSA/
  app/
    src/main/
      java/com/adventureescapesa/app/   <- all the Kotlin code
      assets/                            <- the plain HTML pages + logo
      res/layout/                        <- the screen layouts
      AndroidManifest.xml
    build.gradle.kts
  build.gradle.kts
  settings.gradle.kts
```

## How to open and run it

### Option A - VS Code (editing only)
1. Open the `AdventureEscapeSA` folder in VS Code.
2. Install the **Kotlin** extension (and optionally the **Android iOS Emulator**
   extension) from the Extensions tab.
3. You can read and edit all the `.kt` and `.html` files straight away.

### Option B - Android Studio (to actually run/see the app)
VS Code can edit the code, but to run the app on a phone or emulator you
need the Android SDK and emulator tools, which come built into
**Android Studio** (free, from developer.android.com/studio):
1. Open Android Studio -> Open -> select the `AdventureEscapeSA` folder.
2. Let it finish "Gradle Sync" (first time takes a few minutes).
3. Click the green ▶ Run button and choose an emulator (or a real phone
   plugged in with USB debugging on).

## About the logo
Only a quarter of your logo image came through in the PDF you uploaded
(the "EXPLORER" badge was cut off). The app currently uses that partial
image at `app/src/main/assets/logo.png`. Send me the full logo file and
I'll drop it straight in.

## Note on prices
The fees for **Kayaking Experience** and **Rock Climbing Session** were
not visible in the screenshots you shared, so R500 was used as a
placeholder for both. To change this, edit:
- `app/src/main/assets/activities.html` (the text customers see)
- `app/src/main/java/com/adventureescapesa/app/BookingActivity.kt`
  (the actual price used in the calculator - search for `R.id.radioKayaking`
  and `R.id.radioRockClimbing`)
