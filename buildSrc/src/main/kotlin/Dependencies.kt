object Dependencies {

    // Kotlin
    const val CORE_KTX_DEPENDENCY =
        "androidx.core:core-ktx:${Versions.CORE_KTX_VERSION}"

    // Coroutines
    const val COROUTINES_CORE_DEPENDENCY =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES_CORE_VERSION}"
    const val COROUTINES_ANDROID_DEPENDENCY =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES_ANDROID_VERSION}"

    // AppCompat
    const val APP_COMPAT_DEPENDENCY =
        "androidx.appcompat:appcompat:${Versions.APP_COMPAT_VERSION}"

    // UI
    const val MATERIAL_DEPENDENCY =
        "com.google.android.material:material:${Versions.MATERIAL_VERSION}"

    // ViewModel
    const val LIVE_DATA_KTX_DEPENDENCY =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIVE_DATA_KTX_VERSION}"
    const val VIEW_MODEL_KTX_DEPENDENCY =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.VIEW_MODEL_KTX_VERSION}"

    // Koin
    const val KOIN_CORE_DEPENDENCY =
        "io.insert-koin:koin-core:${Versions.KOIN_CORE_VERSION}"
    const val KOIN_ANDROID_DEPENDENCY =
        "io.insert-koin:koin-android:${Versions.KOIN_ANDROID_VERSION}"
    const val KOIN_ANDROID_COMPAT_DEPENDENCY =
        "io.insert-koin:koin-android-compat:${Versions.KOIN_ANDROID_COMPAT_VERSION}"

    // Test
    const val JUNIT_DEPENDENCY =
        "junit:junit:${Versions.JUNIT_VERSION}"
    const val TEST_EXT_JUNIT_DEPENDENCY =
        "androidx.test.ext:junit:${Versions.TEST_EXT_JUNIT_VERSION}"
    const val ESPRESSO_DEPENDENCY =
        "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_VERSION}"
}