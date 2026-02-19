buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // ✅ Kotlin DSL requires double quotes, not single quotes
        classpath("com.android.tools.build:gradle:8.3.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

// Optional: Kotlin DSL way to configure subprojects if needed
subprojects {
    repositories {
        google()
        mavenCentral()
    }
}
