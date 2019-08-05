class Config {

    static applicationId = 'com.timmy.aucframe'
    static appName = 'AucFrame'

    static compileSdkVersion = 29
    static minSdkVersion = 21
    static targetSdkVersion = 29
    static versionCode = 1_000_000
    static versionName = '1.0.0'

    static kotlin_version = '1.3.41'
    static support_version = '27.1.1'
    static leakcanary_version = '1.6.3'

    static depConfig = [
            plugin       : [
                    gradle            : "com.android.tools.build:gradle:3.5.0-rc02",
                    kotlin            : "org.jetbrains.kotlin:kotlin-gradleplugin:$kotlin_version",
                    kotlin_stdlib_jdk7: "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version",
                    core_ktx          : "androidx.core:core-ktx:1.0.2"
            ],
            support      : [
                    appcompat       : "androidx.appcompat:appcompat:1.0.2",
                    constraintlayout: "androidx.constraintlayout:constraintlayout:1.1.3",
            ],
            utilcode     : "com.blankj:utilcode:1.25.0",
            free_proguard: "com.blankj:free-proguard:1.0.1",
            swipe_panel  : "com.blankj:swipe-panel:1.1",
            leakcanary   : [
                    android         : "com.squareup.leakcanary:leakcanaryandroid:$leakcanary_version",
                    android_no_op   : "com.squareup.leakcanary:leakcanaryandroid-no-op:$leakcanary_version",
                    support_fragment: "com.squareup.leakcanary:leakcanarysupport-fragment:$leakcanary_version",
            ]
    ]
}