dependencies {
    implementation("com.emergetools.test:relax:0.1.0")
}

// Enable debug for local running, but Emerge builds should be release for most realistic
// performance.
androidComponents {
    beforeVariants(selector().all()) {
        it.enable = it.buildType == "release" || it.buildType == "debug"
    }
}