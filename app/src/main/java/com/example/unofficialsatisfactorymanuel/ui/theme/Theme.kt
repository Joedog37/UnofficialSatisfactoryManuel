package com.example.unofficialsatisfactorymanuel.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.colorResource
import androidx.core.view.WindowCompat
import com.example.unofficialsatisfactorymanuel.R

@Composable
fun MyCleanComposeAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // User choice to enable/disable dynamic color
    content: @Composable () -> Unit,
) {
    // Define the color scheme using a single set of semantic names.
    // The system will pick the correct value from values/colors.xml or values-night/colors.xml
    // based on the darkTheme flag.

    val appLightColorScheme = lightColorScheme(
        primary = colorResource(R.color.purple_500),
        onPrimary = colorResource(R.color.white),
        primaryContainer = colorResource(R.color.purple_200),
        onPrimaryContainer = colorResource(R.color.purple_700),
        secondary = colorResource(R.color.teal_200),
        onSecondary = colorResource(R.color.black),
        background = colorResource(R.color.white),
        onBackground = colorResource(R.color.black),
        surface = colorResource(R.color.white),
        onSurface = colorResource(R.color.black),
    )

    val appDarkColorScheme = darkColorScheme(
        primary = colorResource(R.color.purple_200),
        onPrimary = colorResource(R.color.black),
        primaryContainer = colorResource(R.color.purple_700),
        onPrimaryContainer = colorResource(R.color.purple_200),
        secondary = colorResource(R.color.teal_200),
        onSecondary = colorResource(R.color.black),
        // Ensure these dark theme specific colors are defined in values-night/colors.xml
        // OR define them with generic names in values/colors.xml and override in values-night/colors.xml
        // For example, if you have:
        // values/colors.xml: <color name="app_background_dark">#121212</color> (as a default)
        // values-night/colors.xml: <color name="app_background_dark">#0A0A0A</color> (specific dark override)
        // Then you'd use R.color.app_background_dark here.
        // For simplicity with the provided errors, I'll assume you have specific dark colors defined
        // or will now define them consistently.
        // If dark_grey_background, white_text_on_dark, etc. are ONLY for dark theme,
        // they should be defined in values-night/colors.xml AND have a base definition
        // in values/colors.xml (even if that base definition is one of your light theme colors,
        // just to satisfy the resource merger).
        //
        // A cleaner way is to define generic names like:
        // R.color.app_background, R.color.app_on_background, R.color.app_surface, R.color.app_on_surface
        // And have their light versions in values/colors.xml and dark versions in values-night/colors.xml
        background = colorResource(R.color.dark_grey_background), // Example: Define this in values/ AND values-night/
        onBackground = colorResource(R.color.white_text_on_dark), // Example: Define this in values/ AND values-night/
        surface = colorResource(R.color.dark_grey_surface),       // Example: Define this in values/ AND values-night/
        onSurface = colorResource(R.color.white_text_on_dark),   // Example: Define this in values/ AND values-night/

    )

    val colorScheme = when {
        dynamicColor && true -> { // Ensure dynamicColor is available
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> appDarkColorScheme
        else -> appLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography, // <-- UNCOMMENT THIS LINE
        // shapes = Shapes,
        content = content
    )
}