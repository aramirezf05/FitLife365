plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("org.sonarqube") version "4.4.1.3373"
}

sonar {
    properties {
        property("sonar.projectKey", "aramirezf05_fitlife365")
        property("sonar.organization", "aramirezf05")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

android {
    namespace = "es.unex.giiis.fitlife365"
    compileSdk = 34

    defaultConfig {
        applicationId = "es.unex.giiis.fitlife365"
        minSdk = 31
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
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
    viewBinding {
        enable = true
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val activity_ktx = "1.8.0"
    val mockito_version = "4.6.1"
    val mock_web_server_version = "4.9.1"
    val retrofit_version = "2.9.0"

    implementation ("androidx.activity:activity-ktx:$activity_ktx")
    val fragment = "1.6.2"
    implementation ("androidx.fragment:fragment-ktx:$fragment")
    val core_ktx = "1.9.0"
    implementation("androidx.core:core-ktx:$core_ktx")
    val appcompat = "1.6.1"
    implementation("androidx.appcompat:appcompat:$appcompat")
    val material = "1.10.0"
    implementation("com.google.android.material:material:$material")
    val constraintlayout = "2.1.4"
    implementation("androidx.constraintlayout:constraintlayout:$constraintlayout")
    val lifecycle = "2.6.2"
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle")
    val compose_bom = "2023.03.00"
    implementation(platform("androidx.compose:compose-bom:$compose_bom"))
    val preferences = "1.2.1"
    implementation("androidx.preference:preference:$preferences")
    val common = "2.6.0"
    implementation("androidx.room:room-common:$common")
    val junit = "4.13.2"
    testImplementation("junit:junit:$junit")
    val junit_test = "1.2.0-alpha02"
    androidTestImplementation("androidx.test.ext:junit:$junit_test")
    val espresso_core = "3.6.0-alpha02"
    androidTestImplementation("androidx.test.espresso:espresso-core:$espresso_core")
    val runner = "1.5.1"
    androidTestImplementation("androidx.test:runner:$runner")
    val rules = "1.6.0-alpha02"
    androidTestImplementation("androidx.test:rules:$rules")
    val preference_ktx = "1.2.1"
    implementation("androidx.preference:preference-ktx:$preference_ktx")
    val gson = "2.10.1"
    implementation("com.google.code.gson:gson:$gson")
    val converter_gson = "2.9.0"
    implementation("com.squareup.retrofit2:converter-gson:$converter_gson")
    implementation("com.squareup.retrofit2:retrofit:$retrofit_version")
    implementation("com.squareup.okhttp3:logging-interceptor:$mock_web_server_version")
    val glide ="5.0.0-rc01"
    implementation("com.github.bumptech.glide:glide:$glide")
    val esspresso_contrib = "3.6.0-alpha02"
    androidTestImplementation("androidx.test.espresso:espresso-contrib:$esspresso_contrib")
    val room_version = "2.5.0"

    implementation("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")

    // To use Kotlin Symbol Processing (KSP)
    ksp("androidx.room:room-compiler:$room_version")


    // optional - Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$room_version")

    // optional - Test helpers
    testImplementation("androidx.room:room-testing:$room_version")

    val tracing = "1.1.0"
    debugImplementation("androidx.tracing:tracing:$tracing")

    testImplementation("org.mockito:mockito-core:$mockito_version")
    androidTestImplementation("org.mockito:mockito-android:$mockito_version")
    testImplementation("org.mockito:mockito-junit-jupiter:$mockito_version")
    testImplementation("com.squareup.okhttp3:mockwebserver:$mock_web_server_version")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:$mock_web_server_version")
    testImplementation("com.squareup.okhttp3:okhttp:$mock_web_server_version")
    androidTestImplementation("com.squareup.okhttp3:okhttp:")
    testImplementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
    androidTestImplementation("com.squareup.retrofit2:converter-gson:$retrofit_version")
}