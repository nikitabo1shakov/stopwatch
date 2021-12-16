plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.nikitabolshakov.stopwatch"
        minSdk = 24
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Kotlin
    implementation(Dependencies.CORE_KTX_DEPENDENCY)

    // Coroutines
    implementation(Dependencies.COROUTINES_CORE_DEPENDENCY)
    implementation(Dependencies.COROUTINES_ANDROID_DEPENDENCY)

    // AppCompat
    implementation(Dependencies.APP_COMPAT_DEPENDENCY)

    // UI
    implementation(Dependencies.MATERIAL_DEPENDENCY)

    // ViewModel
    implementation(Dependencies.LIVE_DATA_KTX_DEPENDENCY)
    implementation(Dependencies.VIEW_MODEL_KTX_DEPENDENCY)

    // Koin
    implementation(Dependencies.KOIN_CORE_DEPENDENCY)
    implementation(Dependencies.KOIN_ANDROID_DEPENDENCY)
    implementation(Dependencies.KOIN_ANDROID_COMPAT_DEPENDENCY)

    // Test
    testImplementation(Dependencies.JUNIT_DEPENDENCY)
    androidTestImplementation(Dependencies.TEST_EXT_JUNIT_DEPENDENCY)
    androidTestImplementation(Dependencies.ESPRESSO_DEPENDENCY)
}