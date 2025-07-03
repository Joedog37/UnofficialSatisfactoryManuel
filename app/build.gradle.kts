plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.unofficialsatisfactorymanuel"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.unofficialsatisfactorymanuel"
        minSdk = 34
        targetSdk = 35
        versionCode = 2
        versionName = "0.1.0-alpha.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false // Consider setting to true for actual release builds
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    // It's good practice to enable desugaring if minSdk < 26 and you use Java 8+ APIs
    // If your minSdk is 26+ (yours is 34), this is less critical but doesn't hurt.
    // coreLibraryDesugaringEnabled = true
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3) // Single Material 3 dependency
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.preference.ktx)
    // The duplicate implementation(libs.androidx.material3) has been removed

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // If you enable coreLibraryDesugaring, you need this dependency as well:
    // coreLibraryDesugaring(libs.android.desugarJdkLibs) // Ensure 'libs.android.desugarJdkLibs' is defined in libs.versions.toml
}