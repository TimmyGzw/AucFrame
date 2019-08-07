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

    //  appConfig 配置的是可以跑app的模块,git 提交务必只包含launcher
    static appConfig = ['launcher']

    // pkgConfig 配置的是要依赖的功能包,为空则依赖全部,git 提交务必为空
    static pkgConfig = []

    static depConfig = [
            feature      : [
                    launcher: [
                            app: new DepConfig(":feature:launcher:app")
                    ],
                    feature0: [
                            app   : new DepConfig(":feature:feature0:app"),
                            pkg   : new DepConfig(true, ":feature:feature0:pkg", "com.timmy:feature-feature0-pkg:1.0", true),
                            export: new DepConfig(":feature:feature0:export")
                    ],
                    feature1: [
                            app   : new DepConfig(":feature:feature1:app"),
                            pkg   : new DepConfig(true, ":feature:feature1:pkg", "com.timmy:feature-feature1-pkg:1.0", true),
                            export: new DepConfig(":feature:feature1:export"),

                    ]
            ],
            lib          : [
                    base  : new DepConfig(":lib:base"),
                    common: new DepConfig(":lib:common")
            ],
            plugin       : [
                    gradle            : new DepConfig("com.android.tools.build:gradle:3.5.0-rc02"),
                    kotlin            : new DepConfig("org.jetbrains.kotlin:kotlin-gradleplugin:$kotlin_version"),
                    kotlin_stdlib_jdk7: new DepConfig("org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlin_version"),
                    core_ktx          : new DepConfig("androidx.core:core-ktx:1.0.2")
            ],
            support      : [
                    appcompat       : new DepConfig("androidx.appcompat:appcompat:1.0.2"),
                    constraintlayout: new DepConfig("androidx.constraintlayout:constraintlayout:1.1.3"),
                    material        : new DepConfig("com.google.android.material:material:1.1.0-alpha09"),
            ],
            utilcode     : new DepConfig("com.blankj:utilcode:1.25.0"),
            free_proguard: new DepConfig("com.blankj:free-proguard:1.0.1"),
            swipe_panel  : new DepConfig("com.blankj:swipe-panel:1.1"),
            leakcanary   : [
                    android         : new DepConfig("com.squareup.leakcanary:leakcanary-android:$leakcanary_version"),
                    android_no_op   : new DepConfig("com.squareup.leakcanary:leakcanary-android-no-op:$leakcanary_version"),
                    support_fragment: new DepConfig("com.squareup.leakcanary:leakcanary-support-fragment:$leakcanary_version"),
            ]
    ]
}