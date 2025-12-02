Sure! Based on the code you shared, here’s a professional **README.md** tailored for your Kotlin Android music app:

---

# 🎵 MusicApp – Kotlin Music Player

**MusicApp** is a modern and intuitive music player built entirely in Kotlin for Android. It allows users to browse, play, and manage audio files stored on their device with a sleek, interactive interface and customizable playback options.

---

## **Features**

* 📂 Browse and display all audio files from the device
* 🎶 Play, pause, skip, and repeat songs
* 🔀 Shuffle and repeat modes
* 🎨 Beautiful UI with album art and blurred backgrounds
* ⏱ Display song duration and playback progress
* 🖤 Add favorite songs (UI placeholder)
* 🌙 Dark-themed interface for comfortable night-time listening
* ⚡ Responsive design using Jetpack Compose

---

## **Screens / Components**

1. **Splash Screen** – Displays a splash screen on app launch.
2. **Song List Screen** – Displays all songs on the device and handles permissions.
3. **Player Screen** – Displays currently playing song with album art, waveform, and playback controls.
4. **PlayerActivity / SongListActivity / SplashActivity** – Activities managing navigation and UI.

---

## **Architecture & Libraries**

* **Kotlin** – Primary programming language
* **Jetpack Compose** – For building declarative UI
* **ExoPlayer** – Handles media playback
* **Coil** – Loads album art images
* **MediaStore** – Accesses device audio files
* **Accompanist Permissions** – Handles runtime audio permissions

---

## **Permissions**

The app requires runtime permission to read audio files from the device:

```kotlin
Manifest.permission.READ_MEDIA_AUDIO  // Android 13+ (TIRAMISU)
Manifest.permission.READ_EXTERNAL_STORAGE // Android <13
```

---

## **Usage**

1. Clone the repository:

```bash
git clone https://github.com/your-username/musicapp.git
```

2. Open in Android Studio and let it sync Gradle.
3. Build and run on a physical device or emulator.
4. Grant storage permissions when prompted to allow the app to fetch songs.
5. Browse songs and tap to play.

---

## **Project Structure**

```
com.example.musicapp
│
├─ data/          # Song model & MediaStore song fetching
├─ presentation/  # Activities and navigation
├─ ui/theme/      # Composables for UI (PlayerScreen, SongListScreen, SplashScreen)
├─ MainActivity.kt (or SongListActivity.kt)
└─ ...
```

---

## **Screenshots**

*(Add screenshots here when available for better presentation)*

---

## **Future Improvements**

* Implement playlists and favorites fully
* Support online streaming
* Add lyrics display
* Customizable themes
* Notifications & background playback controls

---

## **License**

This project is open-source under the MIT License.

---

